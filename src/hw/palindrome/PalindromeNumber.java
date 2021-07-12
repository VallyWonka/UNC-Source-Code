package hw.palindrome;


public class PalindromeNumber implements Palindrome {

    private int reversedNumber(int x) {
        int reversed = 0;

        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return reversed;
    }

    @Override
    public boolean isPalindrome(int x) {
        x = Math.abs(x);
        return x == reversedNumber(x);
    }
}
