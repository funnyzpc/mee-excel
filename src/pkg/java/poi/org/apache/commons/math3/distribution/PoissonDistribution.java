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
package poi.org.apache.commons.math3.distribution;

import poi.org.apache.commons.math3.exception.NotStrictlyPositiveException;
import poi.org.apache.commons.math3.exception.util.LocalizedFormats;
import poi.org.apache.commons.math3.random.RandomGenerator;
import poi.org.apache.commons.math3.random.Well19937c;
import poi.org.apache.commons.math3.special.Gamma;
import poi.org.apache.commons.math3.util.FastMath;
import poi.org.apache.commons.math3.util.MathUtils;

/**
 * Implementation of the Poisson distribution.
 *
 * @see <a href="http://en.wikipedia.org/wiki/Poisson_distribution">Poisson distribution (Wikipedia)</a>
 * @see <a href="http://mathworld.wolfram.com/PoissonDistribution.html">Poisson distribution (MathWorld)</a>
 */
public class PoissonDistribution extends AbstractIntegerDistribution {
    /**
     * Default maximum number of iterations for cumulative probability calculations.
     * @since 2.1
     */
    public static final int DEFAULT_MAX_ITERATIONS = 10000000;
    /**
     * Default convergence criterion.
     * @since 2.1
     */
    public static final double DEFAULT_EPSILON = 1e-12;
    /** Serializable version identifier. */
    private static final long serialVersionUID = -3349935121172596109L;
    /** Distribution used to compute normal approximation. */
    private final NormalDistribution normal;
    /** Distribution needed for the {@link #sample()} method. */
    private final ExponentialDistribution exponential;
    /** Mean of the distribution. */
    private final double mean;

    /**
     * Maximum number of iterations for cumulative probability. Cumulative
     * probabilities are estimated using either Lanczos series approximation
     * of {@link Gamma#regularizedGammaP(double, double, double, int)}
     * or continued fraction approximation of
     * {@link Gamma#regularizedGammaQ(double, double, double, int)}.
     */
    private final int maxIterations;

    /** Convergence criterion for cumulative probability. */
    private final double epsilon;

    /**
     * Creates a new Poisson distribution with specified mean.
     * <p>
     * <b>Note:</b> this constructor will implicitly create an instance of
     * {@link Well19937c} as random generator to be used for sampling only (see
     * {@link #sample()} and {@link #sample(int)}). In case no sampling is
     * needed for the created distribution, it is advised to pass {@code null}
     * as random generator via the appropriate constructors to avoid the
     * additional initialisation overhead.
     *
     * @param p the Poisson mean
     * @throws NotStrictlyPositiveException if {@code p <= 0}.
     */
    public PoissonDistribution(double p) throws NotStrictlyPositiveException {
        this(p, DEFAULT_EPSILON, DEFAULT_MAX_ITERATIONS);
    }

    /**
     * Creates a new Poisson distribution with specified mean, convergence
     * criterion and maximum number of iterations.
     * <p>
     * <b>Note:</b> this constructor will implicitly create an instance of
     * {@link Well19937c} as random generator to be used for sampling only (see
     * {@link #sample()} and {@link #sample(int)}). In case no sampling is
     * needed for the created distribution, it is advised to pass {@code null}
     * as random generator via the appropriate constructors to avoid the
     * additional initialisation overhead.
     *
     * @param p Poisson mean.
     * @param epsilon Convergence criterion for cumulative probabilities.
     * @param maxIterations the maximum number of iterations for cumulative
     * probabilities.
     * @throws NotStrictlyPositiveException if {@code p <= 0}.
     * @since 2.1
     */
    public PoissonDistribution(double p, double epsilon, int maxIterations)
    throws NotStrictlyPositiveException {
        this(new Well19937c(), p, epsilon, maxIterations);
    }

    /**
     * Creates a new Poisson distribution with specified mean, convergence
     * criterion and maximum number of iterations.
     *
     * @param rng Random number generator.
     * @param p Poisson mean.
     * @param epsilon Convergence criterion for cumulative probabilities.
     * @param maxIterations the maximum number of iterations for cumulative
     * probabilities.
     * @throws NotStrictlyPositiveException if {@code p <= 0}.
     * @since 3.1
     */
    public PoissonDistribution(RandomGenerator rng,
                               double p,
                               double epsilon,
                               int maxIterations)
    throws NotStrictlyPositiveException {
        super(rng);

        if (p <= 0) {
            throw new NotStrictlyPositiveException(LocalizedFormats.MEAN, p);
        }
        mean = p;
        this.epsilon = epsilon;
        this.maxIterations = maxIterations;

        // Use the same RNG instance as the parent class.
        normal = new NormalDistribution(rng, p, FastMath.sqrt(p),
                                        NormalDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
        exponential = new ExponentialDistribution(rng, 1,
                                                  ExponentialDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
    }
    /**
     * Get the mean for the distribution.
     *
     * @return the mean for the distribution.
     */
    public double getMean() {
        return mean;
    }

    /** {@inheritDoc} */
    public double probability(int x) {
        final double logProbability = logProbability(x);
        return logProbability == Double.NEGATIVE_INFINITY ? 0 : FastMath.exp(logProbability);
    }

    /** {@inheritDoc} */
    @Override
    public double logProbability(int x) {
        double ret;
        if (x < 0 || x == Integer.MAX_VALUE) {
            ret = Double.NEGATIVE_INFINITY;
        } else if (x == 0) {
            ret = -mean;
        } else {
            ret = -SaddlePointExpansion.getStirlingError(x) -
                  SaddlePointExpansion.getDeviancePart(x, mean) -
                  0.5 * FastMath.log(MathUtils.TWO_PI) - 0.5 * FastMath.log(x);
        }
        return ret;
    }

    /** {@inheritDoc} */
    public double cumulativeProbability(int x) {
        if (x < 0) {
            return 0;
        }
        if (x == Integer.MAX_VALUE) {
            return 1;
        }
        return Gamma.regularizedGammaQ((double) x + 1, mean, epsilon,
                                       maxIterations);
    }

}
