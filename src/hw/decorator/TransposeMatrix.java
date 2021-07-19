package hw.decorator;

public class TransposeMatrix extends AbstractMatrixOperation implements Matrix {

    private final Matrix matrix;

    public TransposeMatrix(Matrix matrix) {
        this.matrix = matrix;
    }

    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException {
        return this.matrix.getElement(j, i);
    }

}
