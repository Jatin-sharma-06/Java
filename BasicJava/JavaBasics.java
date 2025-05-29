package Java;

public class JavaBasics {
    
    void myclass(int num) {
        System.out.println(num);
    }

    public static void main(String[] args) {
        //print Hello World
        System.out.println("Hello World !!");

        System.out.println();

        //Print star pattern
        for(int i = 0; i < 5; i++){
         for(int j = i; j < 5; j++)
         {
             System.out.print("*");
         }
         System.out.println();
        }

        System.out.println();

        //Method calling or Function calling
        int num = 2;
        JavaBasics jb = new JavaBasics();
        jb.myclass(num);
    }

}
 