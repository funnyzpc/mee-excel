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


/**
 * An interface for regression models allowing for dynamic updating of the data.
 * That is, the entire data set need not be loaded into memory. As observations
 * become available, they can be added to the regression  model and an updated
 * estimate regression statistics can be calculated.
 *
 * @since 3.0
 */
public interface UpdatingMultipleLinearRegression {

    /**
     * Returns true if a constant has been included false otherwise.
     *
     * @return true if constant exists, false otherwise
     */
    boolean hasIntercept();

    /**
     * Returns the number of observations added to the regression model.
     *
     * @return Number of observations
     */
    long getN();


    /**
     * Clears internal buffers and resets the regression model. This means all
     * data and derived values are initialized
     */
    void clear();

}
