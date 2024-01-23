package Strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {

    @Test
    public void testCountVowels_emptyString_shouldReturnZero() {
        int result = VowelCount.countVowels("");
        assertEquals(0, result);
    }

    @Test
    public void testCheckAnagrams_differentLengthStrings_shouldReturnFalse() {
        boolean result = Anagram.checkAnagrams("listen", "silentt");
        assertFalse(result);
    }

    @Test
    public void testCheckAnagrams_anagramStrings_shouldReturnTrue() {
        boolean result = Anagram.checkAnagrams("listen", "silent");
        assertTrue(result);
    }

    @Test
    public void testCheckAnagrams_nonAnagramStrings_shouldReturnFalse() {
        boolean result = Anagram.checkAnagrams("hello", "world");
        assertFalse(result);
    }

    @Test
    public void testCheckAnagrams_mixedCaseStrings_shouldReturnTrue() {
        boolean result = Anagram.checkAnagrams("Tea", "Eat");
        assertTrue(result);
    }

    @Test
    public void testCheckAnagrams_stringsWithSpaces_shouldReturnTrue() {
        boolean result = Anagram.checkAnagrams("Astronomer", "Moon starer");
        assertTrue(result);
    }

}

