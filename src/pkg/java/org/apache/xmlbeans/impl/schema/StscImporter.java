/*   Copyright 2004 The Apache Software Foundation
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.xmlbeans.impl.schema;

import org.apache.xmlbeans.*;
import org.apache.xmlbeans.impl.xb.xsdschema.RedefineDocument.Redefine;
import org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument.Schema;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;

public class StscImporter {
    public static class SchemaToProcess {
        private final Schema schema;
        private final String chameleonNamespace;
        // list of SchemaToProcess objects directly included by this
        private List<SchemaToProcess> includes;
        // list of SchemaToProcess objects directly redefined by this
        private List<SchemaToProcess> redefines;
        // list of Redefine objects associated to each redefinition
        private List<Redefine> redefineObjects;
        // set of SchemaToProcess  objects directly/indirectly included by this
        private Set<SchemaToProcess> indirectIncludes;
        // set of SchemaToProcess objects that include this directly/indirectly
        private Set<SchemaToProcess> indirectIncludedBy;

        public SchemaToProcess(Schema schema, String chameleonNamespace) {
            this.schema = schema;
            this.chameleonNamespace = chameleonNamespace;
        }

        /**
         * The schema to parse.
         */
        public Schema getSchema() {
            return schema;
        }

        /**
         * The base URI for this stp
         */
        public String getSourceName() {
            return schema.documentProperties().getSourceName();
        }

        /**
         * The chameleon namespace. Null if this schema is not being treated
         * as a chameleon. (The ordinary targetNamespace will just be extracted
         * from the syntax of the schema.)
         */
        public String getChameleonNamespace() {
            return chameleonNamespace;
        }

        /**
         * This method and the remaining methods are used to represent a
         * directed graph of includes/redefines. This is required in order
         * to establish identity component by component, as required in
         * xmlschema-1, chapter 4.2.2
         */
        public List<SchemaToProcess> getRedefines() {
            return redefines;
        }

        public List<Redefine> getRedefineObjects() {
            return redefineObjects;
        }

        private void addInclude(SchemaToProcess include) {
            if (includes == null) {
                includes = new ArrayList<>();
            }
            includes.add(include);
        }

        private void addRedefine(SchemaToProcess redefine, Redefine object) {
            if (redefines == null || redefineObjects == null) {
                redefines = new ArrayList<>();
                redefineObjects = new ArrayList<>();
            }
            redefines.add(redefine);
            redefineObjects.add(object);
        }

        private void buildIndirectReferences() {
            if (includes != null) {
                for (SchemaToProcess schemaToProcess : includes) {
                    /* We have a this-schemaToProcess vertex
                     * This means that all nodes accessible from schemaToProcess are
                     * also accessible from this and all nodes that have access to
                     * this also have access to schemaToProcess */
                    this.addIndirectIncludes(schemaToProcess);
                }
            }
            // Repeat the same algorithm for redefines, since redefines are also includes
            if (redefines != null) {
                for (SchemaToProcess schemaToProcess : redefines) {
                    this.addIndirectIncludes(schemaToProcess);
                }
            }
        }

        private void addIndirectIncludes(SchemaToProcess schemaToProcess) {
            if (indirectIncludes == null) {
                indirectIncludes = new HashSet<>();
            }
            indirectIncludes.add(schemaToProcess);
            if (schemaToProcess.indirectIncludedBy == null) {
                schemaToProcess.indirectIncludedBy = new HashSet<>();
            }
            schemaToProcess.indirectIncludedBy.add(this);
            addIndirectIncludesHelper(this, schemaToProcess);
            if (indirectIncludedBy != null) {
                for (SchemaToProcess stp : indirectIncludedBy) {
                    stp.indirectIncludes.add(schemaToProcess);
                    schemaToProcess.indirectIncludedBy.add(stp);
                    addIndirectIncludesHelper(stp, schemaToProcess);
                }
            }
        }

        private static void addIndirectIncludesHelper(SchemaToProcess including,
                                                      SchemaToProcess schemaToProcess) {
            if (schemaToProcess.indirectIncludes != null) {
                for (SchemaToProcess stp : schemaToProcess.indirectIncludes) {
                    including.indirectIncludes.add(stp);
                    stp.indirectIncludedBy.add(including);
                }
            }
        }

        public boolean indirectIncludes(SchemaToProcess schemaToProcess) {
            return indirectIncludes != null && indirectIncludes.contains(schemaToProcess);
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof SchemaToProcess)) {
                return false;
            }

            final SchemaToProcess schemaToProcess = (SchemaToProcess) o;

            if (!Objects.equals(chameleonNamespace, schemaToProcess.chameleonNamespace)) {
                return false;
            }
            return schema == schemaToProcess.schema;
        }

        public int hashCode() {
            int result;
            result = schema.hashCode();
            result = 29 * result + (chameleonNamespace != null ? chameleonNamespace.hashCode() : 0);
            return result;
        }
    }

    private final static String PROJECT_URL_PREFIX = "project://local";

    private static String baseURLForDoc(XmlObject obj) {
        String path = obj.documentProperties().getSourceName();

        if (path == null) {
            return null;
        }

        if (path.startsWith("/")) {
            return PROJECT_URL_PREFIX + path.replace('\\', '/');
        }

        // looks like a URL?
        int colon = path.indexOf(':');
        if (colon > 1 && path.substring(0, colon).matches("^\\w+$")) {
            return path;
        }

        return PROJECT_URL_PREFIX + "/" + path.replace('\\', '/');
    }

    private static URI parseURI(String s) {
        if (s == null) {
            return null;
        }

        try {
            return new URI(s);
        } catch (URISyntaxException syntax) {
            return null;
        }
    }

    //workaround for Sun bug # 4723726
    public static URI resolve(URI base, String child)
        throws URISyntaxException {
        URI childUri = new URI(child);
        URI ruri = base.resolve(childUri);

        // if the child fragment is relative (which we'll assume is the case
        // if URI.resolve doesn't do anything useful with it) and the base
        // URI is pointing at something nested inside a jar, we seem to have
        // to this ourselves to make sure that the nested jar url gets
        // resolved correctly
        if (childUri.equals(ruri) && !childUri.isAbsolute() &&
            (base.getScheme().equals("jar") || base.getScheme().equals("zip"))) {
            String r = base.toString();
            int lastslash = r.lastIndexOf('/');
            r = r.substring(0, lastslash) + "/" + childUri;
            // Sun's implementation of URI doesn't support references to the
            // parent directory ("/..") in the part after "!/" so we have to
            // remove these ourselves
            int exclPointSlashIndex = r.lastIndexOf("!/");
            if (exclPointSlashIndex > 0) {
                int slashDotDotIndex = r.indexOf("/..", exclPointSlashIndex);
                while (slashDotDotIndex > 0) {
                    int prevSlashIndex = r.lastIndexOf("/", slashDotDotIndex - 1);
                    if (prevSlashIndex >= exclPointSlashIndex) {
                        String temp = r.substring(slashDotDotIndex + 3);
                        r = r.substring(0, prevSlashIndex).concat(temp);
                    }
                    slashDotDotIndex = r.indexOf("/..", exclPointSlashIndex);
                }
            }
            return URI.create(r);
        }

        //fix up normalization bug
        if ("file".equals(ruri.getScheme()) && !child.equals(ruri.getPath())) {
            if (base.getPath().startsWith("//") && !ruri.getPath().startsWith("//")) {
                String path = "///".concat(ruri.getPath());
                try {
                    ruri = new URI("file", null, path, ruri.getQuery(), ruri.getFragment());
                } catch (URISyntaxException ignored) {
                }
            }
        }
        return ruri;
    }

    public static class DownloadTable {
        /**
         * Namespace/schemaLocation pair.
         * <p>
         * Downloaded schemas are indexed by namespace, schemaLocation, and both.
         * <p>
         * A perfect match is preferred, but a match-by-namespace is accepted.
         * A match-by-schemaLocation is only accepted for includes (not imports).
         */
        private static class NsLocPair {
            private final String namespaceURI;
            private final String locationURL;

            public NsLocPair(String namespaceURI, String locationURL) {
                this.namespaceURI = namespaceURI;
                this.locationURL = locationURL;
            }

            /**
             * Empty string for no-namespace, null for namespace-not-part-of-key
             */
            public String getNamespaceURI() {
                return namespaceURI;
            }

            public String getLocationURL() {
                return locationURL;
            }

            public boolean equals(Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof NsLocPair)) {
                    return false;
                }

                final NsLocPair nsLocPair = (NsLocPair) o;

                if (!Objects.equals(locationURL, nsLocPair.locationURL)) {
                    return false;
                }
                return Objects.equals(namespaceURI, nsLocPair.namespaceURI);
            }

            public int hashCode() {
                int result;
                result = (namespaceURI != null ? namespaceURI.hashCode() : 0);
                result = 29 * result + (locationURL != null ? locationURL.hashCode() : 0);
                return result;
            }
        }

        private static class DigestKey {
            byte[] _digest;
            int _hashCode;

            DigestKey(byte[] digest) {
                _digest = digest;
                for (int i = 0; i < 4 && i < digest.length; i++) {
                    _hashCode = _hashCode << 8;
                    _hashCode = _hashCode + digest[i];
                }
            }

            public boolean equals(Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof DigestKey)) {
                    return false;
                }
                return Arrays.equals(_digest, ((DigestKey) o)._digest);
            }

            public int hashCode() {
                return _hashCode;
            }
        }

        private final Map<NsLocPair, Schema> schemaByNsLocPair = new HashMap<>();
        private final Map<DigestKey, Schema> schemaByDigestKey = new HashMap<>();
        private final LinkedList<SchemaToProcess> scanNeeded = new LinkedList<>();
        private final Set<Schema> emptyNamespaceSchemas = new HashSet<>();
        private final Map<SchemaToProcess, SchemaToProcess> scannedAlready = new HashMap<>();
        private final Set<String> failedDownloads = new HashSet<>();

        private Schema findMatchByDigest(XmlObject original) {
            byte[] digest = original.documentProperties().getMessageDigest();
            if (digest == null) {
                return null;
            }
            return schemaByDigestKey.get(new DigestKey(digest));
        }

        private void addFailedDownload(String locationURL) {
            failedDownloads.add(locationURL);
        }

        private boolean previouslyFailedToDownload(String locationURL) {
            return failedDownloads.contains(locationURL);
        }

        private static boolean nullableStringsMatch(String s1, String s2) {
            if (s1 == null && s2 == null) {
                return true;
            }
            if (s1 == null || s2 == null) {
                return false;
            }
            return (s1.equals(s2));
        }

        private static String emptyStringIfNull(String s) {
            if (s == null) {
                return "";
            }
            return s;
        }

        private SchemaToProcess addScanNeeded(SchemaToProcess stp) {
            if (!scannedAlready.containsKey(stp)) {
                scannedAlready.put(stp, stp);
                scanNeeded.add(stp);
                return stp;
            } else {
                return scannedAlready.get(stp);
            }
        }

        private void addEmptyNamespaceSchema(Schema s) {
            emptyNamespaceSchemas.add(s);
        }

        private void usedEmptyNamespaceSchema(Schema s) {
            emptyNamespaceSchemas.remove(s);
        }


    }
}
