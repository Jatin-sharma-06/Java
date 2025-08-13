import java.util.Scanner;


public class CheckPalindrom {
    public static void CheckStr(String str){

        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("str : "+str+"\nReversed String :"+reversedStr);

        if(str.equals(reversedStr)){
            System.out.println("This is palindrome.");
        }
        else{
            System.out.println("This str is not a palindrome.");
        }
    }
    public static void CheckNum(int num){
        int temp, reverse = 0;
        while(num != 0){
            temp = num%10;
            num = num/10;
            reverse = reverse + 10*temp;
        }

        if(num == reverse){
            System.out.println("It's a palindrome number");
        } else {
            System.out.println("This is not a palindrome.");
        }

    };
    public static void main(String[] args) {
        System.out.println("Check for palindrome !!");

        System.out.println("""
                Press 1 : for check String
                Press 2 : for check Number
                """);
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt(); // this will generate error for next "nextLine() in if condition" because it take integer as input but also leave a nextline charcater "\n" so when "nextLine()" will call it read the blank line "\n wali line" and generate error.
        sc.nextLine();  //this is the solution.

        if(choice == 1) {
            System.out.print("Enter String : ");
            String ipStr = sc.nextLine();
            CheckStr(ipStr);
        } else if(choice == 2) {
            System.out.println("Enter Number : ");
            int ipNum = sc.nextInt();
            CheckNum(ipNum);
        }
        sc.close();
    }
}
