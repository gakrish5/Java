package maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {

    static void printCharacterCount(String input) {
        input = input.replaceAll("\\s", "").toLowerCase();
        LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<>();

        for (char ch : input.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        boolean first = true;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (!first) {
                System.out.print(", ");
            } else {
                first = false;
            }
            System.out.print(entry.getKey() + "-" + entry.getValue());
        }

    }
}
