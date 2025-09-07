package Java.Sorting;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
//      T.C. = O{n * n-i-turn) = O(n)
        for(int turn = 0; turn<arr.length-1; turn++){
            int isSwap = 0;
            int pass = 0;
            for(int j = 0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]) {
                    arr[j] = arr[j+1] + (arr[j+1] = arr[j]) - arr[j];
                    isSwap++;
                }
            }
            pass++;
            System.out.println("Number of passes : " + isSwap);

            if(isSwap == 0) {
                System.out.println(pass);
                System.out.println("Array is Already Sorted.");
                break;
            }
        }
    }

    public static void printArr(int[] arr) {
        for(int element : arr){
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        int[] arr = {5, 4, 1, 3, 2};
          int[] arr = {32, 23, 45, 43, 7, 45, 343, 64, 34};
//        int[] arr = {1, 3, 5, 6, 7};
        bubbleSort(arr);

        printArr(arr);
    }
}
