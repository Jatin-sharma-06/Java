package Java;

import java.util.Scanner;

public class table {

    static void numTable(int n) {
        for(int i = 1; i <= 10; i++){
            System.out.println(i*n);
        }
    }

    public static void main(String[] args) {
        System.out.print("Print Table:: \n Enter number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println();

        numTable(number);
    }
}
