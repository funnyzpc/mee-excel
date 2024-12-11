/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package poi.org.apache.commons.compress.utils;


/**
 * Utility methods for reading and writing bytes.
 *
 * @since 1.14
 */
public final class ByteUtils {

    /**
     * Empty array.
     *
     * @since 1.21
     */
    public static final byte[] EMPTY_BYTE_ARRAY = {};

    private static void checkReadLength(final int length) {
        if (length > 8) {
            throw new IllegalArgumentException("Can't read more than eight bytes into a long value");
        }
    }

    /**
     * Reads the given byte array as a little-endian long.
     *
     * @param bytes  the byte array to convert
     * @param off    the offset into the array that starts the value
     * @param length the number of bytes representing the value
     * @return the number read
     * @throws IllegalArgumentException if len is bigger than eight
     */
    public static long fromLittleEndian(final byte[] bytes, final int off, final int length) {
        checkReadLength(length);
        long l = 0;
        for (int i = 0; i < length; i++) {
            l |= (bytes[off + i] & 0xffL) << 8 * i;
        }
        return l;
    }

    /**
     * Inserts the given value into the array as a little-endian sequence of the given length starting at the given offset.
     *
     * @param b      the array to write into
     * @param value  the value to insert
     * @param off    the offset into the array that receives the first byte
     * @param length the number of bytes to use to represent the value
     */
    public static void toLittleEndian(final byte[] b, final long value, final int off, final int length) {
        long num = value;
        for (int i = 0; i < length; i++) {
            b[off + i] = (byte) (num & 0xff);
            num >>= 8;
        }
    }

    private ByteUtils() {
        /* no instances */ }
}
