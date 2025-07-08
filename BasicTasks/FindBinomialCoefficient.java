import java.util.Scanner;
public class FindBinomialCoefficient {
    public static int factorial(int num) {
        int factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial = i * factorial;
        }
        return factorial;
    }

    public static int binCoff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_r = factorial(n-r);

        return  fact_n / (fact_r * fact_n_r);
    }

    public static void main(String[] args) {
        // Binomial Coefficient : [n! / (n! * (n-r)!) ] >>>>>>> nCr

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'n' :> ");
        int n = sc.nextInt();
        System.out.println("Enter 'r' :> ");
        int r = sc.nextInt();

        System.out.println(binCoff(n, r));
    }
}
