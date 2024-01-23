package Strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringRotationCheckerTest {

    @Test
    public void testIsRotation_emptyStrings_shouldReturnFalse() {
        boolean result = StringRotationChecker.isRotation("", "");
        assertFalse(result);
    }

    @Test
    public void testIsRotation_differentLengthStrings_shouldReturnFalse() {
        boolean result = StringRotationChecker.isRotation("hello", "world");
        assertFalse(result);
    }

    @Test
    public void testIsRotation_rotationStrings_shouldReturnTrue() {
        boolean result = StringRotationChecker.isRotation("waterbottle", "erbottlewat");
        assertTrue(result);
    }

    @Test
    public void testIsRotation_nonRotationStrings_shouldReturnFalse() {
        boolean result = StringRotationChecker.isRotation("abc", "cab");
        assertFalse(result);
    }

    @Test
    public void testIsRotation_sameString_shouldReturnTrue() {
        boolean result = StringRotationChecker.isRotation("abcd", "abcd");
        assertTrue(result);
    }

}
