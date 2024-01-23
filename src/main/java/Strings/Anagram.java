package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User Input of two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Calling the method
        boolean areAnagrams = checkAnagrams(str1, str2);

        // Displaying the result
        if (areAnagrams) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }

        // Closing scanner
        scanner.close();
    }

    // Method to check if two strings are anagrams
    public static boolean checkAnagrams(String s1, String s2) {
        // Removing spaces and converting to lowercase for case-insensitive checking
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // Checking if the lengths are equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Converting strings to char arrays and sorting them
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Checking if the sorted arrays are equal
        return Arrays.equals(charArray1, charArray2);
    }
}
