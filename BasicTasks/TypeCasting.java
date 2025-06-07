package Java.BasicTasks;

public class TypeCasting{
    public static void main(String[] args){
        System.out.println("Winding Casting: int to double");
        int myInt = 9;
        double mydouble = myInt;
        System.out.println(myInt);
        System.out.println(mydouble);
        
        System.out.println();

        System.out.println("Narrowing Casting : int to float");
        int maxScore  = 500;
        int userScore = 423;
        
        float percentage = (float)userScore / maxScore * 100.00f;

        System.out.println(percentage);
    }
}