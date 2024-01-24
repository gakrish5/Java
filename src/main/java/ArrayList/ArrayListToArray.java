package ArrayList;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        // Converting ArrayList to Array
        String[] stringArray = new String[stringList.size()];
        stringArray = stringList.toArray(stringArray);

        // Displaying the original ArrayList
        System.out.println("Original ArrayList: " + stringList);

        // Displaying the converted Array
        System.out.println("Converted Array: ");
        for (String element : stringArray) {
            System.out.println(element);
        }
    }
}
