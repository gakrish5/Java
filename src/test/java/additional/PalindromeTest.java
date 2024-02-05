package additional;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    @Test
    //ReverseDigitsWithPalindromeNumber
    public void test1() {
        assertTrue(Palindrome.reverseDigits(121));
    }

    @Test
    //ReverseDigitsWithNonPalindromeNumber
    public void test2() {
        assertFalse(Palindrome.reverseDigits(12345));
    }

    @Test
    //ReverseDigitsWithSingleDigitNumber
    public void test3() {
        assertTrue(Palindrome.reverseDigits(7));
    }

    @Test
    //ReverseDigitsWithZero
    public void test4() {
        assertTrue(Palindrome.reverseDigits(0));
    }
}
