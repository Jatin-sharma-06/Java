import java.util.Scanner;

//public class CheckPerfectSquare {
//
//    public static void main(String[] args) {
//
//        int i = 1;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number for check is it perfect square ? : ");
//        int num = sc.nextInt();
//
//        for(; num > 0;num -= i, i += 2){}
//
//        System.out.println(num == 0 ? "Perfect" : "Not Perfect");
//    }
//}
//
//
//
//
//
//


public class CheckPerfectSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a perfect square: ");
        int num = sc.nextInt();
        int i = 1;

        while (num > 0) {
            num -= i;
            i += 2;
        }

        System.out.println(num == 0 ? "Perfect Square" : "Not a Perfect Square");
    }
}
