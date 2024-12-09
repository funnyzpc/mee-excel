/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.io.file;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.NotDirectoryException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;

import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.function.IOSupplier;

/**
 * NIO Path utilities.
 *
 * @since 2.7
 */
public final class PathUtils {


    private static final OpenOption[] OPEN_OPTIONS_TRUNCATE = { StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING };

    private static final OpenOption[] OPEN_OPTIONS_APPEND = { StandardOpenOption.CREATE, StandardOpenOption.APPEND };



    /**
     * Empty {@link LinkOption} array.
     */
    public static final LinkOption[] EMPTY_LINK_OPTION_ARRAY = {};

    /**
     * {@link LinkOption} array for {@link LinkOption#NOFOLLOW_LINKS}.
     *
     * @since 2.9.0
     * @deprecated Use {@link #noFollowLinkOptionArray()}.
     */
    @Deprecated
    public static final LinkOption[] NOFOLLOW_LINK_OPTION_ARRAY = { LinkOption.NOFOLLOW_LINKS };

    /**
     * A LinkOption used to follow link in this class, the inverse of {@link LinkOption#NOFOLLOW_LINKS}.
     *
     * @since 2.12.0
     */
    static final LinkOption NULL_LINK_OPTION = null;

    /**
     * Empty {@link OpenOption} array.
     */
    public static final OpenOption[] EMPTY_OPEN_OPTION_ARRAY = {};

    /**
     * Empty {@link Path} array.
     *
     * @since 2.9.0
     */
    public static final Path[] EMPTY_PATH_ARRAY = {};

    /**
     * Copies the InputStream from the supplier with {@link Files#copy(InputStream, Path, CopyOption...)}.
     *
     * @param in          Supplies the InputStream.
     * @param target      See {@link Files#copy(InputStream, Path, CopyOption...)}.
     * @param copyOptions See {@link Files#copy(InputStream, Path, CopyOption...)}.
     * @return See {@link Files#copy(InputStream, Path, CopyOption...)}
     * @throws IOException See {@link Files#copy(InputStream, Path, CopyOption...)}
     * @since 2.12.0
     */
    public static long copy(final IOSupplier<InputStream> in, final Path target, final CopyOption... copyOptions) throws IOException {
        try (InputStream inputStream = in.get()) {
            return Files.copy(inputStream, target, copyOptions);
        }
    }

    /**
     * Creates the parent directories for the given {@code path}.
     * <p>
     * If the parent directory already exists, then return it.
     * </p>
     *
     * @param path       The path to a file (or directory).
     * @param linkOption A {@link LinkOption} or null.
     * @param attrs      An optional list of file attributes to set atomically when creating the directories.
     * @return The Path for the {@code path}'s parent directory or null if the given path has no parent.
     * @throws IOException if an I/O error occurs.
     * @since 2.12.0
     */
    public static Path createParentDirectories(final Path path, final LinkOption linkOption, final FileAttribute<?>... attrs) throws IOException {
        Path parent = getParent(path);
        parent = linkOption == LinkOption.NOFOLLOW_LINKS ? parent : readIfSymbolicLink(parent);
        if (parent == null) {
            return null;
        }
        final boolean exists = linkOption == null ? Files.exists(parent) : Files.exists(parent, linkOption);
        return exists ? parent : Files.createDirectories(parent, attrs);
    }

    /**
     * Gets the current directory.
     *
     * @return the current directory.
     *
     * @since 2.9.0
     */
    public static Path current() {
        return Paths.get(".");
    }

    private static boolean exists(final Path path, final LinkOption... options) {
        Objects.requireNonNull(path, "path");
        return options != null ? Files.exists(path, options) : Files.exists(path);
    }

    /**
     * <p>
     * Applies an {@link IOFileFilter} to the provided {@link File} objects. The resulting array is a subset of the original file list that matches the provided
     * filter.
     * </p>
     *
     * <p>
     * The {@link Set} returned by this method is not guaranteed to be thread safe.
     * </p>
     *
     * <pre>
     * Set&lt;File&gt; allFiles = ...
     * Set&lt;File&gt; javaFiles = FileFilterUtils.filterSet(allFiles,
     *     FileFilterUtils.suffixFileFilter(".java"));
     * </pre>
     *
     * @param filter the filter to apply to the set of files.
     * @param paths  the array of files to apply the filter to.
     *
     * @return a subset of {@code files} that is accepted by the file filter.
     * @throws NullPointerException     if the filter is {@code null}
     * @throws IllegalArgumentException if {@code files} contains a {@code null} value.
     *
     * @since 2.9.0
     */
    public static Path[] filter(final PathFilter filter, final Path... paths) {
        Objects.requireNonNull(filter, "filter");
        if (paths == null) {
            return EMPTY_PATH_ARRAY;
        }
        return filterPaths(filter, Stream.of(paths), Collectors.toList()).toArray(EMPTY_PATH_ARRAY);
    }

    private static <R, A> R filterPaths(final PathFilter filter, final Stream<Path> stream, final Collector<? super Path, A, R> collector) {
        Objects.requireNonNull(filter, "filter");
        Objects.requireNonNull(collector, "collector");
        if (stream == null) {
            return Stream.<Path>empty().collect(collector);
        }
        return stream.filter(p -> {
            try {
                return p != null && filter.accept(p, readBasicFileAttributes(p)) == FileVisitResult.CONTINUE;
            } catch (final IOException e) {
                return false;
            }
        }).collect(collector);
    }

    /**
     * Gets the Path's file name and apply the given function if the file name is non-null.
     *
     * @param <R> The function's result type.
     * @param path the path to query.
     * @param function function to apply to the file name.
     * @return the Path's file name as a string or null.
     * @see Path#getFileName()
     * @since 2.16.0
     */
    public static <R> R getFileName(final Path path, final Function<Path, R> function) {
        final Path fileName = path != null ? path.getFileName() : null;
        return fileName != null ? function.apply(fileName) : null;
    }

    /**
     * Gets the Path's file name as a string.
     *
     * @param path the path to query.
     * @return the Path's file name as a string or null.
     * @see Path#getFileName()
     * @since 2.16.0
     */
    public static String getFileNameString(final Path path) {
        return getFileName(path, Path::toString);
    }


    /**
     * Gets the file's last modified time or null if the file does not exist.
     *
     * @param path            the file to query.
     * @param defaultIfAbsent Returns this file time of the file does not exist, may be null.
     * @param options         options indicating how symbolic links are handled.
     * @return the file's last modified time.
     * @throws IOException Thrown if an I/O error occurs.
     * @since 2.12.0
     */
    public static FileTime getLastModifiedFileTime(final Path path, final FileTime defaultIfAbsent, final LinkOption... options) throws IOException {
        return Files.exists(path) ? getLastModifiedTime(path, options) : defaultIfAbsent;
    }

    private static FileTime getLastModifiedTime(final Path path, final LinkOption... options) throws IOException {
        return Files.getLastModifiedTime(Objects.requireNonNull(path, "path"), options);
    }

    private static Path getParent(final Path path) {
        return path == null ? null : path.getParent();
    }

    /**
     * Tests whether the given {@link Path} is a directory or not. Implemented as a null-safe delegate to
     * {@code Files.isDirectory(Path path, LinkOption... options)}.
     *
     * @param path    the path to the file.
     * @param options options indicating how to handle symbolic links
     * @return {@code true} if the file is a directory; {@code false} if the path is null, the file does not exist, is not a directory, or it cannot be
     *         determined if the file is a directory or not.
     * @throws SecurityException In the case of the default provider, and a security manager is installed, the {@link SecurityManager#checkRead(String)
     *                           checkRead} method is invoked to check read access to the directory.
     * @since 2.9.0
     */
    public static boolean isDirectory(final Path path, final LinkOption... options) {
        return path != null && Files.isDirectory(path, options);
    }

    /**
     * Tests whether the given file or directory is empty.
     *
     * @param path the file or directory to query.
     * @return whether the file or directory is empty.
     * @throws IOException if an I/O error occurs.
     */
    public static boolean isEmpty(final Path path) throws IOException {
        return Files.isDirectory(path) ? isEmptyDirectory(path) : isEmptyFile(path);
    }

    /**
     * Tests whether the directory is empty.
     *
     * @param directory the directory to query.
     * @return whether the directory is empty.
     * @throws NotDirectoryException if the file could not otherwise be opened because it is not a directory <i>(optional specific exception)</i>.
     * @throws IOException           if an I/O error occurs.
     * @throws SecurityException     In the case of the default provider, and a security manager is installed, the {@link SecurityManager#checkRead(String)
     *                               checkRead} method is invoked to check read access to the directory.
     */
    public static boolean isEmptyDirectory(final Path directory) throws IOException {
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(directory)) {
            return !directoryStream.iterator().hasNext();
        }
    }

    /**
     * Tests whether the given file is empty.
     *
     * @param file the file to query.
     * @return whether the file is empty.
     * @throws IOException       if an I/O error occurs.
     * @throws SecurityException In the case of the default provider, and a security manager is installed, its {@link SecurityManager#checkRead(String)
     *                           checkRead} method denies read access to the file.
     */
    public static boolean isEmptyFile(final Path file) throws IOException {
        return Files.size(file) <= 0;
    }


    /**
     * Creates a new OutputStream by opening or creating a file, returning an output stream that may be used to write bytes to the file.
     *
     * @param path   the Path.
     * @param append Whether or not to append.
     * @return a new OutputStream.
     * @throws IOException if an I/O error occurs.
     * @see Files#newOutputStream(Path, OpenOption...)
     * @since 2.12.0
     */
    public static OutputStream newOutputStream(final Path path, final boolean append) throws IOException {
        return newOutputStream(path, EMPTY_LINK_OPTION_ARRAY, append ? OPEN_OPTIONS_APPEND : OPEN_OPTIONS_TRUNCATE);
    }

    static OutputStream newOutputStream(final Path path, final LinkOption[] linkOptions, final OpenOption... openOptions) throws IOException {
        if (!exists(path, linkOptions)) {
            createParentDirectories(path, linkOptions != null && linkOptions.length > 0 ? linkOptions[0] : NULL_LINK_OPTION);
        }
        final List<OpenOption> list = new ArrayList<>(Arrays.asList(openOptions != null ? openOptions : EMPTY_OPEN_OPTION_ARRAY));
        list.addAll(Arrays.asList(linkOptions != null ? linkOptions : EMPTY_LINK_OPTION_ARRAY));
        return Files.newOutputStream(path, list.toArray(EMPTY_OPEN_OPTION_ARRAY));
    }

    /**
     * Copy of the {@link LinkOption} array for {@link LinkOption#NOFOLLOW_LINKS}.
     *
     * @return Copy of the {@link LinkOption} array for {@link LinkOption#NOFOLLOW_LINKS}.
     */
    public static LinkOption[] noFollowLinkOptionArray() {
        return NOFOLLOW_LINK_OPTION_ARRAY.clone();
    }

    private static boolean notExists(final Path path, final LinkOption... options) {
        return Files.notExists(Objects.requireNonNull(path, "path"), options);
    }
    /**
     * Reads the BasicFileAttributes from the given path. Returns null if the attributes can't be read.
     *
     * @param <A>     The {@link BasicFileAttributes} type
     * @param path    The Path to test.
     * @param type    the {@link Class} of the file attributes required to read.
     * @param options options indicating how to handle symbolic links.
     * @return the file attributes or null if the attributes can't be read.
     * @see Files#readAttributes(Path, Class, LinkOption...)
     * @since 2.12.0
     */
    public static <A extends BasicFileAttributes> A readAttributes(final Path path, final Class<A> type, final LinkOption... options) {
        try {
            return path == null ? null : Files.readAttributes(path, type, options);
        } catch (final UnsupportedOperationException | IOException e) {
            // For example, on Windows.
            return null;
        }
    }

    /**
     * Reads the BasicFileAttributes from the given path.
     *
     * @param path the path to read.
     * @return the path attributes.
     * @throws IOException if an I/O error occurs.
     * @since 2.9.0
     */
    public static BasicFileAttributes readBasicFileAttributes(final Path path) throws IOException {
        return Files.readAttributes(path, BasicFileAttributes.class);
    }


    private static Path readIfSymbolicLink(final Path path) throws IOException {
        return path != null ? Files.isSymbolicLink(path) ? Files.readSymbolicLink(path) : path : null;
    }


    /**
     * Reads the PosixFileAttributes from the given path. Returns null instead of throwing {@link UnsupportedOperationException}.
     *
     * @param path    The Path to read.
     * @param options options indicating how to handle symbolic links.
     * @return the file attributes.
     * @since 2.12.0
     */
    public static PosixFileAttributes readPosixFileAttributes(final Path path, final LinkOption... options) {
        return readAttributes(path, PosixFileAttributes.class, options);
    }

    /**
     * Low-level POSIX permission operation to set permissions.
     * <p>
     * If the permissions to update are already set, then make no additional calls.
     * </p>
     *
     * @param path              Set this path's permissions.
     * @param addPermissions    true to add, false to remove.
     * @param updatePermissions the List of PosixFilePermission to add or remove.
     * @param linkOptions       options indicating how handle symbolic links.
     * @return true if the operation was attempted and succeeded, false if parent is null.
     * @throws IOException if an I/O error occurs.
     */
    private static boolean setPosixPermissions(final Path path, final boolean addPermissions, final List<PosixFilePermission> updatePermissions,
            final LinkOption... linkOptions) throws IOException {
        if (path != null) {
            final Set<PosixFilePermission> permissions = Files.getPosixFilePermissions(path, linkOptions);
            final Set<PosixFilePermission> newPermissions = new HashSet<>(permissions);
            if (addPermissions) {
                newPermissions.addAll(updatePermissions);
            } else {
                newPermissions.removeAll(updatePermissions);
            }
            if (!newPermissions.equals(permissions)) {
                Files.setPosixFilePermissions(path, newPermissions);
            }
            return true;
        }
        return false;
    }

    private static void setPosixReadOnlyFile(final Path path, final boolean readOnly, final LinkOption... linkOptions) throws IOException {
        // Not Windows 10
        final Set<PosixFilePermission> permissions = Files.getPosixFilePermissions(path, linkOptions);
        // @formatter:off
        final List<PosixFilePermission> readPermissions = Arrays.asList(
                PosixFilePermission.OWNER_READ
                //PosixFilePermission.GROUP_READ,
                //PosixFilePermission.OTHERS_READ
            );
        final List<PosixFilePermission> writePermissions = Arrays.asList(
                PosixFilePermission.OWNER_WRITE
                //PosixFilePermission.GROUP_WRITE,
                //PosixFilePermission.OTHERS_WRITE
            );
        // @formatter:on
        if (readOnly) {
            // RO: We can read, we cannot write.
            permissions.addAll(readPermissions);
            permissions.removeAll(writePermissions);
        } else {
            // Not RO: We can read, we can write.
            permissions.addAll(readPermissions);
            permissions.addAll(writePermissions);
        }
        Files.setPosixFilePermissions(path, permissions);
    }


    /**
     * Performs {@link Files#walkFileTree(Path,FileVisitor)} and returns the given visitor.
     *
     * Note that {@link Files#walkFileTree(Path,FileVisitor)} returns the given path.
     *
     * @param visitor   See {@link Files#walkFileTree(Path,FileVisitor)}.
     * @param directory See {@link Files#walkFileTree(Path,FileVisitor)}.
     * @param <T>       See {@link Files#walkFileTree(Path,FileVisitor)}.
     * @return the given visitor.
     *
     * @throws NoSuchFileException  if the directory does not exist.
     * @throws IOException          if an I/O error is thrown by a visitor method.
     * @throws NullPointerException if the directory is {@code null}.
     */
    public static <T extends FileVisitor<? super Path>> T visitFileTree(final T visitor, final Path directory) throws IOException {
        Files.walkFileTree(directory, visitor);
        return visitor;
    }

    /**
     * Prevents instantiation.
     */
    private PathUtils() {
        // do not instantiate.
    }

}
