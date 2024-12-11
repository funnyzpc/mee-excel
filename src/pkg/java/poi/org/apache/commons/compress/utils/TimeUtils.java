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
package poi.org.apache.commons.compress.utils;

import java.nio.file.attribute.FileTime;
import java.util.concurrent.TimeUnit;

/**
 * Utility class for handling time-related types and conversions.
 * <p>
 * Understanding UNIX vs NTFS timestamps:
 * </p>
 * <ul>
 * <li>A <a href="https://en.wikipedia.org/wiki/Unix_time">UNIX timestamp</a> is a primitive long starting at the UNIX Epoch on January 1st, 1970 at Coordinated
 * Universal Time (UTC)</li>
 * <li>An <a href="https://learn.microsoft.com/en-us/windows/win32/sysinfo/file-times">NTFS timestamp</a> is a file time is a 64-bit value that represents the
 * number of 100-nanosecond intervals that have elapsed since 12:00 A.M. January 1, 1601 Coordinated Universal Time (UTC).</li>
 * </ul>
 *
 * @since 1.23
 */
public final class TimeUtils {

    /**
     * Tests whether a FileTime can be safely represented in the standard UNIX time.
     *
     * <p>
     * TODO ? If the FileTime is null, this method always returns true.
     * </p>
     *
     * @param time the FileTime to evaluate, can be null.
     * @return true if the time exceeds the minimum or maximum UNIX time, false otherwise.
     */
    public static boolean isUnixTime(final FileTime time) {
        // TODO Apache Commons IO 2.16.0
        return isUnixTime(toUnixTime(time));
    }

    /**
     * Tests whether a given number of seconds (since Epoch) can be safely represented in the standard UNIX time.
     *
     * @param seconds the number of seconds (since Epoch) to evaluate.
     * @return true if the time can be represented in the standard UNIX time, false otherwise.
     */
    public static boolean isUnixTime(final long seconds) {
        // TODO Apache Commons IO 2.16.0
        return Integer.MIN_VALUE <= seconds && seconds <= Integer.MAX_VALUE;
    }


    /**
     * Converts {@link FileTime} to standard UNIX time.
     *
     * @param fileTime the original FileTime.
     * @return the UNIX timestamp.
     */
    public static long toUnixTime(final FileTime fileTime) {
        // TODO Apache Commons IO 2.16.0
        return fileTime != null ? fileTime.to(TimeUnit.SECONDS) : 0;
    }


    /**
     * Converts standard UNIX time (in seconds, UTC/GMT) to {@link FileTime}.
     *
     * @param time UNIX timestamp (in seconds, UTC/GMT).
     * @return the corresponding FileTime.
     */
    public static FileTime unixTimeToFileTime(final long time) {
        // TODO Apache Commons IO 2.16.0 FileTimes.fromUnixTime(long)
        return FileTime.from(time, TimeUnit.SECONDS);
    }

    /** Private constructor to prevent instantiation of this utility class. */
    private TimeUtils() {
    }
}
