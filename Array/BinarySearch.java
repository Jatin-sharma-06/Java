package Java.Array;

public class BinarySearch {

    public static int binary_Search(int numbers[], int key) {
        int start = 0, end = numbers.length-1;

        while(start <= end) {
            int mid = (start+end) / 2;

            //Comparisions
            if(numbers[mid] == key) {
                return mid;     //Found
            }
            if(numbers[mid] < key) { // right side
                start = mid + 1;
            } else {    //left
                end = mid-1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int numbers[] = {2, 3, 5, 8, 10, 12, 14};
        int key = 10;

        int result = binary_Search(numbers, key);

        if(result != -1) {
            System.out.println("Element found at index : " + result);
        }
        else {
            System.out.println("Element not found.");
        }
    }
}
