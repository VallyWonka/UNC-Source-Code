package hw.decorator;

public class Main {

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {3, 4, 5}, {5, 6, 7}};

        MatrixImpl matrix = new MatrixImpl(array);

        System.out.format("The original matrix:\n%s\n", matrix);

        TransposeMatrix transposedMatrix = new TransposeMatrix(matrix);
        System.out.format("The transposed matrix:\n%s\n", transposedMatrix);

        SumOfTwoMatrices sumOfTwoMatrices = new SumOfTwoMatrices(matrix, transposedMatrix);
        System.out.format("The sum of the original and the transposed matrix:\n%s", sumOfTwoMatrices);

    }
}
