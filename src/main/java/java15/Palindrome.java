package java15;

public class Palindrome {
    // Static method to check if a number is a palindrome
    public static boolean reverseDigits(int num) {
        int originalNum = num;
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return originalNum == reversed;
    }

}
