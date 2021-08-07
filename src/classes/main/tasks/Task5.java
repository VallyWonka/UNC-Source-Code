package classes.main.tasks;

public class Task5 {
    public static void main(String[] args) {
        int i = 387;
        System.out.println(calculate(i));
    }

    private static int calculate(int i) {
        if(i <= 9){
            return i;
        }
        int sum = 0, cur = i;
        while (cur > 9){
            sum = sum + cur % 10;
            cur = cur / 10;
        }
        sum = sum + cur;
        return calculate(sum);
    }
}
