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

package poi.org.apache.commons.math3.linear;

import poi.org.apache.commons.math3.exception.DimensionMismatchException;
import poi.org.apache.commons.math3.exception.NoDataException;
import poi.org.apache.commons.math3.exception.NotPositiveException;
import poi.org.apache.commons.math3.exception.NotStrictlyPositiveException;
import poi.org.apache.commons.math3.exception.NullArgumentException;
import poi.org.apache.commons.math3.exception.NumberIsTooSmallException;
import poi.org.apache.commons.math3.exception.OutOfRangeException;

/**
 * Interface defining a real-valued matrix with basic algebraic operations.
 * <p>
 * Matrix element indexing is 0-based -- e.g., <code>getEntry(0, 0)</code>
 * returns the element in the first row, first column of the matrix.</p>
 *
 */
public interface RealMatrix extends AnyMatrix {

    /**
     * Create a new RealMatrix of the same type as the instance with the
     * supplied
     * row and column dimensions.
     *
     * @param rowDimension the number of rows in the new matrix
     * @param columnDimension the number of columns in the new matrix
     * @return a new matrix of the same type as the instance
     * @throws NotStrictlyPositiveException if row or column dimension is not
     * positive.
     * @since 2.0
     */
    RealMatrix createMatrix(int rowDimension, int columnDimension)
        throws NotStrictlyPositiveException;

    /**
     * Returns a (deep) copy of this.
     *
     * @return matrix copy
     */
    RealMatrix copy();


    /**
     * Returns the result of postmultiplying {@code this} by {@code m}.
     *
     * @param m matrix to postmultiply by
     * @return {@code this * m}
     * @throws DimensionMismatchException if
     * {@code columnDimension(this) != rowDimension(m)}
     */
    RealMatrix multiply(RealMatrix m)
        throws DimensionMismatchException;

    /**
     * Returns the result of multiplying {@code this} with itself {@code p}
     * times. Depending on the underlying storage, instability for high powers
     * might occur.
     *
     * @param p raise {@code this} to power {@code p}
     * @return {@code this^p}
     * @throws NotPositiveException if {@code p < 0}
     * @throws NonSquareMatrixException if the matrix is not square
     */
    RealMatrix power(final int p)
        throws NotPositiveException, NonSquareMatrixException;

    /**
     * Returns matrix entries as a two-dimensional array.
     *
     * @return 2-dimensional array of entries
     */
    double[][] getData();

//    /**
//     * Returns the <a href="http://mathworld.wolfram.com/MaximumAbsoluteRowSumNorm.html">
//     * maximum absolute row sum norm</a> of the matrix.
//     *
//     * @return norm
//     */
//    double getNorm();

    /**
     * Gets a submatrix. Rows and columns are indicated
     * counting from 0 to n-1.
     *
     * @param startRow Initial row index
     * @param endRow Final row index (inclusive)
     * @param startColumn Initial column index
     * @param endColumn Final column index (inclusive)
     * @return The subMatrix containing the data of the
     * specified rows and columns.
     * @throws OutOfRangeException if the indices are not valid.
     * @throws NumberIsTooSmallException if {@code endRow < startRow} or
     * {@code endColumn < startColumn}.
     */
    RealMatrix getSubMatrix(int startRow, int endRow, int startColumn,
                            int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException;


    /**
     * Copy a submatrix. Rows and columns are indicated counting from 0 to n-1.
     *
     * @param startRow Initial row index
     * @param endRow Final row index (inclusive)
     * @param startColumn Initial column index
     * @param endColumn Final column index (inclusive)
     * @param destination The arrays where the submatrix data should be copied
     * (if larger than rows/columns counts, only the upper-left part will be
     * used)
     * @throws OutOfRangeException if the indices are not valid.
     * @throws NumberIsTooSmallException if {@code endRow < startRow} or
     * {@code endColumn < startColumn}.
     * @throws MatrixDimensionMismatchException if the destination array is too
     * small.
     */
    void copySubMatrix(int startRow, int endRow, int startColumn,
                       int endColumn, double[][] destination)
        throws OutOfRangeException, NumberIsTooSmallException,
        MatrixDimensionMismatchException;
   /**
    * Replace the submatrix starting at {@code row, column} using data in the
    * input {@code subMatrix} array. Indexes are 0-based.
    * <p>
    * Example:<br>
    * Starting with <pre>
    * 1  2  3  4
    * 5  6  7  8
    * 9  0  1  2
    * </pre>
    * and <code>subMatrix = {{3, 4} {5,6}}</code>, invoking
    * {@code setSubMatrix(subMatrix,1,1))} will result in <pre>
    * 1  2  3  4
    * 5  3  4  8
    * 9  5  6  2
    * </pre></p>
    *
    * @param subMatrix  array containing the submatrix replacement data
    * @param row  row coordinate of the top, left element to be replaced
    * @param column  column coordinate of the top, left element to be replaced
    * @throws NoDataException if {@code subMatrix} is empty.
    * @throws OutOfRangeException if {@code subMatrix} does not fit into
    * this matrix from element in {@code (row, column)}.
    * @throws DimensionMismatchException if {@code subMatrix} is not rectangular
    * (not all rows have the same length) or empty.
    * @throws NullArgumentException if {@code subMatrix} is {@code null}.
    * @since 2.0
    */
    void setSubMatrix(double[][] subMatrix, int row, int column)
        throws NoDataException, OutOfRangeException,
        DimensionMismatchException, NullArgumentException;

    /**
     * Get the entries at the given row index. Row indices start at 0.
     *
     * @param row Row to be fetched.
     * @return the array of entries in the row.
     * @throws OutOfRangeException if the specified row index is not valid.
     */
    double[] getRow(int row) throws OutOfRangeException;

    /**
     * Get the entries at the given column index as an array. Column indices
     * start at 0.
     *
     * @param column Column to be fetched.
     * @return the array of entries in the column.
     * @throws OutOfRangeException if the specified column index is not valid.
     */
    double[] getColumn(int column) throws OutOfRangeException;

    /**
     * Get the entry in the specified row and column. Row and column indices
     * start at 0.
     *
     * @param row Row index of entry to be fetched.
     * @param column Column index of entry to be fetched.
     * @return the matrix entry at {@code (row, column)}.
     * @throws OutOfRangeException if the row or column index is not valid.
     */
    double getEntry(int row, int column) throws OutOfRangeException;

    /**
     * Set the entry in the specified row and column. Row and column indices
     * start at 0.
     *
     * @param row Row index of entry to be set.
     * @param column Column index of entry to be set.
     * @param value the new value of the entry.
     * @throws OutOfRangeException if the row or column index is not valid
     * @since 2.0
     */
    void setEntry(int row, int column, double value) throws OutOfRangeException;

    /**
     * Returns the transpose of this matrix.
     *
     * @return transpose matrix
     */
    RealMatrix transpose();

    /**
     * Returns the result of multiplying this by the vector {@code v}.
     *
     * @param v the vector to operate on
     * @return {@code this * v}
     * @throws DimensionMismatchException if the length of {@code v} does not
     * match the column dimension of {@code this}.
     */
    double[] operate(double[] v) throws DimensionMismatchException;

    /**
     * Returns the result of multiplying this by the vector {@code v}.
     *
     * @param v the vector to operate on
     * @return {@code this * v}
     * @throws DimensionMismatchException if the dimension of {@code v} does not
     * match the column dimension of {@code this}.
     */
    RealVector operate(RealVector v) throws DimensionMismatchException;


}
