package arrayList;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;

public class ArrayListToArrayTest {

    @Test
    public void test1() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("One");
        stringList.add("Two");
        stringList.add("Three");

        String[] expectedArray = {"One", "Two", "Three"};
        String[] resultArray = ArrayListToArray.convertToArray(stringList);

        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void test2() {
        ArrayList<String> emptyList = new ArrayList<>();

        String[] expectedArray = {};
        String[] resultArray = ArrayListToArray.convertToArray(emptyList);

        assertArrayEquals(expectedArray, resultArray);
    }
}
