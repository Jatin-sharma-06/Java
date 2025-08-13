package Java;

public class ZeorOneTriangle {

    public static void ZeroOneTriangle(){
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                if((i+j)%2 == 0) {  //sum -> even
                    System.out.print("1  ");
                }
                else{
                    System.out.print("0  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("0-1 Triangle : \n");
        ZeroOneTriangle();
    }
}


// 1
// 01
// 101
// 0101
// 10101