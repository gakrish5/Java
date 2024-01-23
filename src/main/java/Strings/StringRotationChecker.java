package Strings;

import java.util.Scanner;

public class StringRotationChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User Input of two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Checking if one of the string is a rotation of the another
        boolean isRotation = isRotation(str1, str2);

        // Displaying the result
        if (isRotation) {
            System.out.println("One string is a rotation of another.");
        } else {
            System.out.println("One string is not a rotation of another.");
        }

        // Closing the scanner
        scanner.close();
    }

    // Method to check if one string is a rotation of another
    public static boolean isRotation(String s1, String s2) {
        // Checking if the lengths are equal and not zero
        if (s1.length() == s2.length() && s1.length() > 0) {
            // Concatenate the first string with itself
            String concatenated = s1 + s1;
            // Check if the second string is a substring of the concatenated string
            return concatenated.contains(s2);
        }

        return false;
    }
}
