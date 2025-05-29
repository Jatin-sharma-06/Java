import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the total numbers you want to print in the Fibonacci Series: ");
        int n = obj.nextInt();
        int num1 = 0, num2 = 1;
        
        System.out.print("Fibonacci series: " + num1 + ", " + num2);
        for (int i = 2; i<n; i++){
            int num3 = num1 + num2;
            System.out.print(", "+num3);
            num1 = num2;
            num2 = num3;
        }
        obj.close();
    }
}
