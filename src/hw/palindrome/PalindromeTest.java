package hw.palindrome;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void getCorrectResult() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();

        boolean actualResult = palindromeNumber.isPalindrome(121);

        Assert.assertTrue(actualResult);
    }

    @Test
    public void getCorrectResultNegativeNumber() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();

        boolean actualResult = palindromeNumber.isPalindrome(-121);

        Assert.assertTrue(actualResult);
    }

    @Test
    public void getCorrectFalseResult() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();

        boolean actualResult = palindromeNumber.isPalindrome(-456);

        Assert.assertFalse(actualResult);
    }

}
