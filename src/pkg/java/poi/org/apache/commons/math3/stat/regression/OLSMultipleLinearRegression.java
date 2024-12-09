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
package poi.org.apache.commons.math3.stat.regression;

import poi.org.apache.commons.math3.exception.MathIllegalArgumentException;
import poi.org.apache.commons.math3.linear.QRDecomposition;
import poi.org.apache.commons.math3.linear.RealVector;
import poi.org.apache.commons.math3.linear.SingularMatrixException;

/**
 * <p>Implements ordinary least squares (OLS) to estimate the parameters of a
 * multiple linear regression model.</p>
 *
 * <p>The regression coefficients, <code>b</code>, satisfy the normal equations:
 * <pre><code> X<sup>T</sup> X b = X<sup>T</sup> y </code></pre></p>
 *
 * <p>To solve the normal equations, this implementation uses QR decomposition
 * of the <code>X</code> matrix. (See {@link QRDecomposition} for details on the
 * decomposition algorithm.) The <code>X</code> matrix, also known as the <i>design matrix,</i>
 * has rows corresponding to sample observations and columns corresponding to independent
 * variables.  When the model is estimated using an intercept term (i.e. when
 * {@link #isNoIntercept() isNoIntercept} is false as it is by default), the <code>X</code>
 * matrix includes an initial column identically equal to 1.  We solve the normal equations
 * as follows:
 * <pre><code> X<sup>T</sup>X b = X<sup>T</sup> y
 * (QR)<sup>T</sup> (QR) b = (QR)<sup>T</sup>y
 * R<sup>T</sup> (Q<sup>T</sup>Q) R b = R<sup>T</sup> Q<sup>T</sup> y
 * R<sup>T</sup> R b = R<sup>T</sup> Q<sup>T</sup> y
 * (R<sup>T</sup>)<sup>-1</sup> R<sup>T</sup> R b = (R<sup>T</sup>)<sup>-1</sup> R<sup>T</sup> Q<sup>T</sup> y
 * R b = Q<sup>T</sup> y </code></pre></p>
 *
 * <p>Given <code>Q</code> and <code>R</code>, the last equation is solved by back-substitution.</p>
 *
 * @since 2.0
 */
public class OLSMultipleLinearRegression extends AbstractMultipleLinearRegression {

    /** Cached QR decomposition of X matrix */
    private QRDecomposition qr = null;

    /** Singularity threshold for QR decomposition */
    private final double threshold;

    /**
     * Create an empty OLSMultipleLinearRegression instance.
     */
    public OLSMultipleLinearRegression() {
        this(0d);
    }

    /**
     * Create an empty OLSMultipleLinearRegression instance, using the given
     * singularity threshold for the QR decomposition.
     *
     * @param threshold the singularity threshold
     * @since 3.3
     */
    public OLSMultipleLinearRegression(final double threshold) {
        this.threshold = threshold;
    }

    /**
     * Loads model x and y sample data, overriding any previous sample.
     *
     * Computes and caches QR decomposition of the X matrix.
     * @param y the [n,1] array representing the y sample
     * @param x the [n,k] array representing the x sample
     * @throws MathIllegalArgumentException if the x and y array data are not
     *             compatible for the regression
     */
    public void newSampleData(double[] y, double[][] x) throws MathIllegalArgumentException {
        validateSampleData(x, y);
        newYSampleData(y);
        newXSampleData(x);
    }


    /**
     * {@inheritDoc}
     * <p>This implementation computes and caches the QR decomposition of the X matrix
     * once it is successfully loaded.</p>
     */
    @Override
    protected void newXSampleData(double[][] x) {
        super.newXSampleData(x);
        qr = new QRDecomposition(getX(), threshold);
    }

    /**
     * Calculates the regression coefficients using OLS.
     *
     * <p>Data for the model must have been successfully loaded using one of
     * the {@code newSampleData} methods before invoking this method; otherwise
     * a {@code NullPointerException} will be thrown.</p>
     *
     * @return beta
     * @throws SingularMatrixException if the design matrix is singular
     * @throws NullPointerException if the data for the model have not been loaded
     */
    @Override
    protected RealVector calculateBeta() {
        return qr.getSolver().solve(getY());
    }

}
