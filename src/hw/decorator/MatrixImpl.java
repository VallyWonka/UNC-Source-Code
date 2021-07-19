package hw.decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixImpl implements Matrix{

    private final int[][] matrix;

    public MatrixImpl(int[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public int getElement(int i, int j) {
        return matrix[i][j];
    }

    @Override
    public String toString() {
        List<String> matrixRows = new ArrayList<>();

        for (int[] row : this.matrix) {
            matrixRows.add(Arrays.toString(row));
        }

        return matrixRows.toString();
    }
}
