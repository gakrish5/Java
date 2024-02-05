package additional;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseArrayListTest {

    @Test //ReverseListWithEmptyList
    public void test1() {
        ReverseArrayList reverseArrayList = new ReverseArrayList();
        ArrayList<String> inputList = new ArrayList<>();
        ArrayList<String> reversedList = reverseArrayList.reverseList(inputList);
        assertEquals(new ArrayList<String>(), reversedList);
    }

    @Test //ReverseListWithStrings
    public void test2() {
        ReverseArrayList reverseArrayList = new ReverseArrayList();
        ArrayList<String> inputList = new ArrayList<>(Arrays.asList("apple", "banana", "orange"));
        ArrayList<String> reversedList = reverseArrayList.reverseList(inputList);
        assertEquals(Arrays.asList("orange", "banana", "apple"), reversedList);
    }

    @Test //ReverseListWithNumbers
    public void test3() {
        ReverseArrayList reverseArrayList = new ReverseArrayList();
        ArrayList<String> inputList = new ArrayList<>(Arrays.asList("1", "2", "3", "4"));
        ArrayList<String> reversedList = reverseArrayList.reverseList(inputList);
        assertEquals(Arrays.asList("4", "3", "2", "1"), reversedList);
    }

    @Test //ReverseListWithMixedTypes
    public void test4() {
        ReverseArrayList reverseArrayList = new ReverseArrayList();
        ArrayList<String> inputList = new ArrayList<>(Arrays.asList("apple", "123", "3.14", "orange"));
        ArrayList<String> reversedList = reverseArrayList.reverseList(inputList);
        assertEquals(Arrays.asList("orange", "3.14", "123", "apple"), reversedList);
    }
}
