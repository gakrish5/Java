package sets;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        assertEquals("helo wrd", RemoveDuplicates.removeDuplicates("hello world"));
    }

    @Test
    public void testRemoveDuplicatesWithEmptyString() {
        assertEquals("", RemoveDuplicates.removeDuplicates(""));
    }

    @Test
    public void testRemoveDuplicatesWithNoDuplicates() {
        assertEquals("abcdefg", RemoveDuplicates.removeDuplicates("abcdefg"));
    }

    @Test
    public void testRemoveDuplicatesWithAllDuplicates() {
        assertEquals("a", RemoveDuplicates.removeDuplicates("aaaaa"));
    }

    @Test
    public void testRemoveDuplicatesWithMixedCase() {
        assertEquals("Helo Wrd", RemoveDuplicates.removeDuplicates("Hello World"));
    }
}
