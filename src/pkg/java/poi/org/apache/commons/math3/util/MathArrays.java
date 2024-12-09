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

package poi.org.apache.commons.math3.util;

import poi.org.apache.commons.math3.exception.DimensionMismatchException;
import poi.org.apache.commons.math3.exception.MathIllegalArgumentException;
import poi.org.apache.commons.math3.exception.NotPositiveException;
import poi.org.apache.commons.math3.exception.NullArgumentException;
import poi.org.apache.commons.math3.exception.NumberIsTooLargeException;
import poi.org.apache.commons.math3.exception.util.LocalizedFormats;


import java.util.Iterator;
import java.util.TreeSet;

/**
 * Arrays utilities.
 *
 * @since 3.0
 */
public class MathArrays {

    /**
     * Private constructor.
     */
    private MathArrays() {}

    /**
     * Real-valued function that operate on an array or a part of it.
     * @since 3.1
     */
    public interface Function {
        /**
         * Operates on an entire array.
         *
         * @param array Array to operate on.
         * @return the result of the operation.
         */
        double evaluate(double[] array);
        /**
         * @param array Array to operate on.
         * @param startIndex Index of the first element to take into account.
         * @param numElements Number of elements to take into account.
         * @return the result of the operation.
         */
        double evaluate(double[] array,
                        int startIndex,
                        int numElements);
    }

    /**
     * Create a copy of an array scaled by a value.
     *
     * @param arr Array to scale.
     * @param val Scalar.
     * @return scaled copy of array with each entry multiplied by val.
     * @since 3.2
     */
    public static double[] scale(double val, final double[] arr) {
        double[] newArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i] * val;
        }
        return newArr;
    }

    /**
     * Calculates the L<sub>2</sub> (Euclidean) distance between two points.
     *
     * @param p1 the first point
     * @param p2 the second point
     * @return the L<sub>2</sub> distance between the two points
     * @throws DimensionMismatchException if the array lengths differ.
     */
    public static double distance(int[] p1, int[] p2)
    throws DimensionMismatchException {
      checkEqualLength(p1, p2);
      double sum = 0;
      for (int i = 0; i < p1.length; i++) {
          final double dp = p1[i] - p2[i];
          sum += dp * dp;
      }
      return FastMath.sqrt(sum);
    }

    /**
     * Calculates the L<sub>&infin;</sub> (max of abs) distance between two points.
     *
     * @param p1 the first point
     * @param p2 the second point
     * @return the L<sub>&infin;</sub> distance between the two points
     * @throws DimensionMismatchException if the array lengths differ.
     */
    public static double distanceInf(double[] p1, double[] p2)
    throws DimensionMismatchException {
        checkEqualLength(p1, p2);
        double max = 0;
        for (int i = 0; i < p1.length; i++) {
            max = FastMath.max(max, FastMath.abs(p1[i] - p2[i]));
        }
        return max;
    }

    /**
     * Calculates the L<sub>&infin;</sub> (max of abs) distance between two points.
     *
     * @param p1 the first point
     * @param p2 the second point
     * @return the L<sub>&infin;</sub> distance between the two points
     * @throws DimensionMismatchException if the array lengths differ.
     */
    public static int distanceInf(int[] p1, int[] p2)
    throws DimensionMismatchException {
        checkEqualLength(p1, p2);
        int max = 0;
        for (int i = 0; i < p1.length; i++) {
            max = FastMath.max(max, FastMath.abs(p1[i] - p2[i]));
        }
        return max;
    }

    /**
     * Check that both arrays have the same length.
     *
     * @param a Array.
     * @param b Array.
     * @param abort Whether to throw an exception if the check fails.
     * @return {@code true} if the arrays have the same length.
     * @throws DimensionMismatchException if the lengths differ and
     * {@code abort} is {@code true}.
     * @since 3.6
     */
    public static boolean checkEqualLength(double[] a,
                                           double[] b,
                                           boolean abort) {
        if (a.length == b.length) {
            return true;
        } else {
            if (abort) {
                throw new DimensionMismatchException(a.length, b.length);
            }
            return false;
        }
    }

    /**
     * Check that both arrays have the same length.
     *
     * @param a Array.
     * @param b Array.
     * @throws DimensionMismatchException if the lengths differ.
     * @since 3.6
     */
    public static void checkEqualLength(double[] a,
                                        double[] b) {
        checkEqualLength(a, b, true);
    }


    /**
     * Check that both arrays have the same length.
     *
     * @param a Array.
     * @param b Array.
     * @param abort Whether to throw an exception if the check fails.
     * @return {@code true} if the arrays have the same length.
     * @throws DimensionMismatchException if the lengths differ and
     * {@code abort} is {@code true}.
     * @since 3.6
     */
    public static boolean checkEqualLength(int[] a,
                                           int[] b,
                                           boolean abort) {
        if (a.length == b.length) {
            return true;
        } else {
            if (abort) {
                throw new DimensionMismatchException(a.length, b.length);
            }
            return false;
        }
    }

    /**
     * Check that both arrays have the same length.
     *
     * @param a Array.
     * @param b Array.
     * @throws DimensionMismatchException if the lengths differ.
     * @since 3.6
     */
    public static void checkEqualLength(int[] a,
                                        int[] b) {
        checkEqualLength(a, b, true);
    }

    /**
     * Returns the Cartesian norm (2-norm), handling both overflow and underflow.
     * Translation of the minpack enorm subroutine.
     *
     * The redistribution policy for MINPACK is available
     * <a href="http://www.netlib.org/minpack/disclaimer">here</a>, for
     * convenience, it is reproduced below.</p>
     *
     * <table border="0" width="80%" cellpadding="10" align="center" bgcolor="#E0E0E0">
     * <tr><td>
     *    Minpack Copyright Notice (1999) University of Chicago.
     *    All rights reserved
     * </td></tr>
     * <tr><td>
     * Redistribution and use in source and binary forms, with or without
     * modification, are permitted provided that the following conditions
     * are met:
     * <ol>
     *  <li>Redistributions of source code must retain the above copyright
     *      notice, this list of conditions and the following disclaimer.</li>
     * <li>Redistributions in binary form must reproduce the above
     *     copyright notice, this list of conditions and the following
     *     disclaimer in the documentation and/or other materials provided
     *     with the distribution.</li>
     * <li>The end-user documentation included with the redistribution, if any,
     *     must include the following acknowledgment:
     *     {@code This product includes software developed by the University of
     *           Chicago, as Operator of Argonne National Laboratory.}
     *     Alternately, this acknowledgment may appear in the software itself,
     *     if and wherever such third-party acknowledgments normally appear.</li>
     * <li><strong>WARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED "AS IS"
     *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE
     *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND
     *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR
     *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES
     *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE
     *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY
     *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR
     *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF
     *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)
     *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION
     *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL
     *     BE CORRECTED.</strong></li>
     * <li><strong>LIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT
     *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF
     *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,
     *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF
     *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF
     *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER
     *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT
     *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,
     *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE
     *     POSSIBILITY OF SUCH LOSS OR DAMAGES.</strong></li>
     * <ol></td></tr>
     * </table>
     *
     * @param v Vector of doubles.
     * @return the 2-norm of the vector.
     * @since 2.2
     */
    public static double safeNorm(double[] v) {
        double rdwarf = 3.834e-20;
        double rgiant = 1.304e+19;
        double s1 = 0;
        double s2 = 0;
        double s3 = 0;
        double x1max = 0;
        double x3max = 0;
        double floatn = v.length;
        double agiant = rgiant / floatn;
        for (int i = 0; i < v.length; i++) {
            double xabs = FastMath.abs(v[i]);
            if (xabs < rdwarf || xabs > agiant) {
                if (xabs > rdwarf) {
                    if (xabs > x1max) {
                        double r = x1max / xabs;
                        s1= 1 + s1 * r * r;
                        x1max = xabs;
                    } else {
                        double r = xabs / x1max;
                        s1 += r * r;
                    }
                } else {
                    if (xabs > x3max) {
                        double r = x3max / xabs;
                        s3= 1 + s3 * r * r;
                        x3max = xabs;
                    } else {
                        if (xabs != 0) {
                            double r = xabs / x3max;
                            s3 += r * r;
                        }
                    }
                }
            } else {
                s2 += xabs * xabs;
            }
        }
        double norm;
        if (s1 != 0) {
            norm = x1max * Math.sqrt(s1 + (s2 / x1max) / x1max);
        } else {
            if (s2 == 0) {
                norm = x3max * Math.sqrt(s3);
            } else {
                if (s2 >= x3max) {
                    norm = Math.sqrt(s2 * (1 + (x3max / s2) * (x3max * s3)));
                } else {
                    norm = Math.sqrt(x3max * ((s2 / x3max) + (x3max * s3)));
                }
            }
        }
        return norm;
    }

    /**
     * Creates a copy of the {@code source} array.
     *
     * @param source Array to be copied.
     * @return the copied array.
     */
     public static int[] copyOf(int[] source) {
         return copyOf(source, source.length);
     }

    /**
     * Creates a copy of the {@code source} array.
     *
     * @param source Array to be copied.
     * @return the copied array.
     */
     public static double[] copyOf(double[] source) {
         return copyOf(source, source.length);
     }

    /**
     * Creates a copy of the {@code source} array.
     *
     * @param source Array to be copied.
     * @param len Number of entries to copy. If smaller then the source
     * length, the copy will be truncated, if larger it will padded with
     * zeroes.
     * @return the copied array.
     */
    public static int[] copyOf(int[] source, int len) {
         final int[] output = new int[len];
         System.arraycopy(source, 0, output, 0, FastMath.min(len, source.length));
         return output;
     }

    /**
     * Creates a copy of the {@code source} array.
     *
     * @param source Array to be copied.
     * @param len Number of entries to copy. If smaller then the source
     * length, the copy will be truncated, if larger it will padded with
     * zeroes.
     * @return the copied array.
     */
    public static double[] copyOf(double[] source, int len) {
         final double[] output = new double[len];
         System.arraycopy(source, 0, output, 0, FastMath.min(len, source.length));
         return output;
     }

    /**
     * Compute a linear combination accurately.
     * This method computes the sum of the products
     * <code>a<sub>i</sub> b<sub>i</sub></code> to high accuracy.
     * It does so by using specific multiplication and addition algorithms to
     * preserve accuracy and reduce cancellation effects.
     * <br/>
     * It is based on the 2005 paper
     * <a href="http://citeseerx.ist.psu.edu/viewdoc/summary?doi=10.1.1.2.1547">
     * Accurate Sum and Dot Product</a> by Takeshi Ogita, Siegfried M. Rump,
     * and Shin'ichi Oishi published in SIAM J. Sci. Comput.
     *
     * @param a Factors.
     * @param b Factors.
     * @return <code>&Sigma;<sub>i</sub> a<sub>i</sub> b<sub>i</sub></code>.
     * @throws DimensionMismatchException if arrays dimensions don't match
     */
    public static double linearCombination(final double[] a, final double[] b)
        throws DimensionMismatchException {
        checkEqualLength(a, b);
        final int len = a.length;

        if (len == 1) {
            // Revert to scalar multiplication.
            return a[0] * b[0];
        }

        final double[] prodHigh = new double[len];
        double prodLowSum = 0;

        for (int i = 0; i < len; i++) {
            final double ai    = a[i];
            final double aHigh = Double.longBitsToDouble(Double.doubleToRawLongBits(ai) & ((-1L) << 27));
            final double aLow  = ai - aHigh;

            final double bi    = b[i];
            final double bHigh = Double.longBitsToDouble(Double.doubleToRawLongBits(bi) & ((-1L) << 27));
            final double bLow  = bi - bHigh;
            prodHigh[i] = ai * bi;
            final double prodLow = aLow * bLow - (((prodHigh[i] -
                                                    aHigh * bHigh) -
                                                   aLow * bHigh) -
                                                  aHigh * bLow);
            prodLowSum += prodLow;
        }


        final double prodHighCur = prodHigh[0];
        double prodHighNext = prodHigh[1];
        double sHighPrev = prodHighCur + prodHighNext;
        double sPrime = sHighPrev - prodHighNext;
        double sLowSum = (prodHighNext - (sHighPrev - sPrime)) + (prodHighCur - sPrime);

        final int lenMinusOne = len - 1;
        for (int i = 1; i < lenMinusOne; i++) {
            prodHighNext = prodHigh[i + 1];
            final double sHighCur = sHighPrev + prodHighNext;
            sPrime = sHighCur - prodHighNext;
            sLowSum += (prodHighNext - (sHighCur - sPrime)) + (sHighPrev - sPrime);
            sHighPrev = sHighCur;
        }

        double result = sHighPrev + (prodLowSum + sLowSum);

        if (Double.isNaN(result)) {
            // either we have split infinite numbers or some coefficients were NaNs,
            // just rely on the naive implementation and let IEEE754 handle this
            result = 0;
            for (int i = 0; i < len; ++i) {
                result += a[i] * b[i];
            }
        }

        return result;
    }

    /**
     * Returns true iff both arguments are null or have same dimensions and all
     * their elements are equal as defined by
     * {@link Precision#equals(float,float)}.
     *
     * @param x first array
     * @param y second array
     * @return true if the values are both null or have same dimension
     * and equal elements.
     */
    public static boolean equals(float[] x, float[] y) {
        if ((x == null) || (y == null)) {
            return !((x == null) ^ (y == null));
        }
        if (x.length != y.length) {
            return false;
        }
        for (int i = 0; i < x.length; ++i) {
            if (!Precision.equals(x[i], y[i])) {
                return false;
            }
        }
        return true;
    }


    /**
     * Returns {@code true} iff both arguments are {@code null} or have same
     * dimensions and all their elements are equal as defined by
     * {@link Precision#equals(double,double)}.
     *
     * @param x First array.
     * @param y Second array.
     * @return {@code true} if the values are both {@code null} or have same
     * dimension and equal elements.
     */
    public static boolean equals(double[] x, double[] y) {
        if ((x == null) || (y == null)) {
            return !((x == null) ^ (y == null));
        }
        if (x.length != y.length) {
            return false;
        }
        for (int i = 0; i < x.length; ++i) {
            if (!Precision.equals(x[i], y[i])) {
                return false;
            }
        }
        return true;
    }
    /**
     * Returns an array representing the natural number {@code n}.
     *
     * @param n Natural number.
     * @return an array whose entries are the numbers 0, 1, ..., {@code n}-1.
     * If {@code n == 0}, the returned array is empty.
     */
    public static int[] natural(int n) {
        return sequence(n, 0, 1);
    }
    /**
     * Returns an array of {@code size} integers starting at {@code start},
     * skipping {@code stride} numbers.
     *
     * @param size Natural number.
     * @param start Natural number.
     * @param stride Natural number.
     * @return an array whose entries are the numbers
     * {@code start, start + stride, ..., start + (size - 1) * stride}.
     * If {@code size == 0}, the returned array is empty.
     *
     * @since 3.4
     */
    public static int[] sequence(int size,
                                 int start,
                                 int stride) {
        final int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = start + i * stride;
        }
        return a;
    }
    /**
     * This method is used
     * to verify that the input parameters designate a subarray of positive length.
     * <p>
     * <ul>
     * <li>returns <code>true</code> iff the parameters designate a subarray of
     * non-negative length</li>
     * <li>throws <code>IllegalArgumentException</code> if the array is null or
     * or the indices are invalid</li>
     * <li>returns <code>false</li> if the array is non-null, but
     * <code>length</code> is 0 unless <code>allowEmpty</code> is <code>true</code>
     * </ul></p>
     *
     * @param values the input array
     * @param begin index of the first array element to include
     * @param length the number of elements to include
     * @param allowEmpty if <code>true</code> then zero length arrays are allowed
     * @return true if the parameters are valid
     * @throws MathIllegalArgumentException if the indices are invalid or the array is null
     * @since 3.3
     */
    public static boolean verifyValues(final double[] values, final int begin,
            final int length, final boolean allowEmpty) throws MathIllegalArgumentException {

        if (values == null) {
            throw new NullArgumentException(LocalizedFormats.INPUT_ARRAY);
        }

        if (begin < 0) {
            throw new NotPositiveException(LocalizedFormats.START_POSITION, Integer.valueOf(begin));
        }

        if (length < 0) {
            throw new NotPositiveException(LocalizedFormats.LENGTH, Integer.valueOf(length));
        }

        if (begin + length > values.length) {
            throw new NumberIsTooLargeException(LocalizedFormats.SUBARRAY_ENDS_AFTER_ARRAY_END,
                    Integer.valueOf(begin + length), Integer.valueOf(values.length), true);
        }

        if (length == 0 && !allowEmpty) {
            return false;
        }

        return true;

    }
    /**
     * This method is used
     * to verify that the begin and length parameters designate a subarray of positive length
     * and the weights are all non-negative, non-NaN, finite, and not all zero.
     * <p>
     * <ul>
     * <li>returns <code>true</code> iff the parameters designate a subarray of
     * non-negative length and the weights array contains legitimate values.</li>
     * <li>throws <code>MathIllegalArgumentException</code> if any of the following are true:
     * <ul><li>the values array is null</li>
     *     <li>the weights array is null</li>
     *     <li>the weights array does not have the same length as the values array</li>
     *     <li>the weights array contains one or more infinite values</li>
     *     <li>the weights array contains one or more NaN values</li>
     *     <li>the weights array contains negative values</li>
     *     <li>the start and length arguments do not determine a valid array</li></ul>
     * </li>
     * <li>returns <code>false</li> if the array is non-null, but
     * <code>length</code> is 0 unless <code>allowEmpty</code> is <code>true</code>.
     * </ul></p>
     *
     * @param values the input array.
     * @param weights the weights array.
     * @param begin index of the first array element to include.
     * @param length the number of elements to include.
     * @param allowEmpty if {@code true} than allow zero length arrays to pass.
     * @return {@code true} if the parameters are valid.
     * @throws NullArgumentException if either of the arrays are null
     * @throws MathIllegalArgumentException if the array indices are not valid,
     * the weights array contains NaN, infinite or negative elements, or there
     * are no positive weights.
     * @since 3.3
     */
    public static boolean verifyValues(final double[] values, final double[] weights,
            final int begin, final int length, final boolean allowEmpty) throws MathIllegalArgumentException {

        if (weights == null || values == null) {
            throw new NullArgumentException(LocalizedFormats.INPUT_ARRAY);
        }

        checkEqualLength(weights, values);

        boolean containsPositiveWeight = false;
        for (int i = begin; i < begin + length; i++) {
            final double weight = weights[i];
            if (Double.isNaN(weight)) {
                throw new MathIllegalArgumentException(LocalizedFormats.NAN_ELEMENT_AT_INDEX, Integer.valueOf(i));
            }
            if (Double.isInfinite(weight)) {
                throw new MathIllegalArgumentException(LocalizedFormats.INFINITE_ARRAY_ELEMENT, Double.valueOf(weight), Integer.valueOf(i));
            }
            if (weight < 0) {
                throw new MathIllegalArgumentException(LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX, Integer.valueOf(i), Double.valueOf(weight));
            }
            if (!containsPositiveWeight && weight > 0.0) {
                containsPositiveWeight = true;
            }
        }

        if (!containsPositiveWeight) {
            throw new MathIllegalArgumentException(LocalizedFormats.WEIGHT_AT_LEAST_ONE_NON_ZERO);
        }

        return verifyValues(values, begin, length, allowEmpty);
    }

    /**
     * Returns an array consisting of the unique values in {@code data}.
     * The return array is sorted in descending order.  Empty arrays
     * are allowed, but null arrays result in NullPointerException.
     * Infinities are allowed.  NaN values are allowed with maximum
     * sort order - i.e., if there are NaN values in {@code data},
     * {@code Double.NaN} will be the first element of the output array,
     * even if the array also contains {@code Double.POSITIVE_INFINITY}.
     *
     * @param data array to scan
     * @return descending list of values included in the input array
     * @throws NullPointerException if data is null
     * @since 3.6
     */
    public static double[] unique(double[] data) {
        TreeSet<Double> values = new TreeSet<Double>();
        for (int i = 0; i < data.length; i++) {
            values.add(data[i]);
        }
        final int count = values.size();
        final double[] out = new double[count];
        Iterator<Double> iterator = values.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            out[count - ++i] = iterator.next();
        }
        return out;
    }
}
