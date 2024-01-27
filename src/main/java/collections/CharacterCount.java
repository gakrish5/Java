package collections;

public class CharacterCount {

    static {
        String input = "test string";
        printCharacterCount(input);
    }

    static void printCharacterCount(String input) {
//        char [] chars = input.toCharArray();
//        HashMap<Character, Integer> map = new HashMap<>();

        // Remove spaces and convert to lowercase for case-insensitive counting
        input = input.replaceAll("\\s", "").toLowerCase();

        // Use a LinkedHashMap to maintain the order of insertion
        java.util.LinkedHashMap<Character, Integer> charCountMap = new java.util.LinkedHashMap<>();

        // Count the occurrences of each character
        for (char ch : input.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Print the results
        for (java.util.Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.print(entry.getKey() + "-" + entry.getValue() + ", ");
        }
    }
}
