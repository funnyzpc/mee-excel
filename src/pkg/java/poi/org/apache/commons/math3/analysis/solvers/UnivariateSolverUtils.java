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
package poi.org.apache.commons.math3.analysis.solvers;

import poi.org.apache.commons.math3.analysis.UnivariateFunction;
import poi.org.apache.commons.math3.exception.NoBracketingException;
import poi.org.apache.commons.math3.exception.NullArgumentException;
import poi.org.apache.commons.math3.exception.NumberIsTooLargeException;
import poi.org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * Utility routines for {@link UnivariateSolver} objects.
 *
 */
public class UnivariateSolverUtils {
    /**
     * Class contains only static methods.
     */
    private UnivariateSolverUtils() {}

    /**
     * Convenience method to find a zero of a univariate real function.  A default
     * solver is used.
     *
     * @param function Function.
     * @param x0 Lower bound for the interval.
     * @param x1 Upper bound for the interval.
     * @return a value where the function is zero.
     * @throws NoBracketingException if the function has the same sign at the
     * endpoints.
     * @throws NullArgumentException if {@code function} is {@code null}.
     */
    public static double solve(UnivariateFunction function, double x0, double x1)
        throws NullArgumentException,
               NoBracketingException {
        if (function == null) {
            throw new NullArgumentException(LocalizedFormats.FUNCTION);
        }
        final UnivariateSolver solver = new BrentSolver();
        return solver.solve(Integer.MAX_VALUE, function, x0, x1);
    }

    /**
     * Convenience method to find a zero of a univariate real function.  A default
     * solver is used.
     *
     * @param function Function.
     * @param x0 Lower bound for the interval.
     * @param x1 Upper bound for the interval.
     * @param absoluteAccuracy Accuracy to be used by the solver.
     * @return a value where the function is zero.
     * @throws NoBracketingException if the function has the same sign at the
     * endpoints.
     * @throws NullArgumentException if {@code function} is {@code null}.
     */
    public static double solve(UnivariateFunction function,
                               double x0, double x1,
                               double absoluteAccuracy)
        throws NullArgumentException,
               NoBracketingException {
        if (function == null) {
            throw new NullArgumentException(LocalizedFormats.FUNCTION);
        }
        final UnivariateSolver solver = new BrentSolver(absoluteAccuracy);
        return solver.solve(Integer.MAX_VALUE, function, x0, x1);
    }

    /**
     * Check that the endpoints specify an interval.
     *
     * @param lower Lower endpoint.
     * @param upper Upper endpoint.
     * @throws NumberIsTooLargeException if {@code lower >= upper}.
     */
    public static void verifyInterval(final double lower,
                                      final double upper)
        throws NumberIsTooLargeException {
        if (lower >= upper) {
            throw new NumberIsTooLargeException(LocalizedFormats.ENDPOINTS_NOT_AN_INTERVAL,
                                                lower, upper, false);
        }
    }

    /**
     * Check that {@code lower < initial < upper}.
     *
     * @param lower Lower endpoint.
     * @param initial Initial value.
     * @param upper Upper endpoint.
     * @throws NumberIsTooLargeException if {@code lower >= initial} or
     * {@code initial >= upper}.
     */
    public static void verifySequence(final double lower,
                                      final double initial,
                                      final double upper)
        throws NumberIsTooLargeException {
        verifyInterval(lower, initial);
        verifyInterval(initial, upper);
    }

}
