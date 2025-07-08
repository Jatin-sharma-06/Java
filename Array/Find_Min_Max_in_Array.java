package Java.Array;
//import java.util.*;
public class Find_Min_Max_in_Array {
    public static int findMax(int[] numbers){
        int largest = Integer.MIN_VALUE;

        for(int num : numbers) {
            if (num > largest) {
                largest = num;
            }
        }

//        for(int i = 0; i < numbers.length; i++) {
//            if(largest < numbers[i]){
//                largest = numbers[i];
//            }
//        }

        return largest;
    }

    public static int findMin(int[] numbers){
        int smallest = Integer.MAX_VALUE;
        for(int num : numbers) {
            if(num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 4, 5, 33, 53, 66, 0, 88, 62, 1};

//        int isFind = findMax(numbers);
//        System.out.println("Largest number is : " + isFind);
        System.out.println("Largest number is : " + findMax(numbers));
        System.out.println("Smallest number is : " + findMin(numbers));

    }
}
