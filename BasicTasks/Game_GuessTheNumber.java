import java.util.Scanner;
public class Game_GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int userNum;
        int randNum = (int)(Math.random()*100);

        System.out.println(" Guess the Number Game\n(Note: If you want to quit the game enter 0.)\n\n");


        do{
            System.out.println("Guess my number (1 to 100) : ");
            userNum = sc.nextInt();

            if(userNum == randNum) {
                System.out.println("Hurry !! you guess the right number.");
                break;
            }
            else if(userNum > randNum) {
                System.out.println("Oh ho, you guess the large number.");
            } else {
                System.out.println("Oh ho, you guess the small number.");
            }
        } while(userNum >= 0);
    }
}
