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
package poi.org.apache.commons.math3.stat.correlation;

import poi.org.apache.commons.math3.exception.DimensionMismatchException;
import poi.org.apache.commons.math3.exception.MathIllegalArgumentException;
import poi.org.apache.commons.math3.exception.util.LocalizedFormats;
import poi.org.apache.commons.math3.linear.RealMatrix;
import poi.org.apache.commons.math3.stat.regression.SimpleRegression;

/**
 * Computes Pearson's product-moment correlation coefficients for pairs of arrays
 * or columns of a matrix.
 *
 * <p>The constructors that take <code>RealMatrix</code> or
 * <code>double[][]</code> arguments generate correlation matrices.  The
 * columns of the input matrices are assumed to represent variable values.
 * Correlations are given by the formula</p>
 *
 * <p><code>cor(X, Y) = &Sigma;[(x<sub>i</sub> - E(X))(y<sub>i</sub> - E(Y))] / [(n - 1)s(X)s(Y)]</code>
 * where <code>E(X)</code> is the mean of <code>X</code>, <code>E(Y)</code>
 * is the mean of the <code>Y</code> values and s(X), s(Y) are standard deviations.</p>
 *
 * <p>To compute the correlation coefficient for a single pair of arrays, use {@link #PearsonsCorrelation()}
 * to construct an instance with no data and then {@link #correlation(double[], double[])}.
 * Correlation matrices can also be computed directly from an instance with no data using
 * {@link #computeCorrelationMatrix(double[][])}. In order to use {@link #getCorrelationMatrix()},
 * {@link #getCorrelationPValues()},  or {@link #getCorrelationStandardErrors()}; however, one of the
 * constructors supplying data or a covariance matrix must be used to create the instance.</p>
 *
 * @since 2.0
 */
public class PearsonsCorrelation {

    /** correlation matrix */
    private final RealMatrix correlationMatrix;

    /** number of observations */
    private final int nObs;

    /**
     * Create a PearsonsCorrelation instance without data.
     */
    public PearsonsCorrelation() {
        super();
        correlationMatrix = null;
        nObs = 0;
    }

    /**
     * Computes the Pearson's product-moment correlation coefficient between two arrays.
     *
     * <p>Throws MathIllegalArgumentException if the arrays do not have the same length
     * or their common length is less than 2.  Returns {@code NaN} if either of the arrays
     * has zero variance (i.e., if one of the arrays does not contain at least two distinct
     * values).</p>
     *
     * @param xArray first data array
     * @param yArray second data array
     * @return Returns Pearson's correlation coefficient for the two arrays
     * @throws DimensionMismatchException if the arrays lengths do not match
     * @throws MathIllegalArgumentException if there is insufficient data
     */
    public double correlation(final double[] xArray, final double[] yArray) {
        SimpleRegression regression = new SimpleRegression();
        if (xArray.length != yArray.length) {
            throw new DimensionMismatchException(xArray.length, yArray.length);
        } else if (xArray.length < 2) {
            throw new MathIllegalArgumentException(LocalizedFormats.INSUFFICIENT_DIMENSION,
                    xArray.length, 2);
        } else {
            for(int i=0; i<xArray.length; i++) {
                regression.addData(xArray[i], yArray[i]);
            }
            return regression.getR();
        }
    }

}
