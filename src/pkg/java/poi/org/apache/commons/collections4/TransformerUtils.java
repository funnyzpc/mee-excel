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
package poi.org.apache.commons.collections4;



import poi.org.apache.commons.collections4.functors.StringValueTransformer;

/**
 * <code>TransformerUtils</code> provides reference implementations and
 * utilities for the Transformer functor interface. The supplied transformers are:
 * <ul>
 * <li>Invoker - returns the result of a method call on the input object
 * <li>Clone - returns a clone of the input object
 * <li>Constant - always returns the same object
 * <li>Closure - performs a Closure and returns the input object
 * <li>Predicate - returns the result of the predicate as a Boolean
 * <li>Factory - returns a new object from a factory
 * <li>Chained - chains two or more transformers together
 * <li>If - calls one transformer or another based on a predicate
 * <li>Switch - calls one transformer based on one or more predicates
 * <li>SwitchMap - calls one transformer looked up from a Map
 * <li>Instantiate - the Class input object is instantiated
 * <li>Map - returns an object from a supplied Map
 * <li>Null - always returns null
 * <li>NOP - returns the input object, which should be immutable
 * <li>Exception - always throws an exception
 * <li>StringValue - returns a <code>java.lang.String</code> representation of the input object
 * </ul>
 * <p>
 * Since v4.1 only transformers which are considered to be safe are
 * Serializable. Transformers considered to be unsafe for serialization are:
 * </p>
 * <ul>
 * <li>Invoker
 * <li>Clone
 * <li>Instantiate
 * </ul>
 *
 * @since 3.0
 */
public class TransformerUtils {

    /**
     * This class is not normally instantiated.
     */
    private TransformerUtils() {}


    /**
     * Gets a transformer that returns a <code>java.lang.String</code>
     * representation of the input object. This is achieved via the
     * <code>toString</code> method, <code>null</code> returns 'null'.
     *
     * @param <T>  the input type
     * @return the transformer
     * @see StringValueTransformer
     */
    public static <T> Transformer<T, String> stringValueTransformer() {
        return StringValueTransformer.stringValueTransformer();
    }

}
