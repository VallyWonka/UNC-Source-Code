package classes.myImplementations.string;

public class IntArray {
    private int[] array;

    public IntArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : this.array) {
            stringBuilder.append(i).append(" ");
        }
        return stringBuilder.toString();
    }
}
