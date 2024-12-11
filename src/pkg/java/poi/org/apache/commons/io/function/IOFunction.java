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
import java.util.function.Function;

/**
 * Like {@link Function} but throws {@link IOException}.
 *
 * @param <T> the type of the input to the operations.
 * @param <R> the return type of the operations.
 * @since 2.7
 */
@FunctionalInterface
public interface IOFunction<T, R> {

    /**
     * Returns a {@link IOFunction} that always returns its input argument.
     *
     * @param <T> the type of the input and output objects to the function
     * @return a function that always returns its input argument
     */
    @SuppressWarnings("unchecked")
    static <T> IOFunction<T, T> identity() {
        return Constants.IO_FUNCTION_ID;
    }

    /**
     * Applies this function to the given argument.
     *
     * @param t the function argument
     * @return the function result
     * @throws IOException if an I/O error occurs.
     */
    R apply(final T t) throws IOException;

}
