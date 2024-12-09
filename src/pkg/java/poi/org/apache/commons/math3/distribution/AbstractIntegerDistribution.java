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

import java.io.Serializable;

import poi.org.apache.commons.math3.random.RandomGenerator;
import poi.org.apache.commons.math3.util.FastMath;

/**
 * Base class for integer-valued discrete distributions.  Default
 * implementations are provided for some of the methods that do not vary
 * from distribution to distribution.
 *
 */
public abstract class AbstractIntegerDistribution implements IntegerDistribution, Serializable {

    /** Serializable version identifier */
    private static final long serialVersionUID = -1146319659338487221L;

    /**
     * RNG instance used to generate samples from the distribution.
     * @since 3.1
     */
    protected final RandomGenerator random;

    /**
     * @param rng Random number generator.
     * @since 3.1
     */
    protected AbstractIntegerDistribution(RandomGenerator rng) {
        random = rng;
    }

    /**
     * For a random variable {@code X} whose values are distributed according to
     * this distribution, this method returns {@code log(P(X = x))}, where
     * {@code log} is the natural logarithm. In other words, this method
     * represents the logarithm of the probability mass function (PMF) for the
     * distribution. Note that due to the floating point precision and
     * under/overflow issues, this method will for some distributions be more
     * precise and faster than computing the logarithm of
     * {@link #probability(int)}.
     * <p>
     * The default implementation simply computes the logarithm of {@code probability(x)}.</p>
     *
     * @param x the point at which the PMF is evaluated
     * @return the logarithm of the value of the probability mass function at {@code x}
     */
    public double logProbability(int x) {
        return FastMath.log(probability(x));
    }
}
