package arrayList;

import java.util.ArrayList;

public class ArrayListToArray {

    public static String[] convertToArray(ArrayList<String> stringList) {
        // Create an array of the same size as the ArrayList
        String[] stringArray = new String[stringList.size()];

        // Convert ArrayList to array
        stringList.toArray(stringArray);

        return stringArray;
    }
}

