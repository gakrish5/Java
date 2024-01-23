package Arrays;

public class ArraySorter {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 7, 3, 6};

        System.out.println("Original Array:");
        printArray(numbers);

        bubbleSort(numbers);

        System.out.println("\nArray after sorting:");
        printArray(numbers);
    }

    static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
