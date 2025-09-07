package Java.ObjectOrientedProgramming;

public class FunctionOverloading {
    // Function Overloading: 1. same function name with different parameter type.  ex: int sum(int a, int b) and int sum(float a, float b)
    //                       2. same function name with different numbers of arguments. ex: int sum(int a, int b) and int sum(int a, int b, int c)
    //                 NOTE: Function  overloading does not depend on function type. ex: int sum(int a, int b) and float sum(int a, int b) -> this will generate error.

    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println("1 "+sum(3, 6)+ " \n2 " + sum(3.4f, 6.2f) + "\n3 " +sum(1, 5, 7));
    }


}
