package classes.main.tasks;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 7;
        System.out.println(indexOf(arr, target));
    }

    private static int indexOf(int[] arr, int target) {
        return indexSubArray(arr, 0, arr.length, target);
    }

    private static int indexSubArray(int[] arr, int i, int j, int target) {
        if(i==j){
            return i;
        } else if (i+1 == j){
            return i+1;
        } else if (i == j+1){
            return j+1;
        } else if(arr[j/2] > target) {
            return indexSubArray(arr, i, j/2, target);
        } else {
            return indexSubArray(arr, j, arr.length, target);
        }
    }


}
