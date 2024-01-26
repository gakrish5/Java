package arrays;

public class ArrayRotator {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int rotateBy = 2;

        System.out.println("Original Array:");
        printArray(array);

        rotateLeft(array, rotateBy);

        System.out.println("\nArray after left rotation by " + rotateBy + " positions:");
        printArray(array);
    }

    private static void rotateLeft(int[] array, int positions) {
        int n = array.length;
        reverseArray(array, 0, positions - 1);
        reverseArray(array, positions, n - 1);
        reverseArray(array, 0, n - 1);
    }

    private static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            // Swap elements at start and end indices
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
