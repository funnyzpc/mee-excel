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

import java.io.IOException;
import java.util.function.BiConsumer;

/**
 * Like {@link BiConsumer} but throws {@link IOException}.
 *
 * @param <T> the type of the first argument to the operation
 * @param <U> the type of the second argument to the operation
 *
 * @see BiConsumer
 * @since 2.12.0
 */
@FunctionalInterface
public interface IOBiConsumer<T, U> {

    /**
     * Returns the no-op singleton.
     *
     * @param <T> the type of the first argument to the operation
     * @param <U> the type of the second argument to the operation
     * @return The no-op singleton.
     */
    @SuppressWarnings("unchecked")
    static <T, U> IOBiConsumer<T, U> noop() {
        return Constants.IO_BI_CONSUMER;
    }

    /**
     * Performs this operation on the given arguments.
     *
     * @param t the first input argument
     * @param u the second input argument
     * @throws IOException if an I/O error occurs.
     */
    void accept(T t, U u) throws IOException;


}
