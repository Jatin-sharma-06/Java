package Java;

public class HalfPyramid {
    public static void main(String[] args) {
        // Half pyramid of number n.
        System.out.println("\nHalf pyramid of number n :\n");
        int n = 5;
        for(int line = 1; line <= n; line++){
            for(int j = line ; j < n; j++) {
                System.out.print(" ");
            }
            for (int number = 1; number <= line; number++) {    // (n-i+1)
                System.out.print(number + " ");
            }
            System.out.println();
        }

        System.out.println("\n\nHalf pyramid of \"*\" : \n");
        // Half pyramid of " * "

        char ch = '*';

        for(int i = 1; i <= n; i++){
            for(int j = i ; j < n; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print(ch+ " ");
            }
            System.out.println();
        }
    }
}

