import java.util.Scanner;

public class Find_Factorial {
    public static void main(String[] args) {
        

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number who's factorial you want to print : ");
        int num = obj.nextInt();
        obj.close();
        int factorial = 1;

        if (num < 0) {
            System.out.println("Enter a valid number.");
        } else if(num == 0 && num == 1) {
            System.out.println(factorial);
        } else {
            for (int i = 1; i <= num; i++){
                factorial *= i;
            }
            System.out.println("Factorial of the number " + num + " is : " + factorial);
        }
        
    }

}
