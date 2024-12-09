/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.commons.compress.utils;


import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.LinkOption;

/**
 * Utility functions.
 *
 * @Immutable (has mutable data but it is write-only).
 */
public final class IOUtils {

    /**
     * Empty array of type {@link LinkOption}.
     *
     * @since 1.21
     */
    public static final LinkOption[] EMPTY_LINK_OPTIONS = {};

    /**
     * Closes the given Closeable and swallows any IOException that may occur.
     *
     * @param c Closeable to close, can be null
     * @since 1.7
     * @deprecated Use {@link org.apache.commons.io.IOUtils#closeQuietly(Closeable)}.
     */
    @Deprecated
    public static void closeQuietly(final Closeable c) {
        org.apache.commons.io.IOUtils.closeQuietly(c);
    }



    /**
     * Reads as much from input as possible to fill the given array.
     * <p>
     * This method may invoke read repeatedly to fill the array and only read less bytes than the length of the array if the end of the stream has been reached.
     * </p>
     *
     * @param input stream to read from
     * @param array buffer to fill
     * @return the number of bytes actually read
     * @throws IOException on error
     */
    public static int readFully(final InputStream input, final byte[] array) throws IOException {
        return readFully(input, array, 0, array.length);
    }

    /**
     * Reads as much from input as possible to fill the given array with the given amount of bytes.
     * <p>
     * This method may invoke read repeatedly to read the bytes and only read less bytes than the requested length if the end of the stream has been reached.
     * </p>
     *
     * @param input  stream to read from
     * @param array  buffer to fill
     * @param offset offset into the buffer to start filling at
     * @param length    of bytes to read
     * @return the number of bytes actually read
     * @throws IOException if an I/O error has occurred
     */
    public static int readFully(final InputStream input, final byte[] array, final int offset, final int length) throws IOException {
        if (length < 0 || offset < 0 || length + offset > array.length || length + offset < 0) {
            throw new IndexOutOfBoundsException();
        }
        return org.apache.commons.io.IOUtils.read(input, array, offset, length);
    }

    /**
     * Reads {@code b.remaining()} bytes from the given channel starting at the current channel's position.
     * <p>
     * This method reads repeatedly from the channel until the requested number of bytes are read. This method blocks until the requested number of bytes are
     * read, the end of the channel is detected, or an exception is thrown.
     * </p>
     *
     * @param channel    the channel to read from
     * @param byteBuffer the buffer into which the data is read.
     * @throws IOException  if an I/O error occurs.
     * @throws EOFException if the channel reaches the end before reading all the bytes.
     */
    public static void readFully(final ReadableByteChannel channel, final ByteBuffer byteBuffer) throws IOException {
        final int expectedLength = byteBuffer.remaining();
        final int read = org.apache.commons.io.IOUtils.read(channel, byteBuffer);
        if (read < expectedLength) {
            throw new EOFException();
        }
    }

    /**
     * Gets part of the contents of an {@code InputStream} as a {@code byte[]}.
     *
     * @param input the {@code InputStream} to read from
     * @param length   maximum amount of bytes to copy
     * @return the requested byte array
     * @throws NullPointerException if the input is null
     * @throws IOException          if an I/O error occurs
     * @since 1.21
     */
    public static byte[] readRange(final InputStream input, final int length) throws IOException {
        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        org.apache.commons.io.IOUtils.copyLarge(input, output, 0, length);
        return output.toByteArray();
    }

    /**
     * Gets part of the contents of an {@code ReadableByteChannel} as a {@code byte[]}.
     *
     * @param input the {@code ReadableByteChannel} to read from
     * @param length   maximum amount of bytes to copy
     * @return the requested byte array
     * @throws NullPointerException if the input is null
     * @throws IOException          if an I/O error occurs
     * @since 1.21
     */
    public static byte[] readRange(final ReadableByteChannel input, final int length) throws IOException {
        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        final ByteBuffer b = ByteBuffer.allocate(Math.min(length, org.apache.commons.io.IOUtils.DEFAULT_BUFFER_SIZE));
        int read = 0;
        while (read < length) {
            // Make sure we never read more than len bytes
            b.limit(Math.min(length - read, b.capacity()));
            final int readCount = input.read(b);
            if (readCount <= 0) {
                break;
            }
            output.write(b.array(), 0, readCount);
            b.rewind();
            read += readCount;
        }
        return output.toByteArray();
    }

    /**
     * Skips bytes from an input byte stream.
     * <p>
     * This method will only skip less than the requested number of bytes if the end of the input stream has been reached.
     * </p>
     *
     * @param input     stream to skip bytes in
     * @param toSkip the number of bytes to skip
     * @return the number of bytes actually skipped
     * @throws IOException on error
     */
    public static long skip(final InputStream input, final long toSkip) throws IOException {
        return org.apache.commons.io.IOUtils.skip(input, toSkip, org.apache.commons.io.IOUtils::byteArray);
    }

    /** Private constructor to prevent instantiation of this utility class. */
    private IOUtils() {
    }

}
