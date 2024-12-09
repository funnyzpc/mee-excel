/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.commons.compress.archivers.zip;

import org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * {@link MultiReadOnlySeekableByteChannel} that knows what a split ZIP archive should look like.
 * <p>
 * If you want to read a split archive using {@link ZipFile} then create an instance of this class from the parts of the archive.
 * </p>
 *
 * @since 1.20
 */
public class ZipSplitReadOnlySeekableByteChannel extends MultiReadOnlySeekableByteChannel {

    private static final Path[] EMPTY_PATH_ARRAY = {};
    private static final int ZIP_SPLIT_SIGNATURE_LENGTH = 4;


    /**
     * Concatenates the given files.
     *
     * @param files the files to concatenate, note that the LAST FILE of files should be the LAST SEGMENT(.zip) and these files should be added in correct order
     *              (e.g. .z01, .z02... .z99, .zip)
     * @return SeekableByteChannel that concatenates all provided files
     * @throws NullPointerException if files is null
     * @throws IOException          if opening a channel for one of the files fails
     * @throws IOException          if the first channel doesn't seem to hold the beginning of a split archive
     */
    public static SeekableByteChannel forFiles(final File... files) throws IOException {
        final List<Path> paths = new ArrayList<>();
        for (final File f : Objects.requireNonNull(files, "files")) {
            paths.add(f.toPath());
        }

        return forPaths(paths.toArray(EMPTY_PATH_ARRAY));
    }

    /**
     * Concatenates the given files.
     *
     * @param lastSegmentFile the last segment of split ZIP segments, its extension should be .zip
     * @param files           the files to concatenate except for the last segment, note these files should be added in correct order (e.g. .z01, .z02... .z99)
     * @return SeekableByteChannel that concatenates all provided files
     * @throws IOException          if the first channel doesn't seem to hold the beginning of a split archive
     * @throws NullPointerException if files or lastSegmentFile is null
     */
    public static SeekableByteChannel forFiles(final File lastSegmentFile, final Iterable<File> files) throws IOException {
        Objects.requireNonNull(files, "files");
        Objects.requireNonNull(lastSegmentFile, "lastSegmentFile");

        final List<Path> filesList = new ArrayList<>();
        files.forEach(f -> filesList.add(f.toPath()));

        return forPaths(lastSegmentFile.toPath(), filesList);
    }

    /**
     * Concatenates the given channels.
     *
     * @param channels the channels to concatenate, note that the LAST CHANNEL of channels should be the LAST SEGMENT(.zip) and these channels should be added
     *                 in correct order (e.g. .z01, .z02... .z99, .zip)
     * @return SeekableByteChannel that concatenates all provided channels
     * @throws NullPointerException if channels is null
     * @throws IOException          if reading channels fails
     */
    public static SeekableByteChannel forOrderedSeekableByteChannels(final SeekableByteChannel... channels) throws IOException {
        if (Objects.requireNonNull(channels, "channels").length == 1) {
            return channels[0];
        }
        return new ZipSplitReadOnlySeekableByteChannel(Arrays.asList(channels));
    }

    /**
     * Concatenates the given file paths.
     *
     * @param paths the file paths to concatenate, note that the LAST FILE of files should be the LAST SEGMENT(.zip) and these files should be added in correct
     *              order (e.g.: .z01, .z02... .z99, .zip)
     * @param openOptions the options to open paths (shared by all paths).
     * @return SeekableByteChannel that concatenates all provided files
     * @throws NullPointerException if files is null
     * @throws IOException          if opening a channel for one of the files fails
     * @throws IOException          if the first channel doesn't seem to hold the beginning of a split archive
     * @since 1.22
     */
    public static SeekableByteChannel forPaths(final List<Path> paths, final OpenOption[] openOptions) throws IOException {
        final List<SeekableByteChannel> channels = new ArrayList<>();
        for (final Path path : Objects.requireNonNull(paths, "paths")) {
            channels.add(Files.newByteChannel(path, openOptions));
        }
        if (channels.size() == 1) {
            return channels.get(0);
        }
        return new ZipSplitReadOnlySeekableByteChannel(channels);
    }

    /**
     * Concatenates the given file paths.
     *
     * @param paths the file paths to concatenate, note that the LAST FILE of files should be the LAST SEGMENT(.zip) and these files should be added in correct
     *              order (e.g.: .z01, .z02... .z99, .zip)
     * @return SeekableByteChannel that concatenates all provided files
     * @throws NullPointerException if files is null
     * @throws IOException          if opening a channel for one of the files fails
     * @throws IOException          if the first channel doesn't seem to hold the beginning of a split archive
     * @since 1.22
     */
    public static SeekableByteChannel forPaths(final Path... paths) throws IOException {
        return forPaths(Arrays.asList(paths), new OpenOption[] { StandardOpenOption.READ });
    }

    /**
     * Concatenates the given file paths.
     *
     * @param lastSegmentPath the last segment path of split ZIP segments, its extension must be .zip
     * @param paths           the file paths to concatenate except for the last segment, note these files should be added in correct order (e.g.: .z01, .z02...
     *                        .z99)
     * @return SeekableByteChannel that concatenates all provided files
     * @throws IOException          if the first channel doesn't seem to hold the beginning of a split archive
     * @throws NullPointerException if files or lastSegmentPath is null
     * @since 1.22
     */
    public static SeekableByteChannel forPaths(final Path lastSegmentPath, final Iterable<Path> paths) throws IOException {
        Objects.requireNonNull(paths, "paths");
        Objects.requireNonNull(lastSegmentPath, "lastSegmentPath");

        final List<Path> filesList = new ArrayList<>();
        paths.forEach(filesList::add);
        filesList.add(lastSegmentPath);

        return forPaths(filesList.toArray(EMPTY_PATH_ARRAY));
    }

    private final ByteBuffer zipSplitSignatureByteBuffer = ByteBuffer.allocate(ZIP_SPLIT_SIGNATURE_LENGTH);

    /**
     * Concatenates the given channels.
     *
     * <p>
     * The channels should be add in ascending order, e.g. z01, z02, ... z99, ZIP please note that the .zip file is the last segment and should be added as the
     * last one in the channels
     * </p>
     *
     * @param channels the channels to concatenate
     * @throws NullPointerException if channels is null
     * @throws IOException          if the first channel doesn't seem to hold the beginning of a split archive
     */
    public ZipSplitReadOnlySeekableByteChannel(final List<SeekableByteChannel> channels) throws IOException {
        super(channels);

        // the first split ZIP segment should begin with ZIP split signature
        assertSplitSignature(channels);
    }

    /**
     * Based on the ZIP specification:
     *
     * <p>
     * 8.5.3 Spanned/Split archives created using PKZIP for Windows (V2.50 or greater), PKZIP Command Line (V2.50 or greater), or PKZIP Explorer will include a
     * special spanning signature as the first 4 bytes of the first segment of the archive. This signature (0x08074b50) will be followed immediately by the
     * local header signature for the first file in the archive.
     * </p>
     * <p>
     * The first 4 bytes of the first ZIP split segment should be the ZIP split signature(0x08074B50)
     * </p>
     *
     * @param channels channels to be validated
     * @throws IOException
     */
    private void assertSplitSignature(final List<SeekableByteChannel> channels) throws IOException {
        final SeekableByteChannel channel = channels.get(0);
        // the ZIP split file signature is at the beginning of the first split segment
        channel.position(0L);

        zipSplitSignatureByteBuffer.rewind();
        channel.read(zipSplitSignatureByteBuffer);
        final ZipLong signature = new ZipLong(zipSplitSignatureByteBuffer.array());
        if (!signature.equals(ZipLong.DD_SIG)) {
            channel.position(0L);
            throw new IOException("The first ZIP split segment does not begin with split ZIP file signature");
        }

        channel.position(0L);
    }
}
