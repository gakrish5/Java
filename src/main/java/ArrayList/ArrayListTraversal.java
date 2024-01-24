package ArrayList;

import java.util.ArrayList;

public class ArrayListTraversal {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        // Using a regular for loop for traversal
        System.out.println("Traversing using a regular for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        // Using an enhanced for loop for traversal
        System.out.println("\nTraversing using an enhanced for loop:");
        for (String fruit : stringList) {
            System.out.println(fruit);
        }
    }
}
