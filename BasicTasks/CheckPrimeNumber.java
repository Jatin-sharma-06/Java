import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number for check (is prime number or not) : ");
        int num = obj.nextInt();

        boolean isPrime = true;

        for( int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                isPrime = false;
                break;
            }
        }

        if (isPrime == true){
            System.out.println("number "+ num +" is Prime Number.");
        }
        else{
            System.out.println("number "+ num +" is not a Prime Number.");
        }

        obj.close();
    }    
}
