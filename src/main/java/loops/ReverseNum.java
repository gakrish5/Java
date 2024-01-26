package loops;

public class ReverseNum {
    private static int reverseDigits(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int number = 123457;
        int reversedNumber = reverseDigits(number);
        System.out.println("Reversed number: " + reversedNumber);
    }
}
