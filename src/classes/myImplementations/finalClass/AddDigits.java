package classes.myImplementations.finalClass;

public class AddDigits {
    public int addDigits(int num) {
        int result = num;
        while (result > 10) {
            result = 0;
            while (num > 10) {
                result += num % 10;
                num /= 10;
            }
        }
        return result;
    }
}
