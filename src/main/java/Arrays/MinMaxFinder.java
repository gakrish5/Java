package Arrays;

public class MinMaxFinder {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 3, 8, 1, 20, 7};
        findMinMax(numbers);
    }

    private static void findMinMax(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Smallest number : " + min);
        System.out.println("Largest number  : " + max);
    }
}