package ListLength;

import java.util.ArrayList;

public class Length {
    private ArrayList<String> myList = new ArrayList<>();
    public void addString(String newString){
        if (newString.length() >= 25){
            myList.add(newString.substring(0,20).concat("..."));
        } else {
            myList.add(newString);
        }
    }

    @Override
    public String toString() {
        return myList.toString();
    }
}
