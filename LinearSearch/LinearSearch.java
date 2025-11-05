package Java.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {23, 32, 53, 6, 34, 7,34, 7, 35, 6553, 0};
        int target = 34;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }

    // Search in the array: return the index if item found
    // Otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }

        for(int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }

        //if target not found in arr return -1.
        return -1;
    }
}

