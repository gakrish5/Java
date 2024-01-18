package Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] numbers = {0, 5, 0, 3, 0, 8, 12, 0, 7};

        System.out.println("Original Array:");
        printArray(numbers);

        moveZerosToEnd(numbers);

        System.out.println("\nArray after moving 0's to the end:");
        printArray(numbers);
    }

    private static void moveZerosToEnd(int[] nums) {
        int nonZeroIndex = 0;

        // Traverse the array, move non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        // Fill the remaining positions with 0
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

