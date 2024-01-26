package strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VowelCountTest {

    @Test
    public void testCountVowels_emptyString_shouldReturnZero() {
        int result = VowelCount.countVowels("");
        assertEquals(0, result);
    }

    @Test
    public void testCountVowels_allVowels_shouldReturnStringLength() {
        int result = VowelCount.countVowels("aeiou");
        assertEquals(5, result);
    }

    @Test
    public void testCountVowels_mixedCase_shouldReturnCorrectCount() {
        int result = VowelCount.countVowels("AbcDEfGHi");
        assertEquals(3, result);
    }

}
