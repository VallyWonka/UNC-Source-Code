package hw.decorator;

import org.junit.Assert;
import org.junit.Test;

public class TransposeMatrixTest {

    @Test
    public void getCorrectElementSimpleCase() {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        TransposeMatrix transposeMatrix = new TransposeMatrix(new MatrixImpl(array));

        Assert.assertEquals(3, transposeMatrix.getElement(2, 0));
    }

    @Test
    public void checkInvolution() {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        TransposeMatrix transposeMatrix = new TransposeMatrix(new TransposeMatrix(new MatrixImpl(array)));

        Assert.assertEquals(3, transposeMatrix.getElement(0, 2));
    }

}


