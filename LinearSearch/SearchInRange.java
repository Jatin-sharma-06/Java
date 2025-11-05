package Java.LinearSearch;
import java.util.Scanner;

public class SearchInRange {
    static int min(int[] arr, int target, int start, int end) {
        for(int i = start; i <= end; i++) {
            if(target == arr[i]) {
                System.out.println("Target Found !!");
                return target;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {42, 3, 42, 65, 23, 57, 24, 6, 23, 5, 23};
        int target = 6;

        System.out.println("Enter Range (Starting and Ending index) ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        int result = min(arr, target, start, end);

        System.out.println(result);
    }
}
