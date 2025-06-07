import java.util.Scanner;
import java.math.BigInteger;

public class Find_Factorial {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number who's factorial you want to print : ");
        int num = obj.nextInt();
        obj.close();
        BigInteger factorial = BigInteger.ONE; // Int can store foctorial of small numbers(range < 2 billion) so we use BigInteger here.
                                               // BigInteger do not take direct numeric input, so pass the value like that.

        if (num < 0) {
            System.out.println("Enter a valid number.");
        } else if(num == 0 && num == 1) {
            System.out.println(factorial);
        } else {
            for (int i = 1; i <= num; i++){
                factorial = factorial.multiply(BigInteger.valueOf(i));            }
            System.out.println("Factorial of the number " + num + " is : " + factorial);
        }
        
    }

}
