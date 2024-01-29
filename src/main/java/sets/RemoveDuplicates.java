package sets;

public class RemoveDuplicates {

    static {
        String inputString = "hello world"; // Replace this with your input string
        String resultString = removeDuplicates(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("String after removing duplicates: " + resultString);
    }

    static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}
