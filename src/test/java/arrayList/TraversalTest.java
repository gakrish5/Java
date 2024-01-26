package arrayList;

import org.testng.annotations.Test;
import java.util.ArrayList;

public class TraversalTest {

    @Test
    public void test1() {
        ArrayList<String> emptyList = new ArrayList<>();

        ArrayListTraversal.traverseWithForLoop(emptyList);

        ArrayListTraversal.traverseWithEnhancedForLoop(emptyList);
    }

    @Test
    public void test2() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("One");
        stringList.add("Two");
        stringList.add("Three");

        ArrayListTraversal.traverseWithForLoop(stringList);
    }

    @Test
    public void test3() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");

        ArrayListTraversal.traverseWithEnhancedForLoop(stringList);
    }
}
