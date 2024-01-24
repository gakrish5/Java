package ArrayList;

import java.util.ArrayList;

public class RemoveLastObject {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        // Displaying the ArrayList before removal
        System.out.println("ArrayList before removal: " + stringList);

        // Removing the last object from the ArrayList
        if (!stringList.isEmpty()) {
            stringList.remove(stringList.size() - 1);
            System.out.println("Removed the last object.");
        } else {
            System.out.println("ArrayList is empty. No object to remove.");
        }

        // Displaying the ArrayList after removal
        System.out.println("ArrayList after removal: " + stringList);
    }
}
