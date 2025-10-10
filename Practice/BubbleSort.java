package Java.Practice;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n =  arr.length;
        int count = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n-1-i; j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
            if(count == 0) {
                break;
            }
        }
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + count);
    }

    public static void main(String[] args) {
//        int[] arr = {5, 4, 1, 3, 2};
//        int[] arr = {32, 23, 45, 43, 7, 45, 343, 64, 34};
        int[] arr = {1, 3, 5, 6, 7};
        bubbleSort(arr);
    }
}

