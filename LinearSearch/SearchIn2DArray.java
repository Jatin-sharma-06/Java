package Java.LinearSearch;

public class SearchIn2DArray {
    static int search(int[][] arr, int target) {
        for(int i = 0;i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target) {
                    System.out.println("found !! ");
                    return arr[i][j];
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 2},
                {22, 53, 75, 23},
                {93, 44, 66, 88, 22, 54},
                {18, 12}
        };
        int target = 75;
        System.out.println(search(arr, target));
    }

}
