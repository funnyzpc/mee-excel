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

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import poi.org.apache.commons.collections4.iterators.LazyIteratorChain;

/**
 * Provides utility methods and decorators for {@link Iterable} instances.
 * <p>
 * <b>Note</b>: this util class has been designed for fail-fast argument checking.
 * </p>
 * <ul>
 * <li>
 * all decorator methods are <b>NOT</b> null-safe wrt the provided Iterable argument, i.e.
 * they will throw a {@link NullPointerException} if a null Iterable is passed as argument.
 * <li>
 * all other utility methods are null-safe wrt the provided Iterable argument, i.e. they will
 * treat a null Iterable the same way as an empty one. Other arguments which are null,
 * e.g. a {@link Predicate}, will result in a {@link NullPointerException}. Exception: passing
 * a null {@link Comparator} is equivalent to a Comparator with natural ordering.
 * </ul>
 *
 * @since 4.1
 */
public class IterableUtils {

    /**
     * An empty iterable.
     */
    @SuppressWarnings("rawtypes")
    static final FluentIterable EMPTY_ITERABLE = new FluentIterable<Object>() {
        @Override
        public Iterator<Object> iterator() {
            return IteratorUtils.emptyIterator();
        }
    };

    // Empty
    // ----------------------------------------------------------------------

    /**
     * Gets an empty iterable.
     * <p>
     * This iterable does not contain any elements.
     *
     * @param <E> the element type
     * @return an empty iterable
     */
    @SuppressWarnings("unchecked") // OK, empty collection is compatible with any type
    public static <E> Iterable<E> emptyIterable() {
        return EMPTY_ITERABLE;
    }

    // Chained
    // ----------------------------------------------------------------------

    /**
     * Combines two iterables into a single iterable.
     * <p>
     * The returned iterable has an iterator that traverses the elements in {@code a},
     * followed by the elements in {@code b}. The source iterators are not polled until
     * necessary.
     * <p>
     * The returned iterable's iterator supports {@code remove()} when the corresponding
     * input iterator supports it.
     *
     * @param <E> the element type
     * @param a  the first iterable, may not be null
     * @param b  the second iterable, may not be null
     * @return a new iterable, combining the provided iterables
     * @throws NullPointerException if either a or b is null
     */
    @SuppressWarnings("unchecked")
    public static <E> Iterable<E> chainedIterable(final Iterable<? extends E> a,
                                                  final Iterable<? extends E> b) {
        return chainedIterable(new Iterable[] {a, b});
    }

    /**
     * Combines three iterables into a single iterable.
     * <p>
     * The returned iterable has an iterator that traverses the elements in {@code a},
     * followed by the elements in {@code b} and {@code c}. The source iterators are
     * not polled until necessary.
     * <p>
     * The returned iterable's iterator supports {@code remove()} when the corresponding
     * input iterator supports it.
     *
     * @param <E> the element type
     * @param a  the first iterable, may not be null
     * @param b  the second iterable, may not be null
     * @param c  the third iterable, may not be null
     * @return a new iterable, combining the provided iterables
     * @throws NullPointerException if either of the provided iterables is null
     */
    @SuppressWarnings("unchecked")
    public static <E> Iterable<E> chainedIterable(final Iterable<? extends E> a,
                                                  final Iterable<? extends E> b,
                                                  final Iterable<? extends E> c) {
        return chainedIterable(new Iterable[] {a, b, c});
    }

    /**
     * Combines four iterables into a single iterable.
     * <p>
     * The returned iterable has an iterator that traverses the elements in {@code a},
     * followed by the elements in {@code b}, {@code c} and {@code d}. The source
     * iterators are not polled until necessary.
     * <p>
     * The returned iterable's iterator supports {@code remove()} when the corresponding
     * input iterator supports it.
     *
     * @param <E> the element type
     * @param a  the first iterable, may not be null
     * @param b  the second iterable, may not be null
     * @param c  the third iterable, may not be null
     * @param d  the fourth iterable, may not be null
     * @return a new iterable, combining the provided iterables
     * @throws NullPointerException if either of the provided iterables is null
     */
    @SuppressWarnings("unchecked")
    public static <E> Iterable<E> chainedIterable(final Iterable<? extends E> a,
                                                  final Iterable<? extends E> b,
                                                  final Iterable<? extends E> c,
                                                  final Iterable<? extends E> d) {
        return chainedIterable(new Iterable[] {a, b, c, d});
    }

    /**
     * Combines the provided iterables into a single iterable.
     * <p>
     * The returned iterable has an iterator that traverses the elements in the order
     * of the arguments, i.e. iterables[0], iterables[1], .... The source iterators
     * are not polled until necessary.
     * <p>
     * The returned iterable's iterator supports {@code remove()} when the corresponding
     * input iterator supports it.
     *
     * @param <E> the element type
     * @param iterables  the iterables to combine, may not be null
     * @return a new iterable, combining the provided iterables
     * @throws NullPointerException if either of the provided iterables is null
     */
    public static <E> Iterable<E> chainedIterable(final Iterable<? extends E>... iterables) {
        checkNotNull(iterables);
        return new FluentIterable<E>() {
            @Override
            public Iterator<E> iterator() {
                return new LazyIteratorChain<E>() {
                    @Override
                    protected Iterator<? extends E> nextIterator(final int count) {
                        if (count > iterables.length) {
                            return null;
                        }
                        return iterables[count - 1].iterator();
                    }
                };
            }
        };
    }


    // Filtered
    // ----------------------------------------------------------------------

    /**
     * Returns a view of the given iterable that only contains elements matching
     * the provided predicate.
     * <p>
     * The returned iterable's iterator supports {@code remove()} when the
     * corresponding input iterator supports it.
     *
     * @param <E> the element type
     * @param iterable  the iterable to filter, may not be null
     * @param predicate  the predicate used to filter elements, may not be null
     * @return a filtered view on the specified iterable
     * @throws NullPointerException if either iterable or predicate is null
     */
    public static <E> Iterable<E> filteredIterable(final Iterable<E> iterable,
                                                   final Predicate<? super E> predicate) {
        checkNotNull(iterable);
        if (predicate == null) {
            throw new NullPointerException("Predicate must not be null.");
        }
        return new FluentIterable<E>() {
            @Override
            public Iterator<E> iterator() {
                return IteratorUtils.filteredIterator(emptyIteratorIfNull(iterable), predicate);
            }
        };
    }


    // Transformed
    // ----------------------------------------------------------------------


    /**
     * Inner class to distinguish unmodifiable instances.
     */
    private static final class UnmodifiableIterable<E> extends FluentIterable<E> {
        private final Iterable<E> unmodifiable;

        public UnmodifiableIterable(final Iterable<E> iterable) {
            super();
            this.unmodifiable = iterable;
        }

        @Override
        public Iterator<E> iterator() {
            return IteratorUtils.unmodifiableIterator(unmodifiable.iterator());
        }
    }


    // Utility methods
    // ----------------------------------------------------------------------


    /**
     * Finds the first element in the given iterable which matches the given predicate.
     * <p>
     * A <code>null</code> or empty iterator returns null.
     *
     * @param <E> the element type
     * @param iterable  the iterable to search, may be null
     * @param predicate  the predicate to use, may not be null
     * @return the first element of the iterable which matches the predicate or null if none could be found
     * @throws NullPointerException if predicate is null
     */
    public static <E> E find(final Iterable<E> iterable, final Predicate<? super E> predicate) {
        return IteratorUtils.find(emptyIteratorIfNull(iterable), predicate);
    }

    /**
     * Returns the index of the first element in the specified iterable that
     * matches the given predicate.
     * <p>
     * A <code>null</code> or empty iterable returns -1.
     *
     * @param <E> the element type
     * @param iterable  the iterable to search, may be null
     * @param predicate  the predicate to use, may not be null
     * @return the index of the first element which matches the predicate or -1 if none matches
     * @throws NullPointerException if predicate is null
     */
    public static <E> int indexOf(final Iterable<E> iterable, final Predicate<? super E> predicate) {
        return IteratorUtils.indexOf(emptyIteratorIfNull(iterable), predicate);
    }

    /**
     * Answers true if a predicate is true for every element of an iterable.
     * <p>
     * A <code>null</code> or empty iterable returns true.
     *
     * @param <E> the type of object the {@link Iterable} contains
     * @param iterable  the {@link Iterable} to use, may be null
     * @param predicate  the predicate to use, may not be null
     * @return true if every element of the collection matches the predicate or if the
     *   collection is empty, false otherwise
     * @throws NullPointerException if predicate is null
     */
    public static <E> boolean matchesAll(final Iterable<E> iterable, final Predicate<? super E> predicate) {
        return IteratorUtils.matchesAll(emptyIteratorIfNull(iterable), predicate);
    }

    /**
     * Answers true if a predicate is true for any element of the iterable.
     * <p>
     * A <code>null</code> or empty iterable returns false.
     *
     * @param <E> the type of object the {@link Iterable} contains
     * @param iterable  the {@link Iterable} to use, may be null
     * @param predicate  the predicate to use, may not be null
     * @return true if any element of the collection matches the predicate, false otherwise
     * @throws NullPointerException if predicate is null
     */
    public static <E> boolean matchesAny(final Iterable<E> iterable, final Predicate<? super E> predicate) {
        return IteratorUtils.matchesAny(emptyIteratorIfNull(iterable), predicate);
    }

    /**
     * Answers true if the provided iterable is empty.
     * <p>
     * A <code>null</code> iterable returns true.
     *
     * @param iterable  the {@link Iterable to use}, may be null
     * @return true if the iterable is null or empty, false otherwise
     */
    public static boolean isEmpty(final Iterable<?> iterable) {
        if (iterable instanceof Collection<?>) {
            return ((Collection<?>) iterable).isEmpty();
        }
        return IteratorUtils.isEmpty(emptyIteratorIfNull(iterable));
    }
    /**
     * Returns the number of elements contained in the given iterator.
     * <p>
     * A <code>null</code> or empty iterator returns {@code 0}.
     *
     * @param iterable  the iterable to check, may be null
     * @return the number of elements contained in the iterable
     */
    public static int size(final Iterable<?> iterable) {
        if (iterable instanceof Collection<?>) {
            return ((Collection<?>) iterable).size();
        }
        return IteratorUtils.size(emptyIteratorIfNull(iterable));
    }


    /**
     * Gets a new list with the contents of the provided iterable.
     *
     * @param <E> the element type
     * @param iterable  the iterable to use, may be null
     * @return a list of the iterator contents
     */
    public static <E> List<E> toList(final Iterable<E> iterable) {
        return IteratorUtils.toList(emptyIteratorIfNull(iterable));
    }

    /**
     * Returns a string representation of the elements of the specified iterable.
     * <p>
     * The string representation consists of a list of the iterable's elements,
     * enclosed in square brackets ({@code "[]"}). Adjacent elements are separated
     * by the characters {@code ", "} (a comma followed by a space). Elements are
     * converted to strings as by {@code String.valueOf(Object)}.
     *
     * @param <E> the element type
     * @param iterable  the iterable to convert to a string, may be null
     * @return a string representation of {@code iterable}
     */
    public static <E> String toString(final Iterable<E> iterable) {
        return IteratorUtils.toString(emptyIteratorIfNull(iterable));
    }

    /**
     * Returns a string representation of the elements of the specified iterable.
     * <p>
     * The string representation consists of a list of the iterable's elements,
     * enclosed in square brackets ({@code "[]"}). Adjacent elements are separated
     * by the characters {@code ", "} (a comma followed by a space). Elements are
     * converted to strings as by using the provided {@code transformer}.
     *
     * @param <E> the element type
     * @param iterable  the iterable to convert to a string, may be null
     * @param transformer  the transformer used to get a string representation of an element
     * @return a string representation of {@code iterable}
     * @throws NullPointerException if {@code transformer} is null
     */
    public static <E> String toString(final Iterable<E> iterable,
                                      final Transformer<? super E, String> transformer) {
        if (transformer == null) {
            throw new NullPointerException("Transformer must not be null.");
        }
        return IteratorUtils.toString(emptyIteratorIfNull(iterable), transformer);
    }

    /**
     * Returns a string representation of the elements of the specified iterable.
     * <p>
     * The string representation consists of a list of the iterable's elements,
     * enclosed by the provided {@code prefix} and {@code suffix}. Adjacent elements
     * are separated by the provided {@code delimiter}. Elements are converted to
     * strings as by using the provided {@code transformer}.
     *
     * @param <E> the element type
     * @param iterable  the iterable to convert to a string, may be null
     * @param transformer  the transformer used to get a string representation of an element
     * @param delimiter  the string to delimit elements
     * @param prefix  the prefix, prepended to the string representation
     * @param suffix  the suffix, appended to the string representation
     * @return a string representation of {@code iterable}
     * @throws NullPointerException if either transformer, delimiter, prefix or suffix is null
     */
    public static <E> String toString(final Iterable<E> iterable,
                                      final Transformer<? super E, String> transformer,
                                      final String delimiter,
                                      final String prefix,
                                      final String suffix) {
        return IteratorUtils.toString(emptyIteratorIfNull(iterable),
                                      transformer, delimiter, prefix, suffix);
    }

    // Helper methods
    // ----------------------------------------------------------------------

    /**
     * Fail-fast check for null arguments.
     *
     * @param iterable  the iterable to check
     * @throws NullPointerException if iterable is null
     */
    static void checkNotNull(final Iterable<?> iterable) {
        if (iterable == null) {
            throw new NullPointerException("Iterable must not be null.");
        }
    }

    /**
     * Fail-fast check for null arguments.
     *
     * @param iterables  the iterables to check
     * @throws NullPointerException if the argument or any of its contents is null
     */
    static void checkNotNull(final Iterable<?>... iterables) {
        if (iterables == null) {
            throw new NullPointerException("Iterables must not be null.");
        }
        for (final Iterable<?> iterable : iterables) {
            checkNotNull(iterable);
        }
    }

    /**
     * Returns an empty iterator if the argument is <code>null</code>,
     * or {@code iterable.iterator()} otherwise.
     *
     * @param <E> the element type
     * @param iterable  the iterable, possibly <code>null</code>
     * @return an empty iterator if the argument is <code>null</code>
     */
    private static <E> Iterator<E> emptyIteratorIfNull(final Iterable<E> iterable) {
        return iterable != null ? iterable.iterator() : IteratorUtils.<E>emptyIterator();
    }

}
