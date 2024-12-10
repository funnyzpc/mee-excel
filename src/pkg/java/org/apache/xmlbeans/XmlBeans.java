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

package org.apache.xmlbeans;

import org.apache.xmlbeans.impl.schema.BuiltinSchemaTypeSystem;
import org.apache.xmlbeans.impl.schema.PathResourceLoader;
import org.apache.xmlbeans.impl.schema.SchemaTypeLoaderImpl;
import org.apache.xmlbeans.impl.store.Locale;
import org.w3c.dom.Node;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;

/**
 * Provides an assortment of utilities
 * for managing XML Bean types, type systems, QNames, paths,
 * and queries.
 */
public final class XmlBeans {
    private static final String HOLDER_CLASS_NAME = "TypeSystemHolder";
    private static final String TYPE_SYSTEM_FIELD = "typeSystem";

    private static String XMLBEANS_TITLE = "org.apache.xmlbeans";
    private static String XMLBEANS_VERSION = "unknown";
    private static String XMLBEANS_VENDOR = "Apache Software Foundation";

    static {
        Package pkg = XmlBeans.class.getPackage();
        if (pkg != null && pkg.getImplementationVersion() != null) {
            XMLBEANS_TITLE = pkg.getImplementationTitle();
            XMLBEANS_VERSION = pkg.getImplementationVersion();
            XMLBEANS_VENDOR = pkg.getImplementationVendor();
        }
    }

    /**
     * Returns the XmlBeans Package title, "org.apache.xmlbeans",
     * the value of
     * {@link Package#getImplementationTitle() XmlBeans.class.getPackage().getImplementationTitle()}.
     */
    public static String getTitle() {
        return XMLBEANS_TITLE;
    }

    /**
     * Returns the XmlBeans vendor, "Apache Software Foundation",
     * the value of
     * {@link Package#getImplementationVendor() XmlBeans.class.getPackage().getImplementationVendor()}.
     */
    public static String getVendor() {
        return XMLBEANS_VENDOR;
    }

    /**
     * Returns the XmlBeans version,
     * the value of
     * {@link Package#getImplementationVersion() XmlBeans.class.getPackage().getImplementationVersion()}.
     */
    public static String getVersion() {
        return XMLBEANS_VERSION;
    }

    /**
     * Thread local QName cache for general use
     */
    private static final ThreadLocal _threadLocalLoaderQNameCache =
        new ThreadLocal() {
            protected Object initialValue() {
                return new SoftReference(new QNameCache(32));
            }
        };

    public static void clearThreadLocals() {
        // clear thread local here
        _threadLocalLoaderQNameCache.remove();
    }

    /**
     * Returns a thread local QNameCache
     */
    public static QNameCache getQNameCache() {
        SoftReference softRef = (SoftReference) _threadLocalLoaderQNameCache.get();
        QNameCache qnameCache = (QNameCache) (softRef).get();
        if (qnameCache == null) {
            qnameCache = new QNameCache(32);
            _threadLocalLoaderQNameCache.set(new SoftReference(qnameCache));
        }
        return qnameCache;
    }

    /**
     * Obtains a name from the thread local QNameCache
     */
    public static QName getQName(String localPart) {
        return getQNameCache().getName("", localPart);
    }

    /**
     * Obtains a name from the thread local QNameCache
     */

    public static QName getQName(String namespaceUri, String localPart) {
        return getQNameCache().getName(namespaceUri, localPart);
    }

    private static RuntimeException causedException(RuntimeException e, Throwable cause) {
        e.initCause(cause);

        return e;
    }


    /**
     * Gets the SchemaTypeLoader based on the current thread's context
     * ClassLoader. This is the SchemaTypeLoader that is used to assign
     * schema types to XML documents by default. The SchemaTypeLoader is
     * also consulted to resolve wildcards and xsi:type attributes.
     * <p>
     * The "parse" methods of XmlBeans all delegate to the
     * "parseInstance" methods of the context type loader.
     */
    public static SchemaTypeLoader getContextTypeLoader() {
        return SchemaTypeLoaderImpl.getContextTypeLoader();
    }

    /**
     * Returns the builtin type system. This SchemaTypeSystem contains
     * only the 46 builtin types defined by the XML Schema specification.
     */
    public static SchemaTypeSystem getBuiltinTypeSystem() {
        return BuiltinSchemaTypeSystem.get();
    }

    /**
     * Returns the union of a list of typeLoaders. The returned
     * SchemaTypeLoader searches the given list of SchemaTypeLoaders
     * in order from first to last.
     */
    public static SchemaTypeLoader typeLoaderUnion(SchemaTypeLoader... typeLoaders) {
        return (typeLoaders.length == 1) ? typeLoaders[0] : SchemaTypeLoaderImpl.build(typeLoaders, null, null);
    }

    /**
     * Returns a SchemaTypeLoader that searches for compiled schema types
     * in the given ClassLoader.
     */
    public static SchemaTypeLoader typeLoaderForClassLoader(ClassLoader loader) {
        return SchemaTypeLoaderImpl.build(null, null, loader);
    }

    /**
     * Returns a SchemaTypeLoader that searches for compiled schema types
     * in the given ResourceLoader.
     *
     * @see XmlBeans#resourceLoaderForPath(File[])
     */
    public static SchemaTypeLoader typeLoaderForResource(ResourceLoader resourceLoader) {
        return SchemaTypeLoaderImpl.build(null, resourceLoader, null);
    }

    /**
     * Returns the SchemaTypeSystem of the given name (as returned by
     * {@link SchemaTypeSystem#getName}) for the given ClassLoader.
     * <p>
     * Note: you will almost always need typeLoaderForClassLoader()
     * instead (see {@link XmlBeans#typeLoaderForClassLoader}).
     */
    public static SchemaTypeSystem typeSystemForClassLoader(ClassLoader loader, String stsName) {
        try {
            ClassLoader cl = loader == null ? Thread.currentThread().getContextClassLoader() : loader;
            Class clazz = cl.loadClass(stsName + "." + HOLDER_CLASS_NAME);
            SchemaTypeSystem sts = (SchemaTypeSystem)
                (clazz.getDeclaredField(TYPE_SYSTEM_FIELD).get(null));
            if (sts == null) {
                throw new RuntimeException("SchemaTypeSystem is null for field " +
                                           TYPE_SYSTEM_FIELD + " on class with name " + stsName +
                                           "." + HOLDER_CLASS_NAME +
                                           ". Please verify the version of xmlbeans.jar is correct.");
            }
            return sts;
        } catch (ClassNotFoundException e) {
            throw causedException(new RuntimeException("Cannot load SchemaTypeSystem. " +
                                                       "Unable to load class with name " + stsName + "." + HOLDER_CLASS_NAME +
                                                       ". Make sure the generated binary files are on the classpath."), e);
        } catch (NoSuchFieldException e) {
            throw causedException(new RuntimeException("Cannot find field " +
                                                       TYPE_SYSTEM_FIELD + " on class " + stsName + "." + HOLDER_CLASS_NAME +
                                                       ". Please verify the version of xmlbeans.jar is correct."), e);
        } catch (IllegalAccessException e) {
            throw causedException(new RuntimeException("Field " +
                                                       TYPE_SYSTEM_FIELD + " on class " + stsName + "." + HOLDER_CLASS_NAME +
                                                       "is not accessible. Please verify the version of xmlbeans.jar is correct."), e);
        }
    }

    /**
     * Returns the SchemaType from a corresponding XmlObject subclass,
     * or null if none.
     */
    public static SchemaType typeForClass(Class c) {
        if (c == null || !XmlObject.class.isAssignableFrom(c)) {
            return null;
        }

        try {
            Field typeField = c.getField("type");

            if (typeField == null) {
                return null;
            }

            return (SchemaType) typeField.get(null);
        } catch (Exception e) {
            return null;
        }
    }

    private static SchemaType getNoType() {
        return org.apache.xmlbeans.impl.schema.BuiltinSchemaTypeSystem.getNoType();
    }

    /**
     * The SchemaType object given to an XmlObject instance when
     * no type can be determined.
     * <p>
     * The NO_TYPE is the universal derived type.  That is, it is
     * derived from all other schema types, and no instances of the
     * NO_TYPE are valid. (It is not to be confused with the anyType,
     * which is the universal base type from which all other types
     * can be derived, and of which all instances are valid.)
     */
    public static final SchemaType NO_TYPE = getNoType();

    private XmlBeans() {
    }
}
