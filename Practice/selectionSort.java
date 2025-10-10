package Java.Practice;

public class selectionSort {
    public static void selectionSorting(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            int minPossible = i;
            for(int j = i+1; j < n; j++) {
                if(arr[minPossible] > arr[j]){
                    minPossible = j;
                }
            }
            int temp = arr[minPossible];
            arr[minPossible] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {42, 534, 53, 64, 7, 32, 75, 2, 0, 1};

        selectionSorting(arr);
        for(int n : arr){
            System.out.print(n+" ");
        }
    }
}
