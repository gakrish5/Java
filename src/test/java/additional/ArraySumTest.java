package additional;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArraySumTest {

    @Test //CalculateSumWithEmptyArray
    public void test1() {
        int[] array = {};
        assertEquals(0, ArraySum.calculateSum(array));
    }

    @Test //CalculateSumWithPositiveNumbers
    public void test2() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(15, ArraySum.calculateSum(array));
    }

    @Test //CalculateSumWithNegativeNumbers
    public void test3() {
        int[] array = {-1, -2, -3, -4, -5};
        assertEquals(-15, ArraySum.calculateSum(array));
    }

    @Test //CalculateSumWithMixedNumbers
    public void test4() {
        int[] array = {-1, 2, -3, 4, -5};
        assertEquals(-3, ArraySum.calculateSum(array));
    }

    @Test //CalculateSumWithZero
    public void test5() {
        int[] array = {0, 0, 0, 0, 0};
        assertEquals(0, ArraySum.calculateSum(array));
    }
}
