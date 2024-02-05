package additional;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SwapNumTest {

    @Test
    //SwapPositiveNumbers
    public void test1() {
        int num1 = 5;
        int num2 = 10;
        int[] result = SwapNum.Swap(num1, num2);
        assertArrayEquals(new int[]{num2, num1}, result);
    }

    @Test
    //SwapNegativeNumbers
    public void test2() {
        int num1 = -8;
        int num2 = -4;
        int[] result = SwapNum.Swap(num1, num2);
        assertArrayEquals(new int[]{num2, num1}, result);
    }
}
