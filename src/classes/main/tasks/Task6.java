package classes.main.tasks;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = {0,1,3};
        System.out.println(calculate(arr));
    }

    private static int calculate(int[] arr) {
        int sum = arr.length * (1 + arr.length) / 2;
        for(int i: arr){
            sum = sum - i ;
        }
        return sum;
    }
}
