package classes.myImplementations.string;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 4, 6,};
        IntArray intArray = new IntArray(myArray);
        System.out.println(intArray);

        SaveFunctionResults saveFunctionResults = new SaveFunctionResults();
        for (int i = 1; i < 6; i++) {
            saveFunctionResults.addPoint(i);
        }
        System.out.println(saveFunctionResults);
    }
}
