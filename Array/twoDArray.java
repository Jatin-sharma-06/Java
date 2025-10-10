package Java.Array;
import java.util.Scanner;
import java.util.Arrays;

public class twoDArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[][] arr = new int[3][3]; //it is imp to mention the no. of row in 2d array.

        // Jagged Array: a 2D array with variable column size.
        int[][] twoDArr = new int[3][];

        twoDArr[0] = new int[3];
        twoDArr[1] = new int[2];
        twoDArr[2] = new int[4];


//        for(int i = 0; i < twoDArr.length; i++) {
//            for(int j = 0; j < twoDArr[i].length; j++) {
//                System.out.print(twoDArr[i][j]);
//            }
//            System.out.println();
//        }

//
//
//        System.out.println(arr.length);
//
        // input
        for(int row = 0; row < twoDArr.length; row++){
            // for each col in every row
            for(int col = 0; col < twoDArr[row].length; col++) {
                twoDArr[row][col] = in.nextInt();
            }
        }

        // output
        for(int row = 0; row < twoDArr.length; row++){
            for(int col = 0; col < twoDArr[row].length; col++) {
                System.out.print(twoDArr[row][col] + " ");
            }
            System.out.println();
        }

//        for(int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }


        //when you not know the column size in 2d array.

//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5},
//                {6, 7, 8}
//        };
//
//        for(int row = 0; row < arr.length; row++) {
//            for(int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
    }
}
