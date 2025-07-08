package Java.Practice;
//binary Search
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] num = {1, 3, 5, 6,34,566,2,656,42,657,887,43,454,77,232,77,99,33,66,7667,2323,7, 7, 4, 3, 56};
        Arrays.sort(num);
        int key= 4;

        int found = 0;
        int s = 0;
        int e = num.length;

        while (s <= e){
            int mid = (s+e)/2;

            if(num[mid] == key) {
                found = num[mid];
                break;
            }
            if(num[mid] > key) {
                e = mid-1;
            }
            else{
                s = mid+1;
            }
            s++;
            e++;
        }

        if(key == found) {
            System.out.println("Founded !!");
        }else{
            System.out.println("Not Founded !! ");
        }

    }
}