package ArrayList;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RemoveLastObjectTest {

    @Test
    public void test1() {
        ArrayList<Object> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        RemoveLastObject.removeLastElement(list);

        assertEquals(2, list.size());
        assertEquals("One", list.get(0));
        assertEquals("Two", list.get(1));
    }

    @Test
    public void test2() {
        ArrayList<Object> emptyList = new ArrayList<>();

        RemoveLastObject.removeLastElement(emptyList);

        assertEquals(0, emptyList.size());
    }

    @Test
    public void test3() {
        ArrayList<Object> singleElementList = new ArrayList<>();
        singleElementList.add("Only");

        RemoveLastObject.removeLastElement(singleElementList);

        assertEquals(0, singleElementList.size());
    }
}
