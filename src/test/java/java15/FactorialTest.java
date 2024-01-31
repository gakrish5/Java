package java15;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test //FactorialOfZero
    public void test1() {
        int num = 0;
        int result = Factorial.FactNum(num);
        assertEquals(1, result);
    }

    @Test //FactorialOfPositiveNumber
    public void test2() {
        int num = 5;
        int result = Factorial.FactNum(num);
        assertEquals(120, result);
    }

    @Test //FactorialOfNegativeNumber
    public void test3() {
        int num = -3;
        int result = Factorial.FactNum(num);
        assertEquals(-1, result);
    }

    @Test //FactorialOfOne
    public void test4() {
        int num = 1;
        int result = Factorial.FactNum(num);
        assertEquals(1, result);
    }

    @Test //FactorialOfLargeNumber
    public void test5() {
        int num = 10;
        int result = Factorial.FactNum(num);
        assertEquals(3628800, result);
    }
}
