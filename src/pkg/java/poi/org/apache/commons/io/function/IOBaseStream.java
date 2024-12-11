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

package poi.org.apache.commons.io.function;

import java.io.Closeable;
import java.io.IOException;
import java.util.stream.BaseStream;
import java.util.stream.Stream;

/**
 * Like {@link BaseStream} but throws {@link IOException}.
 *
 * @param <T> the type of the stream elements.
 * @param <S> the type of the IO stream extending {@code IOBaseStream}.
 * @param <B> the type of the stream extending {@code BaseStream}.
 * @since 2.12.0
 */
public interface IOBaseStream<T, S extends IOBaseStream<T, S, B>, B extends BaseStream<T, B>> extends Closeable {


    /**
     * Like {@link BaseStream#close()}.
     *
     * @see BaseStream#close()
     */
    @Override
    default void close() {
        unwrap().close();
    }

    /**
     * Like {@link BaseStream#isParallel()}.
     *
     * @return See {@link BaseStream#isParallel() delegate}.
     * @see BaseStream#isParallel()
     */
    @SuppressWarnings("resource") // for unwrap()
    default boolean isParallel() {
        return unwrap().isParallel();
    }

    /**
     * Unwraps this instance and returns the underlying {@link Stream}.
     * <p>
     * Implementations may not have anything to unwrap and that behavior is undefined for now.
     * </p>
     *
     * @return the underlying stream.
     */
    B unwrap();

    /**
     * Wraps a {@link Stream}.
     *
     * @param delegate The delegate.
     * @return An IO stream.
     */
    S wrap(B delegate);

}
