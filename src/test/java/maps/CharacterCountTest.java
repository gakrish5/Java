package collections;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharacterCountTest {

    @Test
    void testPrintCharacterCount() {
        // Redirect System.out to capture printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Test input
        String input = "test string";
        // Expected output
        String expectedOutput = "t-3, e-1, s-2, r-1, i-1, n-1, g-1";

        // Call the method
        CharacterCount.printCharacterCount(input);

        // Reset System.out
        System.setOut(System.out);

        // Get the actual output
        String actualOutput = outContent.toString().trim();

        // Assert the equality
        assertEquals(expectedOutput, actualOutput);
    }

    // Additional test cases can be added for edge cases or different inputs
    @Test
    void testEmptyString() {
        // Redirect System.out to capture printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Test input
        String input = "";
        // Expected output
        String expectedOutput = "";

        // Call the method
        CharacterCount.printCharacterCount(input);

        // Reset System.out
        System.setOut(System.out);

        // Get the actual output
        String actualOutput = outContent.toString().trim();

        // Assert the equality
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testMixedCase() {
        // Redirect System.out to capture printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Test input
        String input = "TeSt StRiNg";
        // Expected output
        String expectedOutput = "t-3, e-1, s-2, r-1, i-1, n-1, g-1";

        // Call the method
        CharacterCount.printCharacterCount(input);

        // Reset System.out
        System.setOut(System.out);

        // Get the actual output
        String actualOutput = outContent.toString().trim();

        // Assert the equality
        assertEquals(expectedOutput, actualOutput);
    }
}
