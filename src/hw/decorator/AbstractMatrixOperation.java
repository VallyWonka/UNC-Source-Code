package hw.decorator;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMatrixOperation implements Matrix {

    @Override
    public String toString() {
        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0;; i++) {
            try {
                this.getElement(i, 0);
            } catch (IndexOutOfBoundsException reachedLastRow) {
                break;
            }

            matrix.add(new ArrayList<>());

            for (int j = 0;; j++) {
                try {
                    int elem = this.getElement(i, j);
                    matrix.get(i).add(elem);
                } catch (IndexOutOfBoundsException reachedLastColumn) {
                    break;
                }
            }
        }

        return matrix.toString();
    }
}
