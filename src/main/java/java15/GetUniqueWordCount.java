package java15;

import java.util.HashMap;
import java.util.Map;

public class GetUniqueWordCount {

    public static int GetUniqueCount(String inputString) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        if(inputString=="")
            return 0;
        String[] words = inputString.toLowerCase().split("\\s+");

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        int uniqueWordCount = wordCountMap.size();
        //System.out.println("Number of unique words: " + uniqueWordCount);
        return uniqueWordCount;
    }
}
