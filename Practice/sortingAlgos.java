package Java.Practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class sortingAlgos {

//    public static void bubbleSort(int[] arr) {
//        int n = arr.length;
//        int count = 0;
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < n-1-i; j++) {
//                if(arr[j] > arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    count++;
//                }
//            }
//            if(count == 0) { //array if already sorted
//                break;
//            }
//        }
//    }

//    public static void selectionSort(int[] arr) {
//        int n = arr.length;
//        for(int i = 0; i<n; i++) {
//            int minVal = i;
//            for(int j = i+1; j<n; j++) {
//                if(arr[minVal] > arr[j])
//                    minVal = j;
//            }
//            int temp = arr[minVal];
//            arr[minVal] = arr[i];
//            arr[i] = temp;
//        }
//    }

//    public static void insertionSort(int[] arr) {
//        //{7, 3, 5, 2, 12, 8} -> {2, 3, 5, 7, 8, 12}
//        for(int i = 1; i < arr.length; i++) {
//            int curr = arr[i];
//            int prev = i-1;
//
//            while(prev >= 0 && arr[prev] > curr) {
//                arr[prev+1] = arr[prev];
//                prev--;
//            }
//            arr[prev+1] = curr;
//        }
//
//    }

    public static void countingSort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        //sorting
        int j = 0;
        for(int i = 0; i < count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

//    public static void printArr(Integer[] arr) {
    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 0, 0, 0, 4, 3, 5, 2, 5, 8};
//        Integer[] arr = {2, 3, 2, 43, 5, 2, 53, 8};
//        int target = 5;
//        bubbleSort(arr);
//        selectionSort(arr);
//        insertionSort(arr);
//        inbuild Sorting function's:
//        Arrays.sort(arr);
//        Arrays.sort(arr, Collections.reverseOrder());
//        Arrays.sort(arr, 2, 5, Collections.reverseOrder());
        countingSort(arr);
        printArr(arr);
        //  prefixSum(arr, target);
    }
}