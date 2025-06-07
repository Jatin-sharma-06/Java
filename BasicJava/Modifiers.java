package Java;
import java.util.Scanner;

public class Modifiers {
    private void sum(int num1, int num2){
        int sum =  num1 + num2;
        System.out.println(sum);
    }
//    public void call() {
//        sum(2, 4);
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        Modifiers pukar = new Modifiers();
        pukar.sum(a, b);

//        pukar.call();
    }
}
