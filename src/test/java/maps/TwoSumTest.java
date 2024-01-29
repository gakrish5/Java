package maps;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void testTwoSumIndices() {
        int[] inputArray = {10, 20, 30, 40, 50, 60};
        int targetSum = 100;

        int[] result = TwoIndicesSum.findTwoSumIndices(inputArray, targetSum);

        int[] expected = {3, 5};
        assertArrayEquals(expected, result, "Test Case 1 Failed");
    }

    @Test
    public void testNoTwoSumIndices() {
        int[] inputArray = {10, 20, 30, 40, 50, 60};
        int targetSum = 200;

        int[] result = TwoIndicesSum.findTwoSumIndices(inputArray, targetSum);

        int[] expected = {};
        assertArrayEquals(expected, result, "Test Case 2 Failed");
    }

    @Test
    public void testNegativeNumbers() {
        int[] inputArray = {-10, -5, 0, 5, 10};
        int targetSum = 0;

        int[] result = TwoIndicesSum.findTwoSumIndices(inputArray, targetSum);

        int[] expected = {1, 3};
        assertArrayEquals(expected, result, "Test Case 3 Failed");
    }

    @Test
    public void testDuplicateElements() {
        int[] inputArray = {5, 10, 5, 20, 30};
        int targetSum = 15;

        int[] result = TwoIndicesSum.findTwoSumIndices(inputArray, targetSum);

        int[] expected = {0, 1};
        assertArrayEquals(expected, result, "Test Case 4 Failed");
    }
}
