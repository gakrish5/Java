package Strings;

import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // calling the method
        int vowelCount = countVowels(inputString);

        // Displaying the result
        System.out.println("Number of vowels in the string: " + vowelCount);

        // Close the scanner
        scanner.close();
    }

    // method to count vowels in a string
    public static int countVowels(String str) {
        int count = 0;
        // Converting the string to lowercase for case-insensitive counting
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Checking if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}
