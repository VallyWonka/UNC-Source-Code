package hw.decorator;

public class SumOfTwoMatrices extends AbstractMatrixOperation implements Matrix {

    protected Matrix leftMatrix;
    protected Matrix rightMatrix;

    public SumOfTwoMatrices(Matrix leftMatrix, Matrix rightMatrix) {
        this.leftMatrix = leftMatrix;
        this.rightMatrix = rightMatrix;
    }

    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException {
        return this.leftMatrix.getElement(i, j) + this.rightMatrix.getElement(i, j);
    }
}
