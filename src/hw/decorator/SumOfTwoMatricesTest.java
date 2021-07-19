package hw.decorator;

import org.junit.Assert;
import org.junit.Test;

public class SumOfTwoMatricesTest {

    int[][] firstArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] secondArray = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
    int[][] arrayOfDifferentSize = {{1, 2}, {3, 4}, {5, 6}};

    MatrixImpl firstMatrix = new MatrixImpl(firstArray);
    MatrixImpl secondMatrix = new MatrixImpl(secondArray);
    MatrixImpl matrixOfDifferentSize = new MatrixImpl(arrayOfDifferentSize);

    @Test
    public void getCorrectElementSimpleCase() {
        SumOfTwoMatrices sumOfTwoMatrices = new SumOfTwoMatrices(firstMatrix, secondMatrix);

        Assert.assertEquals(7, sumOfTwoMatrices.getElement(1, 1));
    }

    @Test
    public void checkCommutative() {
        SumOfTwoMatrices sumOfTwoMatricesLeftRight = new SumOfTwoMatrices(firstMatrix, secondMatrix);
        SumOfTwoMatrices sumOfTwoMatricesRightLeft = new SumOfTwoMatrices(secondMatrix, firstMatrix);

        Assert.assertEquals(sumOfTwoMatricesLeftRight.getElement(2, 2), sumOfTwoMatricesRightLeft.getElement(2, 2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getExceptionWhenSizesAreDifferent() throws IndexOutOfBoundsException {
        SumOfTwoMatrices sumOfTwoMatrices = new SumOfTwoMatrices(firstMatrix, matrixOfDifferentSize);

        int surpriseMe = sumOfTwoMatrices.getElement(0, 2);
    }

}
