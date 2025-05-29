// package Java;


public class Find_Max_in_Array {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 66, 45, 345, 8};

        int maxElementInArray = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            maxElementInArray = Math.max(arr[i], maxElementInArray);
        }

        System.out.print(maxElementInArray);
    }
}