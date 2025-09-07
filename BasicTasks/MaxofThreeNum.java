public class MaxofThreeNum {
    public static void main(String[] args) {
        int A = 2, B = 5, C = 1;

        if(A >= B && A >= C){
            System.out.println("A is greater " + A);
        } else if(B >= C){
            System.out.println("B is greater " + B);
        } else{
            System.out.println("C is greater " + C);
        }
    }
}
