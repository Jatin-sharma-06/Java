package Java.Array;
import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {
        int[] marks = new int[100];

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER YOUR MARKS IN 4 SUBJECTS : " );

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();

        System.out.println("marks : " + marks[0]);
        System.out.println("marks : " + marks[1]);
        System.out.println("marks : " + marks[2]);
        System.out.println("marks : " + marks[3]);

        // FIND ARRAY LENGTH:

        System.out.println("Length of the array is : " + marks.length);

    }
}
