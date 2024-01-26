package strings;

import java.util.Scanner;

public class WordReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User Input of a sentence
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        // Reversing each word in the sentence
        String reversedSentence = reverseWords(inputSentence);

        // Displaying the result
        System.out.println("Reversed sentence: " + reversedSentence);

        // Closing the scanner
        scanner.close();
    }

    // method to reverse each word in a sentence
    public static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedSentence.append(reversedWord).append(" ");
        }

        return reversedSentence.toString().trim();
    }
}
