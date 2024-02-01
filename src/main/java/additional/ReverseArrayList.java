package additional;

import java.util.ArrayList;

public class ReverseArrayList {

    // Instance method to reverse an ArrayList
    public ArrayList<String> reverseList(ArrayList<String> inputList) {
        ArrayList<String> stringList = new ArrayList<>();
        for (int i = inputList.size()-1; i>=0; i--) {
            stringList.add(inputList.get(i));
        }
        return stringList;
    }
}

