package hw.decorator;

import org.junit.Assert;
import org.junit.Test;

public class SumOfTwoMatricesTest {

    @Test
    public void getCorrectElementSimpleCase() {
        int[][] firstArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] secondArray = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};

        MatrixImpl firstMatrix = new MatrixImpl(firstArray);
        MatrixImpl secondMatrix = new MatrixImpl(secondArray);

        SumOfTwoMatrices sumOfTwoMatrices = new SumOfTwoMatrices(firstMatrix, secondMatrix);

        Assert.assertEquals(7, sumOfTwoMatrices.getElement(1, 1));
    }

    @Test
    public void checkCommutative() {
        int[][] firstArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] secondArray = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};

        MatrixImpl firstMatrix = new MatrixImpl(firstArray);
        MatrixImpl secondMatrix = new MatrixImpl(secondArray);

        SumOfTwoMatrices sumOfTwoMatricesLeftRight = new SumOfTwoMatrices(firstMatrix, secondMatrix);
        SumOfTwoMatrices sumOfTwoMatricesRightLeft = new SumOfTwoMatrices(secondMatrix, firstMatrix);

        Assert.assertEquals(sumOfTwoMatricesLeftRight.getElement(2, 2), sumOfTwoMatricesRightLeft.getElement(2, 2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getExceptionWhenSizesAreDifferent() throws IndexOutOfBoundsException {
        int[][] firstArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        MatrixImpl firstMatrix = new MatrixImpl(firstArray);

        int[][] arrayOfDifferentSize = {{1, 2}, {3, 4}, {5, 6}};
        MatrixImpl matrixOfDifferentSize = new MatrixImpl(arrayOfDifferentSize);

        SumOfTwoMatrices sumOfTwoMatrices = new SumOfTwoMatrices(firstMatrix, matrixOfDifferentSize);

        int surpriseMe = sumOfTwoMatrices.getElement(0, 2);
    }

}
