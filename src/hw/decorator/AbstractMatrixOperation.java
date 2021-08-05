package hw.decorator;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMatrixOperation implements Matrix {

    @Override
    public String toString() {
        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < this.getM(); i++) {
            this.getElement(i, 0);

            matrix.add(new ArrayList<>());

            for (int j = 0; j < this.getN(); j++) {
                int elem = this.getElement(i, j);
                matrix.get(i).add(elem);
            }
        }

        return matrix.toString();
    }
}
