package java15;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

public class RepeatCharTest {

    @Test
    public void testGetRepeatedChars() {
        RepeatChar repeatChar = new RepeatChar();

        // Test case 1: Empty string should return an empty list
        assertEquals(new ArrayList<Character>(), repeatChar.getRepeatedChars(""));

        // Test case 2: No repeated characters in the string
        assertEquals(new ArrayList<Character>(), repeatChar.getRepeatedChars("abcdef"));

        // Test case 3: String with repeated characters
        assertEquals(Arrays.asList('a', 'b'), repeatChar.getRepeatedChars("abcaab"));

        // Test case 4: String with all characters repeated
        assertEquals(Arrays.asList('a', 'b', 'c'), repeatChar.getRepeatedChars("abcabc"));

        // Test case 5: String with spaces and repeated characters
        assertEquals(Arrays.asList('a', 'b', ' '), repeatChar.getRepeatedChars("ab ca ab"));
    }
}
