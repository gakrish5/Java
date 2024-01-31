package java15;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatDigitTest {

    @Test
    public void testGetRepeatNumWithNoRepeats() {
        RepeatDigits repeatDigits = new RepeatDigits();
        assertEquals(new ArrayList<Integer>(), repeatDigits.getRepeatNum(12345));
    }

    @Test
    public void testGetRepeatNumWithRepeats() {
        RepeatDigits repeatDigits = new RepeatDigits();
        assertEquals(Arrays.asList(1, 2, 3), repeatDigits.getRepeatNum(112233));
    }

    @Test
    public void testGetRepeatNumWithRepeatedZero() {
        RepeatDigits repeatDigits = new RepeatDigits();
        assertEquals(List.of(0), repeatDigits.getRepeatNum(100200));
    }

    @Test
    public void testGetRepeatNumWithNegativeNumbers() {
        RepeatDigits repeatDigits = new RepeatDigits();
        assertEquals(List.of(9), repeatDigits.getRepeatNum(-99999));
    }

    @Test
    public void testGetRepeatNumWithMixedNumbers() {
        RepeatDigits repeatDigits = new RepeatDigits();
        assertEquals(Arrays.asList(1, 2, 3), repeatDigits.getRepeatNum(123123));
    }
}

