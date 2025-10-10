package Java.Sorting;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i = 1; i<n; i++){
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct position to insert
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }

    public static void printArr(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {32, 34, 1, 35, 56, 1, 55, 3, 5};

        insertionSort(arr);
        printArr(arr);
    }
}
