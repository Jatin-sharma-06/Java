package Java.Sorting;

    public class SelectionSort {
        public static void selectionSort(int[] arr) {
            int n = arr.length;
    
            for(int i = 0; i < n-1; i++){
                int minPos = i;
    
                for(int j = i+1; j<n; j++) {
                    if(arr[minPos] > arr[j]) {  // assending order sorting
                        minPos = j;
                    }
    //                if(arr[minPos] > arr[j]) { // desanding order sorting
    //                    minPos = j;
    //                }
                }
                //swap
                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
            }
        }
    
        public static void printArr(int[] arr) {
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        
        public static void main(String[] args) {
            int[] arr = {4, 65, 23, 53, 8, 79};
            selectionSort(arr);
            printArr(arr);
        }
    }
