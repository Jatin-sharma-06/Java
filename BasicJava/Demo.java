package Java;

import java.util.Scanner;

public class Demo {

    static void canIVote(int age) {

        if (age < 18) {

            System.out.println("you can't Vote !!");

        } else {

            System.out.println("you can Vote !!");

        }

    }

    public static void main(String[] args) {

        System.out.println("Sir, Can I vote ??");

        System.out.println("First tell me, How old are you ?");

        Scanner sc = new Scanner(System.in);

        System.out.print( " {Enter your Age in years} ");

        int age = sc.nextInt();

        canIVote(age);

    }

}
