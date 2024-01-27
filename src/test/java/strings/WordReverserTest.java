package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordReverserTest {

    @Test
    public void testReverseWords_emptySentence_shouldReturnEmptyString() {
        String result = WordReverser.reverseWords("");
        assertEquals("", result);
    }

    @Test
    public void testReverseWords_singleWord_shouldReturnReversedWord() {
        String result = WordReverser.reverseWords("hello");
        assertEquals("olleh", result);
    }

    @Test
    public void testReverseWords_multipleWords_shouldReturnReversedSentence() {
        String result = WordReverser.reverseWords("This is a test");
        assertEquals("sihT si a tset", result);
    }

    @Test
    public void testReverseWords_sentenceWithSpaces_shouldReturnReversedSentence() {
        String result = WordReverser.reverseWords("   Java Code   ");
        assertEquals("avaJ edoC", result);
    }
}
