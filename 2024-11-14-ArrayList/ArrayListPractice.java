import java.util.ArrayList;

public class ArrayListPractice {
    public static ArrayList<String> createRandomArray(int size) {
        ArrayList<String> arr = new ArrayList<String>(size);
        for (int i = 0; i<size; i++) {
            int value = Math.random()*10;
            if (value == 0)
                arr.add("");
            else
                arr.add(value+"");
        }
        return arr;
    }
    public static void replaceEmpty( ArrayList<String> original){
        //Modify the ArrayList such that it has all of the empty strings are
        //replaced with the word "Empty".
        for (int i = 0; i<original.size(); i++) {
            if (original.get(i).equals(""))
                original.set(i, "Empty");
        }
    }
}