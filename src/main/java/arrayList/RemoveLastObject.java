package arrayList;

import java.util.ArrayList;

public class RemoveLastObject {

    public static void removeLastElement(ArrayList<Object> list) {
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        } else {
            System.out.println("The list is empty. Cannot remove the last element.");
        }
    }
}

