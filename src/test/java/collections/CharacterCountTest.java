package collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CharacterCountTest {

    @Test
    void test1() {
        String input = "test string";
        String expectedOutput = "t-3, e-1, s-2, r-1, i-1, n-1, g-1";

        assertPrintedCharacterCount(input, expectedOutput);
    }

    @Test
    void test2() {
        String input = "";
        String expectedOutput = "";

        assertPrintedCharacterCount(input, expectedOutput);
    }

    @Test
    void test3() {
        String input = "   test  string  ";
        String expectedOutput = "t-3, e-1, s-2, r-1, i-1, n-1, g-1";

        assertPrintedCharacterCount(input, expectedOutput);
    }

    @Test
    void test4() {
        // Add a test case for special characters or numbers
        String input = "abc123!@#";
        String expectedOutput = "a-1, b-1, c-1, 1-1, 2-1, 3-1, !-1, @-1, #-1";

        assertPrintedCharacterCount(input, expectedOutput);
    }

    private void assertPrintedCharacterCount(String input, String expectedOutput) {
        // Redirect standard output to capture printed content
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        // Call the method
        CharacterCount.printCharacterCount(input);

        // Reset standard output
        System.setOut(System.out);

        // Assert the printed content matches the expected output
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}
