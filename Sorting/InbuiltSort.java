package Java.Sorting;


import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.*;

public class InbuiltSort {
    public static void main(String[] args) {
        Integer[] arr = {32, 34, 54, 65, 23, 434, 45};

//        Arrays.sort(arr); // this perform in-place sorting and return void

        Arrays.sort(arr, 2, 7, Collections.reverseOrder());  //arrays.sort(input array, form x, to x-1, used collections for print in reverse order);

        String ans = Arrays.toString(arr);

        System.out.println(ans);
    }
}
