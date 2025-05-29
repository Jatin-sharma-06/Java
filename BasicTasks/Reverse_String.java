//Java code for Reverse a String.

import java.util.Scanner;

public class Reverse_String{
    public static void main(String[] args){
        //String str = "Automation";
	Scanner obj = new Scanner(System.in);
 	System.out.print("Enter a String : ");
	String str = obj.nextLine();
	
       	StringBuilder reversed = new StringBuilder(str).reverse();

        System.out.println("starting String: " + str);
        System.out.println("Reversed String: " + reversed);

	obj.close();

    }
}






















      


