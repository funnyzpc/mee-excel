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

import java.io.Serializable;

import poi.org.apache.commons.math3.exception.DimensionMismatchException;
import poi.org.apache.commons.math3.exception.NoDataException;
import poi.org.apache.commons.math3.exception.NotStrictlyPositiveException;
import poi.org.apache.commons.math3.exception.NullArgumentException;
import poi.org.apache.commons.math3.exception.NumberIsTooSmallException;
import poi.org.apache.commons.math3.exception.OutOfRangeException;
import poi.org.apache.commons.math3.exception.util.LocalizedFormats;
import poi.org.apache.commons.math3.util.FastMath;
import poi.org.apache.commons.math3.util.MathUtils;

/**
 * Cache-friendly implementation of RealMatrix using a flat arrays to store
 * square blocks of the matrix.
 * <p>
 * This implementation is specially designed to be cache-friendly. Square blocks are
 * stored as small arrays and allow efficient traversal of data both in row major direction
 * and columns major direction, one block at a time. This greatly increases performances
 * for algorithms that use crossed directions loops like multiplication or transposition.
 * </p>
 * <p>
 * The size of square blocks is a static parameter. It may be tuned according to the cache
 * size of the target computer processor. As a rule of thumbs, it should be the largest
 * value that allows three blocks to be simultaneously cached (this is necessary for example
 * for matrix multiplication). The default value is to use 52x52 blocks which is well suited
 * for processors with 64k L1 cache (one block holds 2704 values or 21632 bytes). This value
 * could be lowered to 36x36 for processors with 32k L1 cache.
 * </p>
 * <p>
 * The regular blocks represent {@link #BLOCK_SIZE} x {@link #BLOCK_SIZE} squares. Blocks
 * at right hand side and bottom side which may be smaller to fit matrix dimensions. The square
 * blocks are flattened in row major order in single dimension arrays which are therefore
 * {@link #BLOCK_SIZE}<sup>2</sup> elements long for regular blocks. The blocks are themselves
 * organized in row major order.
 * </p>
 * <p>
 * As an example, for a block size of 52x52, a 100x60 matrix would be stored in 4 blocks.
 * Block 0 would be a double[2704] array holding the upper left 52x52 square, block 1 would be
 * a double[416] array holding the upper right 52x8 rectangle, block 2 would be a double[2496]
 * array holding the lower left 48x52 rectangle and block 3 would be a double[384] array
 * holding the lower right 48x8 rectangle.
 * </p>
 * <p>
 * The layout complexity overhead versus simple mapping of matrices to java
 * arrays is negligible for small matrices (about 1%). The gain from cache efficiency leads
 * to up to 3-fold improvements for matrices of moderate to large size.
 * </p>
 * @since 2.0
 */
public class BlockRealMatrix extends AbstractRealMatrix implements Serializable {
    /** Block size. */
    public static final int BLOCK_SIZE = 52;
    /** Serializable version identifier */
    private static final long serialVersionUID = 4991895511313664478L;
    /** Blocks of matrix entries. */
    private final double blocks[][];
    /** Number of rows of the matrix. */
    private final int rows;
    /** Number of columns of the matrix. */
    private final int columns;
    /** Number of block rows of the matrix. */
    private final int blockRows;
    /** Number of block columns of the matrix. */
    private final int blockColumns;

    /**
     * Create a new matrix with the supplied row and column dimensions.
     *
     * @param rows  the number of rows in the new matrix
     * @param columns  the number of columns in the new matrix
     * @throws NotStrictlyPositiveException if row or column dimension is not
     * positive.
     */
    public BlockRealMatrix(final int rows, final int columns)
        throws NotStrictlyPositiveException {
        super(rows, columns);
        this.rows = rows;
        this.columns = columns;

        // number of blocks
        blockRows = (rows + BLOCK_SIZE - 1) / BLOCK_SIZE;
        blockColumns = (columns + BLOCK_SIZE - 1) / BLOCK_SIZE;

        // allocate storage blocks, taking care of smaller ones at right and bottom
        blocks = createBlocksLayout(rows, columns);
    }

    /**
     * Create a new dense matrix copying entries from raw layout data.
     * <p>The input array <em>must</em> already be in raw layout.</p>
     * <p>Calling this constructor is equivalent to call:
     * <pre>matrix = new BlockRealMatrix(rawData.length, rawData[0].length,
     *                                   toBlocksLayout(rawData), false);</pre>
     * </p>
     *
     * @param rawData data for new matrix, in raw layout
     * @throws DimensionMismatchException if the shape of {@code blockData} is
     * inconsistent with block layout.
     * @throws NotStrictlyPositiveException if row or column dimension is not
     * positive.
     * @see #BlockRealMatrix(int, int, double[][], boolean)
     */
    public BlockRealMatrix(final double[][] rawData)
        throws DimensionMismatchException, NotStrictlyPositiveException {
        this(rawData.length, rawData[0].length, toBlocksLayout(rawData), false);
    }

    /**
     * Create a new dense matrix copying entries from block layout data.
     * <p>The input array <em>must</em> already be in blocks layout.</p>
     *
     * @param rows Number of rows in the new matrix.
     * @param columns Number of columns in the new matrix.
     * @param blockData data for new matrix
     * @param copyArray Whether the input array will be copied or referenced.
     * @throws DimensionMismatchException if the shape of {@code blockData} is
     * inconsistent with block layout.
     * @throws NotStrictlyPositiveException if row or column dimension is not
     * positive.
     * @see #createBlocksLayout(int, int)
     * @see #toBlocksLayout(double[][])
     * @see #BlockRealMatrix(double[][])
     */
    public BlockRealMatrix(final int rows, final int columns,
                           final double[][] blockData, final boolean copyArray)
        throws DimensionMismatchException, NotStrictlyPositiveException {
        super(rows, columns);
        this.rows = rows;
        this.columns = columns;

        // number of blocks
        blockRows = (rows + BLOCK_SIZE - 1) / BLOCK_SIZE;
        blockColumns = (columns + BLOCK_SIZE - 1) / BLOCK_SIZE;

        if (copyArray) {
            // allocate storage blocks, taking care of smaller ones at right and bottom
            blocks = new double[blockRows * blockColumns][];
        } else {
            // reference existing array
            blocks = blockData;
        }

        int index = 0;
        for (int iBlock = 0; iBlock < blockRows; ++iBlock) {
            final int iHeight = blockHeight(iBlock);
            for (int jBlock = 0; jBlock < blockColumns; ++jBlock, ++index) {
                if (blockData[index].length != iHeight * blockWidth(jBlock)) {
                    throw new DimensionMismatchException(blockData[index].length,
                                                         iHeight * blockWidth(jBlock));
                }
                if (copyArray) {
                    blocks[index] = blockData[index].clone();
                }
            }
        }
    }

    /**
     * Convert a data array from raw layout to blocks layout.
     * <p>
     * Raw layout is the straightforward layout where element at row i and
     * column j is in array element <code>rawData[i][j]</code>. Blocks layout
     * is the layout used in {@link BlockRealMatrix} instances, where the matrix
     * is split in square blocks (except at right and bottom side where blocks may
     * be rectangular to fit matrix size) and each block is stored in a flattened
     * one-dimensional array.
     * </p>
     * <p>
     * This method creates an array in blocks layout from an input array in raw layout.
     * It can be used to provide the array argument of the {@link
     * #BlockRealMatrix(int, int, double[][], boolean)} constructor.
     * </p>
     * @param rawData Data array in raw layout.
     * @return a new data array containing the same entries but in blocks layout.
     * @throws DimensionMismatchException if {@code rawData} is not rectangular.
     * @see #createBlocksLayout(int, int)
     * @see #BlockRealMatrix(int, int, double[][], boolean)
     */
    public static double[][] toBlocksLayout(final double[][] rawData)
        throws DimensionMismatchException {
        final int rows = rawData.length;
        final int columns = rawData[0].length;
        final int blockRows = (rows    + BLOCK_SIZE - 1) / BLOCK_SIZE;
        final int blockColumns = (columns + BLOCK_SIZE - 1) / BLOCK_SIZE;

        // safety checks
        for (int i = 0; i < rawData.length; ++i) {
            final int length = rawData[i].length;
            if (length != columns) {
                throw new DimensionMismatchException(columns, length);
            }
        }

        // convert array
        final double[][] blocks = new double[blockRows * blockColumns][];
        int blockIndex = 0;
        for (int iBlock = 0; iBlock < blockRows; ++iBlock) {
            final int pStart = iBlock * BLOCK_SIZE;
            final int pEnd = FastMath.min(pStart + BLOCK_SIZE, rows);
            final int iHeight = pEnd - pStart;
            for (int jBlock = 0; jBlock < blockColumns; ++jBlock) {
                final int qStart = jBlock * BLOCK_SIZE;
                final int qEnd = FastMath.min(qStart + BLOCK_SIZE, columns);
                final int jWidth = qEnd - qStart;

                // allocate new block
                final double[] block = new double[iHeight * jWidth];
                blocks[blockIndex] = block;

                // copy data
                int index = 0;
                for (int p = pStart; p < pEnd; ++p) {
                    System.arraycopy(rawData[p], qStart, block, index, jWidth);
                    index += jWidth;
                }
                ++blockIndex;
            }
        }

        return blocks;
    }

    /**
     * Create a data array in blocks layout.
     * <p>
     * This method can be used to create the array argument of the {@link
     * #BlockRealMatrix(int, int, double[][], boolean)} constructor.
     * </p>
     * @param rows Number of rows in the new matrix.
     * @param columns Number of columns in the new matrix.
     * @return a new data array in blocks layout.
     * @see #toBlocksLayout(double[][])
     * @see #BlockRealMatrix(int, int, double[][], boolean)
     */
    public static double[][] createBlocksLayout(final int rows, final int columns) {
        final int blockRows = (rows    + BLOCK_SIZE - 1) / BLOCK_SIZE;
        final int blockColumns = (columns + BLOCK_SIZE - 1) / BLOCK_SIZE;

        final double[][] blocks = new double[blockRows * blockColumns][];
        int blockIndex = 0;
        for (int iBlock = 0; iBlock < blockRows; ++iBlock) {
            final int pStart = iBlock * BLOCK_SIZE;
            final int pEnd = FastMath.min(pStart + BLOCK_SIZE, rows);
            final int iHeight = pEnd - pStart;
            for (int jBlock = 0; jBlock < blockColumns; ++jBlock) {
                final int qStart = jBlock * BLOCK_SIZE;
                final int qEnd = FastMath.min(qStart + BLOCK_SIZE, columns);
                final int jWidth = qEnd - qStart;
                blocks[blockIndex] = new double[iHeight * jWidth];
                ++blockIndex;
            }
        }

        return blocks;
    }

    /** {@inheritDoc} */
    @Override
    public BlockRealMatrix createMatrix(final int rowDimension,
                                        final int columnDimension)
        throws NotStrictlyPositiveException {
        return new BlockRealMatrix(rowDimension, columnDimension);
    }

    /** {@inheritDoc} */
    @Override
    public BlockRealMatrix copy() {
        // create an empty matrix
        BlockRealMatrix copied = new BlockRealMatrix(rows, columns);

        // copy the blocks
        for (int i = 0; i < blocks.length; ++i) {
            System.arraycopy(blocks[i], 0, copied.blocks[i], 0, blocks[i].length);
        }

        return copied;
    }

    /** {@inheritDoc} */
    @Override
    public BlockRealMatrix multiply(final RealMatrix m)
        throws DimensionMismatchException {
        try {
            return multiply((BlockRealMatrix) m);
        } catch (ClassCastException cce) {
            // safety check
            MatrixUtils.checkMultiplicationCompatible(this, m);

            final BlockRealMatrix out = new BlockRealMatrix(rows, m.getColumnDimension());

            // perform multiplication block-wise, to ensure good cache behavior
            int blockIndex = 0;
            for (int iBlock = 0; iBlock < out.blockRows; ++iBlock) {
                final int pStart = iBlock * BLOCK_SIZE;
                final int pEnd = FastMath.min(pStart + BLOCK_SIZE, rows);

                for (int jBlock = 0; jBlock < out.blockColumns; ++jBlock) {
                    final int qStart = jBlock * BLOCK_SIZE;
                    final int qEnd = FastMath.min(qStart + BLOCK_SIZE, m.getColumnDimension());

                    // select current block
                    final double[] outBlock = out.blocks[blockIndex];

                    // perform multiplication on current block
                    for (int kBlock = 0; kBlock < blockColumns; ++kBlock) {
                        final int kWidth = blockWidth(kBlock);
                        final double[] tBlock = blocks[iBlock * blockColumns + kBlock];
                        final int rStart = kBlock * BLOCK_SIZE;
                        int k = 0;
                        for (int p = pStart; p < pEnd; ++p) {
                            final int lStart = (p - pStart) * kWidth;
                            final int lEnd = lStart + kWidth;
                            for (int q = qStart; q < qEnd; ++q) {
                                double sum = 0;
                                int r = rStart;
                                for (int l = lStart; l < lEnd; ++l) {
                                    sum += tBlock[l] * m.getEntry(r, q);
                                    ++r;
                                }
                                outBlock[k] += sum;
                                ++k;
                            }
                        }
                    }
                    // go to next block
                    ++blockIndex;
                }
            }

            return out;
        }
    }

    /**
     * Returns the result of postmultiplying this by {@code m}.
     *
     * @param m Matrix to postmultiply by.
     * @return {@code this} * m.
     * @throws DimensionMismatchException if the matrices are not compatible.
     */
    public BlockRealMatrix multiply(BlockRealMatrix m)
        throws DimensionMismatchException {
        // safety check
        MatrixUtils.checkMultiplicationCompatible(this, m);

        final BlockRealMatrix out = new BlockRealMatrix(rows, m.columns);

        // perform multiplication block-wise, to ensure good cache behavior
        int blockIndex = 0;
        for (int iBlock = 0; iBlock < out.blockRows; ++iBlock) {

            final int pStart = iBlock * BLOCK_SIZE;
            final int pEnd = FastMath.min(pStart + BLOCK_SIZE, rows);

            for (int jBlock = 0; jBlock < out.blockColumns; ++jBlock) {
                final int jWidth = out.blockWidth(jBlock);
                final int jWidth2 = jWidth  + jWidth;
                final int jWidth3 = jWidth2 + jWidth;
                final int jWidth4 = jWidth3 + jWidth;

                // select current block
                final double[] outBlock = out.blocks[blockIndex];

                // perform multiplication on current block
                for (int kBlock = 0; kBlock < blockColumns; ++kBlock) {
                    final int kWidth = blockWidth(kBlock);
                    final double[] tBlock = blocks[iBlock * blockColumns + kBlock];
                    final double[] mBlock = m.blocks[kBlock * m.blockColumns + jBlock];
                    int k = 0;
                    for (int p = pStart; p < pEnd; ++p) {
                        final int lStart = (p - pStart) * kWidth;
                        final int lEnd = lStart + kWidth;
                        for (int nStart = 0; nStart < jWidth; ++nStart) {
                            double sum = 0;
                            int l = lStart;
                            int n = nStart;
                            while (l < lEnd - 3) {
                                sum += tBlock[l] * mBlock[n] +
                                       tBlock[l + 1] * mBlock[n + jWidth] +
                                       tBlock[l + 2] * mBlock[n + jWidth2] +
                                       tBlock[l + 3] * mBlock[n + jWidth3];
                                l += 4;
                                n += jWidth4;
                            }
                            while (l < lEnd) {
                                sum += tBlock[l++] * mBlock[n];
                                n += jWidth;
                            }
                            outBlock[k] += sum;
                            ++k;
                        }
                    }
                }
                // go to next block
                ++blockIndex;
            }
        }

        return out;
    }

    /** {@inheritDoc} */
    @Override
    public double[][] getData() {
        final double[][] data = new double[getRowDimension()][getColumnDimension()];
        final int lastColumns = columns - (blockColumns - 1) * BLOCK_SIZE;

        for (int iBlock = 0; iBlock < blockRows; ++iBlock) {
            final int pStart = iBlock * BLOCK_SIZE;
            final int pEnd = FastMath.min(pStart + BLOCK_SIZE, rows);
            int regularPos = 0;
            int lastPos = 0;
            for (int p = pStart; p < pEnd; ++p) {
                final double[] dataP = data[p];
                int blockIndex = iBlock * blockColumns;
                int dataPos = 0;
                for (int jBlock = 0; jBlock < blockColumns - 1; ++jBlock) {
                    System.arraycopy(blocks[blockIndex++], regularPos, dataP, dataPos, BLOCK_SIZE);
                    dataPos += BLOCK_SIZE;
                }
                System.arraycopy(blocks[blockIndex], lastPos, dataP, dataPos, lastColumns);
                regularPos += BLOCK_SIZE;
                lastPos    += lastColumns;
            }
        }

        return data;
    }

    /** {@inheritDoc} */
    @Override
    public BlockRealMatrix getSubMatrix(final int startRow, final int endRow,
                                        final int startColumn,
                                        final int endColumn)
        throws OutOfRangeException, NumberIsTooSmallException {
        // safety checks
        MatrixUtils.checkSubMatrixIndex(this, startRow, endRow, startColumn, endColumn);

        // create the output matrix
        final BlockRealMatrix out =
            new BlockRealMatrix(endRow - startRow + 1, endColumn - startColumn + 1);

        // compute blocks shifts
        final int blockStartRow = startRow / BLOCK_SIZE;
        final int rowsShift = startRow % BLOCK_SIZE;
        final int blockStartColumn = startColumn / BLOCK_SIZE;
        final int columnsShift = startColumn % BLOCK_SIZE;

        // perform extraction block-wise, to ensure good cache behavior
        int pBlock = blockStartRow;
        for (int iBlock = 0; iBlock < out.blockRows; ++iBlock) {
            final int iHeight = out.blockHeight(iBlock);
            int qBlock = blockStartColumn;
            for (int jBlock = 0; jBlock < out.blockColumns; ++jBlock) {
                final int jWidth = out.blockWidth(jBlock);

                // handle one block of the output matrix
                final int outIndex = iBlock * out.blockColumns + jBlock;
                final double[] outBlock = out.blocks[outIndex];
                final int index = pBlock * blockColumns + qBlock;
                final int width = blockWidth(qBlock);

                final int heightExcess = iHeight + rowsShift - BLOCK_SIZE;
                final int widthExcess = jWidth + columnsShift - BLOCK_SIZE;
                if (heightExcess > 0) {
                    // the submatrix block spans on two blocks rows from the original matrix
                    if (widthExcess > 0) {
                        // the submatrix block spans on two blocks columns from the original matrix
                        final int width2 = blockWidth(qBlock + 1);
                        copyBlockPart(blocks[index], width,
                                      rowsShift, BLOCK_SIZE,
                                      columnsShift, BLOCK_SIZE,
                                      outBlock, jWidth, 0, 0);
                        copyBlockPart(blocks[index + 1], width2,
                                      rowsShift, BLOCK_SIZE,
                                      0, widthExcess,
                                      outBlock, jWidth, 0, jWidth - widthExcess);
                        copyBlockPart(blocks[index + blockColumns], width,
                                      0, heightExcess,
                                      columnsShift, BLOCK_SIZE,
                                      outBlock, jWidth, iHeight - heightExcess, 0);
                        copyBlockPart(blocks[index + blockColumns + 1], width2,
                                      0, heightExcess,
                                      0, widthExcess,
                                      outBlock, jWidth, iHeight - heightExcess, jWidth - widthExcess);
                    } else {
                        // the submatrix block spans on one block column from the original matrix
                        copyBlockPart(blocks[index], width,
                                      rowsShift, BLOCK_SIZE,
                                      columnsShift, jWidth + columnsShift,
                                      outBlock, jWidth, 0, 0);
                        copyBlockPart(blocks[index + blockColumns], width,
                                      0, heightExcess,
                                      columnsShift, jWidth + columnsShift,
                                      outBlock, jWidth, iHeight - heightExcess, 0);
                    }
                } else {
                    // the submatrix block spans on one block row from the original matrix
                    if (widthExcess > 0) {
                        // the submatrix block spans on two blocks columns from the original matrix
                        final int width2 = blockWidth(qBlock + 1);
                        copyBlockPart(blocks[index], width,
                                      rowsShift, iHeight + rowsShift,
                                      columnsShift, BLOCK_SIZE,
                                      outBlock, jWidth, 0, 0);
                        copyBlockPart(blocks[index + 1], width2,
                                      rowsShift, iHeight + rowsShift,
                                      0, widthExcess,
                                      outBlock, jWidth, 0, jWidth - widthExcess);
                    } else {
                        // the submatrix block spans on one block column from the original matrix
                        copyBlockPart(blocks[index], width,
                                      rowsShift, iHeight + rowsShift,
                                      columnsShift, jWidth + columnsShift,
                                      outBlock, jWidth, 0, 0);
                    }
               }
                ++qBlock;
            }
            ++pBlock;
        }

        return out;
    }

    /**
     * Copy a part of a block into another one
     * <p>This method can be called only when the specified part fits in both
     * blocks, no verification is done here.</p>
     * @param srcBlock source block
     * @param srcWidth source block width ({@link #BLOCK_SIZE} or smaller)
     * @param srcStartRow start row in the source block
     * @param srcEndRow end row (exclusive) in the source block
     * @param srcStartColumn start column in the source block
     * @param srcEndColumn end column (exclusive) in the source block
     * @param dstBlock destination block
     * @param dstWidth destination block width ({@link #BLOCK_SIZE} or smaller)
     * @param dstStartRow start row in the destination block
     * @param dstStartColumn start column in the destination block
     */
    private void copyBlockPart(final double[] srcBlock, final int srcWidth,
                               final int srcStartRow, final int srcEndRow,
                               final int srcStartColumn, final int srcEndColumn,
                               final double[] dstBlock, final int dstWidth,
                               final int dstStartRow, final int dstStartColumn) {
        final int length = srcEndColumn - srcStartColumn;
        int srcPos = srcStartRow * srcWidth + srcStartColumn;
        int dstPos = dstStartRow * dstWidth + dstStartColumn;
        for (int srcRow = srcStartRow; srcRow < srcEndRow; ++srcRow) {
            System.arraycopy(srcBlock, srcPos, dstBlock, dstPos, length);
            srcPos += srcWidth;
            dstPos += dstWidth;
        }
    }

    /** {@inheritDoc} */
    @Override
    public void setSubMatrix(final double[][] subMatrix, final int row,
                             final int column)
        throws OutOfRangeException, NoDataException, NullArgumentException,
        DimensionMismatchException {
        // safety checks
        MathUtils.checkNotNull(subMatrix);
        final int refLength = subMatrix[0].length;
        if (refLength == 0) {
            throw new NoDataException(LocalizedFormats.AT_LEAST_ONE_COLUMN);
        }
        final int endRow = row + subMatrix.length - 1;
        final int endColumn = column + refLength - 1;
        MatrixUtils.checkSubMatrixIndex(this, row, endRow, column, endColumn);
        for (final double[] subRow : subMatrix) {
            if (subRow.length != refLength) {
                throw new DimensionMismatchException(refLength, subRow.length);
            }
        }

        // compute blocks bounds
        final int blockStartRow = row / BLOCK_SIZE;
        final int blockEndRow = (endRow + BLOCK_SIZE) / BLOCK_SIZE;
        final int blockStartColumn = column / BLOCK_SIZE;
        final int blockEndColumn = (endColumn + BLOCK_SIZE) / BLOCK_SIZE;

        // perform copy block-wise, to ensure good cache behavior
        for (int iBlock = blockStartRow; iBlock < blockEndRow; ++iBlock) {
            final int iHeight = blockHeight(iBlock);
            final int firstRow = iBlock * BLOCK_SIZE;
            final int iStart = FastMath.max(row,    firstRow);
            final int iEnd = FastMath.min(endRow + 1, firstRow + iHeight);

            for (int jBlock = blockStartColumn; jBlock < blockEndColumn; ++jBlock) {
                final int jWidth = blockWidth(jBlock);
                final int firstColumn = jBlock * BLOCK_SIZE;
                final int jStart = FastMath.max(column,    firstColumn);
                final int jEnd = FastMath.min(endColumn + 1, firstColumn + jWidth);
                final int jLength = jEnd - jStart;

                // handle one block, row by row
                final double[] block = blocks[iBlock * blockColumns + jBlock];
                for (int i = iStart; i < iEnd; ++i) {
                    System.arraycopy(subMatrix[i - row], jStart - column,
                                     block, (i - firstRow) * jWidth + (jStart - firstColumn),
                                     jLength);
                }

            }
        }
    }

    /** {@inheritDoc} */
    @Override
    public double[] getRow(final int row) throws OutOfRangeException {
        MatrixUtils.checkRowIndex(this, row);
        final double[] out = new double[columns];

        // perform copy block-wise, to ensure good cache behavior
        final int iBlock = row / BLOCK_SIZE;
        final int iRow = row - iBlock * BLOCK_SIZE;
        int outIndex = 0;
        for (int jBlock = 0; jBlock < blockColumns; ++jBlock) {
            final int jWidth     = blockWidth(jBlock);
            final double[] block = blocks[iBlock * blockColumns + jBlock];
            System.arraycopy(block, iRow * jWidth, out, outIndex, jWidth);
            outIndex += jWidth;
        }

        return out;
    }

    /** {@inheritDoc} */
    @Override
    public void setRow(final int row, final double[] array)
        throws OutOfRangeException, MatrixDimensionMismatchException {
        MatrixUtils.checkRowIndex(this, row);
        final int nCols = getColumnDimension();
        if (array.length != nCols) {
            throw new MatrixDimensionMismatchException(1, array.length, 1, nCols);
        }

        // perform copy block-wise, to ensure good cache behavior
        final int iBlock = row / BLOCK_SIZE;
        final int iRow = row - iBlock * BLOCK_SIZE;
        int outIndex = 0;
        for (int jBlock = 0; jBlock < blockColumns; ++jBlock) {
            final int jWidth     = blockWidth(jBlock);
            final double[] block = blocks[iBlock * blockColumns + jBlock];
            System.arraycopy(array, outIndex, block, iRow * jWidth, jWidth);
            outIndex += jWidth;
        }
    }

    /** {@inheritDoc} */
    @Override
    public double[] getColumn(final int column) throws OutOfRangeException {
        MatrixUtils.checkColumnIndex(this, column);
        final double[] out = new double[rows];

        // perform copy block-wise, to ensure good cache behavior
        final int jBlock  = column / BLOCK_SIZE;
        final int jColumn = column - jBlock * BLOCK_SIZE;
        final int jWidth  = blockWidth(jBlock);
        int outIndex = 0;
        for (int iBlock = 0; iBlock < blockRows; ++iBlock) {
            final int iHeight = blockHeight(iBlock);
            final double[] block = blocks[iBlock * blockColumns + jBlock];
            for (int i = 0; i < iHeight; ++i) {
                out[outIndex++] = block[i * jWidth + jColumn];
            }
        }

        return out;
    }

    /** {@inheritDoc} */
    @Override
    public void setColumn(final int column, final double[] array)
        throws OutOfRangeException, MatrixDimensionMismatchException {
        MatrixUtils.checkColumnIndex(this, column);
        final int nRows = getRowDimension();
        if (array.length != nRows) {
            throw new MatrixDimensionMismatchException(array.length, 1, nRows, 1);
        }

        // perform copy block-wise, to ensure good cache behavior
        final int jBlock  = column / BLOCK_SIZE;
        final int jColumn = column - jBlock * BLOCK_SIZE;
        final int jWidth = blockWidth(jBlock);
        int outIndex = 0;
        for (int iBlock = 0; iBlock < blockRows; ++iBlock) {
            final int iHeight = blockHeight(iBlock);
            final double[] block = blocks[iBlock * blockColumns + jBlock];
            for (int i = 0; i < iHeight; ++i) {
                block[i * jWidth + jColumn] = array[outIndex++];
            }
        }
    }

    /** {@inheritDoc} */
    @Override
    public double getEntry(final int row, final int column)
        throws OutOfRangeException {
        MatrixUtils.checkMatrixIndex(this, row, column);
        final int iBlock = row / BLOCK_SIZE;
        final int jBlock = column / BLOCK_SIZE;
        final int k = (row - iBlock * BLOCK_SIZE) * blockWidth(jBlock) +
            (column - jBlock * BLOCK_SIZE);
        return blocks[iBlock * blockColumns + jBlock][k];
    }

    /** {@inheritDoc} */
    @Override
    public void setEntry(final int row, final int column, final double value)
        throws OutOfRangeException {
        MatrixUtils.checkMatrixIndex(this, row, column);
        final int iBlock = row / BLOCK_SIZE;
        final int jBlock = column / BLOCK_SIZE;
        final int k = (row - iBlock * BLOCK_SIZE) * blockWidth(jBlock) +
            (column - jBlock * BLOCK_SIZE);
        blocks[iBlock * blockColumns + jBlock][k] = value;
    }

    /** {@inheritDoc} */
    @Override
    public BlockRealMatrix transpose() {
        final int nRows = getRowDimension();
        final int nCols = getColumnDimension();
        final BlockRealMatrix out = new BlockRealMatrix(nCols, nRows);

        // perform transpose block-wise, to ensure good cache behavior
        int blockIndex = 0;
        for (int iBlock = 0; iBlock < blockColumns; ++iBlock) {
            for (int jBlock = 0; jBlock < blockRows; ++jBlock) {
                // transpose current block
                final double[] outBlock = out.blocks[blockIndex];
                final double[] tBlock = blocks[jBlock * blockColumns + iBlock];
                final int pStart = iBlock * BLOCK_SIZE;
                final int pEnd = FastMath.min(pStart + BLOCK_SIZE, columns);
                final int qStart = jBlock * BLOCK_SIZE;
                final int qEnd = FastMath.min(qStart + BLOCK_SIZE, rows);
                int k = 0;
                for (int p = pStart; p < pEnd; ++p) {
                    final int lInc = pEnd - pStart;
                    int l = p - pStart;
                    for (int q = qStart; q < qEnd; ++q) {
                        outBlock[k] = tBlock[l];
                        ++k;
                        l+= lInc;
                    }
                }
                // go to next block
                ++blockIndex;
            }
        }

        return out;
    }

    /** {@inheritDoc} */
    @Override
    public int getRowDimension() {
        return rows;
    }

    /** {@inheritDoc} */
    @Override
    public int getColumnDimension() {
        return columns;
    }

    /** {@inheritDoc} */
    @Override
    public double[] operate(final double[] v)
        throws DimensionMismatchException {
        if (v.length != columns) {
            throw new DimensionMismatchException(v.length, columns);
        }
        final double[] out = new double[rows];

        // perform multiplication block-wise, to ensure good cache behavior
        for (int iBlock = 0; iBlock < blockRows; ++iBlock) {
            final int pStart = iBlock * BLOCK_SIZE;
            final int pEnd = FastMath.min(pStart + BLOCK_SIZE, rows);
            for (int jBlock = 0; jBlock < blockColumns; ++jBlock) {
                final double[] block  = blocks[iBlock * blockColumns + jBlock];
                final int qStart = jBlock * BLOCK_SIZE;
                final int qEnd = FastMath.min(qStart + BLOCK_SIZE, columns);
                int k = 0;
                for (int p = pStart; p < pEnd; ++p) {
                    double sum = 0;
                    int q = qStart;
                    while (q < qEnd - 3) {
                        sum += block[k]     * v[q]     +
                               block[k + 1] * v[q + 1] +
                               block[k + 2] * v[q + 2] +
                               block[k + 3] * v[q + 3];
                        k += 4;
                        q += 4;
                    }
                    while (q < qEnd) {
                        sum += block[k++] * v[q++];
                    }
                    out[p] += sum;
                }
            }
        }

        return out;
    }

    /**
     * Get the height of a block.
     * @param blockRow row index (in block sense) of the block
     * @return height (number of rows) of the block
     */
    private int blockHeight(final int blockRow) {
        return (blockRow == blockRows - 1) ? rows - blockRow * BLOCK_SIZE : BLOCK_SIZE;
    }

    /**
     * Get the width of a block.
     * @param blockColumn column index (in block sense) of the block
     * @return width (number of columns) of the block
     */
    private int blockWidth(final int blockColumn) {
        return (blockColumn == blockColumns - 1) ? columns - blockColumn * BLOCK_SIZE : BLOCK_SIZE;
    }
}
