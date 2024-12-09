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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import poi.org.apache.commons.collections4.iterators.EmptyIterator;
import poi.org.apache.commons.collections4.iterators.FilterIterator;
import poi.org.apache.commons.collections4.iterators.TransformIterator;
import poi.org.apache.commons.collections4.iterators.UnmodifiableIterator;

/**
 * Provides static utility methods and decorators for {@link Iterator}
 * instances. The implementations are provided in the iterators subpackage.
 *
 * @since 2.1
 */
public class IteratorUtils {
    // validation is done in this class in certain cases because the
    // public classes allow invalid states

    /**
     * An iterator over no elements.
     */
    @SuppressWarnings("rawtypes")
    public static final ResettableIterator EMPTY_ITERATOR = EmptyIterator.RESETTABLE_INSTANCE;



    /**
     * Default prefix used while converting an Iterator to its String representation.
     */
    private static final String DEFAULT_TOSTRING_PREFIX = "[";

    /**
     * Default suffix used while converting an Iterator to its String representation.
     */
    private static final String DEFAULT_TOSTRING_SUFFIX = "]";

    /**
     * Default delimiter used to delimit elements while converting an Iterator
     * to its String representation.
     */
    private static final String DEFAULT_TOSTRING_DELIMITER = ", ";

    /**
     * IteratorUtils is not normally instantiated.
     */
    private IteratorUtils() {}

    // Empty
    //-----------------------------------------------------------------------
    /**
     * Gets an empty iterator.
     * <p>
     * This iterator is a valid iterator object that will iterate over nothing.
     *
     * @param <E> the element type
     * @return an iterator over nothing
     */
    public static <E> ResettableIterator<E> emptyIterator() {
        return EmptyIterator.<E>resettableEmptyIterator();
    }
    // Unmodifiable
    //-----------------------------------------------------------------------
    /**
     * Gets an immutable version of an {@link Iterator}. The returned object
     * will always throw an {@link UnsupportedOperationException} for
     * the {@link Iterator#remove} method.
     *
     * @param <E> the element type
     * @param iterator  the iterator to make immutable
     * @return an immutable version of the iterator
     */
    public static <E> Iterator<E> unmodifiableIterator(final Iterator<E> iterator) {
        return UnmodifiableIterator.unmodifiableIterator(iterator);
    }



    // Transformed
    //-----------------------------------------------------------------------
    /**
     * Gets an iterator that transforms the elements of another iterator.
     * <p>
     * The transformation occurs during the next() method and the underlying
     * iterator is unaffected by the transformation.
     *
     * @param <I> the input type
     * @param <O> the output type
     * @param iterator  the iterator to use, not null
     * @param transform  the transform to use, not null
     * @return a new transforming iterator
     * @throws NullPointerException if either parameter is null
     */
    public static <I, O> Iterator<O> transformedIterator(final Iterator<? extends I> iterator,
            final Transformer<? super I, ? extends O> transform) {

        if (iterator == null) {
            throw new NullPointerException("Iterator must not be null");
        }
        if (transform == null) {
            throw new NullPointerException("Transformer must not be null");
        }
        return new TransformIterator<>(iterator, transform);
    }

    // Filtered
    //-----------------------------------------------------------------------
    /**
     * Gets an iterator that filters another iterator.
     * <p>
     * The returned iterator will only return objects that match the specified
     * filtering predicate.
     *
     * @param <E> the element type
     * @param iterator  the iterator to use, not null
     * @param predicate  the predicate to use as a filter, not null
     * @return a new filtered iterator
     * @throws NullPointerException if either parameter is null
     */
    public static <E> Iterator<E> filteredIterator(final Iterator<? extends E> iterator,
                                                   final Predicate<? super E> predicate) {
        if (iterator == null) {
            throw new NullPointerException("Iterator must not be null");
        }
        if (predicate == null) {
            throw new NullPointerException("Predicate must not be null");
        }
        return new FilterIterator<>(iterator, predicate);
    }


    /**
     * Gets an array based on an iterator.
     * <p>
     * As the wrapped Iterator is traversed, an ArrayList of its values is
     * created. At the end, this is converted to an array.
     *
     * @param iterator  the iterator to use, not null
     * @return an array of the iterator contents
     * @throws NullPointerException if iterator parameter is null
     */
    public static Object[] toArray(final Iterator<?> iterator) {
        if (iterator == null) {
            throw new NullPointerException("Iterator must not be null");
        }
        final List<?> list = toList(iterator, 100);
        return list.toArray();
    }

    /**
     * Gets an array based on an iterator.
     * <p>
     * As the wrapped Iterator is traversed, an ArrayList of its values is
     * created. At the end, this is converted to an array.
     *
     * @param <E> the element type
     * @param iterator  the iterator to use, not null
     * @param arrayClass  the class of array to create
     * @return an array of the iterator contents
     * @throws NullPointerException if iterator parameter or arrayClass is null
     * @throws ArrayStoreException if the arrayClass is invalid
     */
    public static <E> E[] toArray(final Iterator<? extends E> iterator, final Class<E> arrayClass) {
        if (iterator == null) {
            throw new NullPointerException("Iterator must not be null");
        }
        if (arrayClass == null) {
            throw new NullPointerException("Array class must not be null");
        }
        final List<E> list = toList(iterator, 100);
        @SuppressWarnings("unchecked")
        final E[] array = (E[]) Array.newInstance(arrayClass, list.size());
        return list.toArray(array);
    }

    /**
     * Gets a list based on an iterator.
     * <p>
     * As the wrapped Iterator is traversed, an ArrayList of its values is
     * created. At the end, the list is returned.
     *
     * @param <E> the element type
     * @param iterator  the iterator to use, not null
     * @return a list of the iterator contents
     * @throws NullPointerException if iterator parameter is null
     */
    public static <E> List<E> toList(final Iterator<? extends E> iterator) {
        return toList(iterator, 10);
    }

    /**
     * Gets a list based on an iterator.
     * <p>
     * As the wrapped Iterator is traversed, an ArrayList of its values is
     * created. At the end, the list is returned.
     *
     * @param <E> the element type
     * @param iterator  the iterator to use, not null
     * @param estimatedSize  the initial size of the ArrayList
     * @return a list of the iterator contents
     * @throws NullPointerException if iterator parameter is null
     * @throws IllegalArgumentException if the size is less than 1
     */
    public static <E> List<E> toList(final Iterator<? extends E> iterator, final int estimatedSize) {
        if (iterator == null) {
            throw new NullPointerException("Iterator must not be null");
        }
        if (estimatedSize < 1) {
            throw new IllegalArgumentException("Estimated size must be greater than 0");
        }
        final List<E> list = new ArrayList<>(estimatedSize);
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        return list;
    }


    /**
     * Finds the first element in the given iterator which matches the given predicate.
     * <p>
     * A <code>null</code> or empty iterator returns null.
     *
     * @param <E> the element type
     * @param iterator  the iterator to search, may be null
     * @param predicate  the predicate to use, may not be null
     * @return the first element of the iterator which matches the predicate or null if none could be found
     * @throws NullPointerException if predicate is null
     * @since 4.1
     */
    public static <E> E find(final Iterator<E> iterator, final Predicate<? super E> predicate) {
        if (predicate == null) {
            throw new NullPointerException("Predicate must not be null");
        }

        if (iterator != null) {
            while (iterator.hasNext()) {
                final E element = iterator.next();
                if (predicate.evaluate(element)) {
                    return element;
                }
            }
        }
        return null;
    }

    /**
     * Returns the index of the first element in the specified iterator that
     * matches the given predicate.
     * <p>
     * A <code>null</code> or empty iterator returns -1.
     *
     * @param <E> the element type
     * @param iterator  the iterator to search, may be null
     * @param predicate  the predicate to use, may not be null
     * @return the index of the first element which matches the predicate or -1 if none matches
     * @throws NullPointerException if predicate is null
     * @since 4.1
     */
    public static <E> int indexOf(final Iterator<E> iterator, final Predicate<? super E> predicate) {
        if (predicate == null) {
            throw new NullPointerException("Predicate must not be null");
        }

        if (iterator != null) {
            for(int index = 0; iterator.hasNext(); index++) {
                final E element = iterator.next();
                if (predicate.evaluate(element)) {
                    return index;
                }
            }
        }
        return -1;
    }

    /**
     * Answers true if a predicate is true for any element of the iterator.
     * <p>
     * A <code>null</code> or empty iterator returns false.
     *
     * @param <E> the type of object the {@link Iterator} contains
     * @param iterator  the {@link Iterator} to use, may be null
     * @param predicate  the predicate to use, may not be null
     * @return true if any element of the collection matches the predicate, false otherwise
     * @throws NullPointerException if predicate is null
     * @since 4.1
     */
    public static <E> boolean matchesAny(final Iterator<E> iterator, final Predicate<? super E> predicate) {
        return indexOf(iterator, predicate) != -1;
    }

    /**
     * Answers true if a predicate is true for every element of an iterator.
     * <p>
     * A <code>null</code> or empty iterator returns true.
     *
     * @param <E> the type of object the {@link Iterator} contains
     * @param iterator  the {@link Iterator} to use, may be null
     * @param predicate  the predicate to use, may not be null
     * @return true if every element of the collection matches the predicate or if the
     *   collection is empty, false otherwise
     * @throws NullPointerException if predicate is null
     * @since 4.1
     */
    public static <E> boolean matchesAll(final Iterator<E> iterator, final Predicate<? super E> predicate) {
        if (predicate == null) {
            throw new NullPointerException("Predicate must not be null");
        }

        if (iterator != null) {
            while (iterator.hasNext()) {
                final E element = iterator.next();
                if (!predicate.evaluate(element)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Checks if the given iterator is empty.
     * <p>
     * A <code>null</code> or empty iterator returns true.
     *
     * @param iterator  the {@link Iterator} to use, may be null
     * @return true if the iterator is exhausted or null, false otherwise
     * @since 4.1
     */
    public static boolean isEmpty(final Iterator<?> iterator) {
        return iterator == null || !iterator.hasNext();
    }


    /**
     * Returns the number of elements contained in the given iterator.
     * <p>
     * A <code>null</code> or empty iterator returns {@code 0}.
     *
     * @param iterator  the iterator to check, may be null
     * @return the number of elements contained in the iterator
     * @since 4.1
     */
    public static int size(final Iterator<?> iterator) {
        int size = 0;
        if (iterator != null) {
            while (iterator.hasNext()) {
                iterator.next();
                size++;
            }
        }
        return size;
    }

    /**
     * Returns a string representation of the elements of the specified iterator.
     * <p>
     * The string representation consists of a list of the iterator's elements,
     * enclosed in square brackets ({@code "[]"}). Adjacent elements are separated
     * by the characters {@code ", "} (a comma followed by a space). Elements are
     * converted to strings as by {@code String.valueOf(Object)}.
     *
     * @param <E> the element type
     * @param iterator  the iterator to convert to a string, may be null
     * @return a string representation of {@code iterator}
     * @since 4.1
     */
    public static <E> String toString(final Iterator<E> iterator) {
        return toString(iterator, TransformerUtils.stringValueTransformer(),
                        DEFAULT_TOSTRING_DELIMITER, DEFAULT_TOSTRING_PREFIX,
                        DEFAULT_TOSTRING_SUFFIX);
    }

    /**
     * Returns a string representation of the elements of the specified iterator.
     * <p>
     * The string representation consists of a list of the iterable's elements,
     * enclosed in square brackets ({@code "[]"}). Adjacent elements are separated
     * by the characters {@code ", "} (a comma followed by a space). Elements are
     * converted to strings as by using the provided {@code transformer}.
     *
     * @param <E> the element type
     * @param iterator  the iterator to convert to a string, may be null
     * @param transformer  the transformer used to get a string representation of an element
     * @return a string representation of {@code iterator}
     * @throws NullPointerException if {@code transformer} is null
     * @since 4.1
     */
    public static <E> String toString(final Iterator<E> iterator,
                                      final Transformer<? super E, String> transformer) {
        return toString(iterator, transformer, DEFAULT_TOSTRING_DELIMITER,
                        DEFAULT_TOSTRING_PREFIX, DEFAULT_TOSTRING_SUFFIX);
    }

    /**
     * Returns a string representation of the elements of the specified iterator.
     * <p>
     * The string representation consists of a list of the iterator's elements,
     * enclosed by the provided {@code prefix} and {@code suffix}. Adjacent elements
     * are separated by the provided {@code delimiter}. Elements are converted to
     * strings as by using the provided {@code transformer}.
     *
     * @param <E> the element type
     * @param iterator  the iterator to convert to a string, may be null
     * @param transformer  the transformer used to get a string representation of an element
     * @param delimiter  the string to delimit elements
     * @param prefix  the prefix, prepended to the string representation
     * @param suffix  the suffix, appended to the string representation
     * @return a string representation of {@code iterator}
     * @throws NullPointerException if either transformer, delimiter, prefix or suffix is null
     * @since 4.1
     */
    public static <E> String toString(final Iterator<E> iterator,
                                      final Transformer<? super E, String> transformer,
                                      final String delimiter,
                                      final String prefix,
                                      final String suffix) {
        if (transformer == null) {
            throw new NullPointerException("transformer may not be null");
        }
        if (delimiter == null) {
            throw new NullPointerException("delimiter may not be null");
        }
        if (prefix == null) {
            throw new NullPointerException("prefix may not be null");
        }
        if (suffix == null) {
            throw new NullPointerException("suffix may not be null");
        }
        final StringBuilder stringBuilder = new StringBuilder(prefix);
        if (iterator != null) {
            while (iterator.hasNext()) {
                final E element = iterator.next();
                stringBuilder.append(transformer.transform(element));
                stringBuilder.append(delimiter);
            }
            if(stringBuilder.length() > prefix.length()) {
                stringBuilder.setLength(stringBuilder.length() - delimiter.length());
            }
        }
        stringBuilder.append(suffix);
        return stringBuilder.toString();
    }

}
