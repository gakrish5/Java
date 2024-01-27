package arrays;

public class ArraySearcher {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 2, 7, 4, 6, 5, 8, 9};
        int target = 5;

        System.out.println("Original Array:");
        printArray(numbers);

        ArraySorter.bubbleSort(numbers);
        System.out.println("\nSorted Array  :");
        printArray(numbers);

        int index = binarySearch(numbers, target);

        if (index != -1) {
            System.out.println("\nElement " + target + " found at index: " + index);
        } else {
            System.out.println("\nElement " + target + " not found in the array.");
        }
    }

    private static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Element found
            } else if (array[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Element not found
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
