// package Java.Array;

public class Subarrays {

    public static void subArray(int[] array) {
        System.out.println("Sub Arrays\n");

        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++) {
                System.out.print("(");
                for(int k = i; k <= j; k++){
                    System.out.print(array[k]);
                    if(k < j) {
                        System.out.print(",");
                    }
                }
                System.out.print(") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};
        subArray(array);
    }
}
