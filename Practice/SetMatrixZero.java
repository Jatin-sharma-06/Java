package Java.Practice;

public class SetMatrixZero {

    public static void markRow(int[][] matrix, int i){
        int n = matrix[0].length;
        for(int j = 0; j < n; j++) {
            if(matrix[i][j] != 0) {
                matrix[i][j] = 99;
            }
        }
    }

    public static void markCol(int[][] matrix, int j){
        int m = matrix.length;

        for(int i = 0; i < m; i++) {
            if(matrix[i][j] != 0) {
                matrix[i][j] = 99;
            }
        }
    }

    public static void BruteForce_setZeros(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    markRow(matrix, i);
                    markCol(matrix, j);
                }
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 99) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1},{1, 0, 1},{ 1, 1, 1}};

        System.out.println("-----------------------\nGiven Array :\n-----------------------");
        for (int[] value : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(value[j]);
            }
            System.out.println();
        }

//      1. Brute Force Solution with --
//          T.C. : O(n*m*(n+m))
//          S.C. : O(1)
        BruteForce_setZeros(matrix);



        System.out.println("\n---------------------\nSet Matrix Zero : \n----------------------");
        for (int[] value : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(value[j]);
            }
            System.out.println();
        }
    }


}
