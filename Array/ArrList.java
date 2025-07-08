package Java.Array;

import java.util.*;

public class ArrList {
    public static void main(String[] args) {
//        List<Integer> arr = new ArrayList<>();

        List<String> arr1 = new ArrayList<>();
//     >   That line of code creates an empty ArrayList that will hold elements of type String. Here’s a quick breakdown:
//        ArrayList<String> declares a list that will store only String values.
//        fruits is the name of the list (you can choose any valid variable name).
//        new ArrayList<>() initializes the list. Notice how you don’t need to repeat the type inside the angle brackets on the right side, thanks to the diamond operator <>, which allows the compiler to infer the type from the left-hand side.
        arr1.add("1");
        arr1.add("1");
        arr1.add("141");
        arr1.add("1");


        for(int i = 0; i < arr1.size(); i++) {
            System.out.println(arr1.get(i));
        }
    }
}
