package arrayList;

import java.util.ArrayList;

public class ArrayListTraversal {

    public static void traverseWithForLoop(ArrayList<String> stringList) {
        System.out.println("Traverse with For Loop: ");
        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            // Do something with the element
            System.out.println(element);

        }
    }

    public static void traverseWithEnhancedForLoop(ArrayList<String> stringList) {
        System.out.println("\nTraverse with Enhanced For Loop: ");
        for (String element : stringList) {
            // Do something with the element
            System.out.println(element);
        }
    }
}

