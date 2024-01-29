package maps;

import java.util.HashMap;

public class TwoIndicesSum {

    static int[] findTwoSumIndices(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        // If no solution is found, return an empty array
        return new int[]{};
    }
}

