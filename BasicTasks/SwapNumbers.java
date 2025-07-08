public class SwapNumbers {
//    public static void usingThreeNum(int num1, int num2) {
//        int tempNum = num1;
//        num1 = num2;
//        num2 = tempNum;
//        System.out.println("Reverse Numbers : ");
//        System.out.println("num1: " + num1 + "\nnum2: " + num2);
//    }

    public static void usingTwoNum(int num1, int num2) {
//        num1 = (num1 + num2) - num2;
//        num2 = (num1 + num2) - num1;
        num1 = num2 + (num2 = num1) - num1;
        System.out.println("Reverse Numbers : ");
        System.out.println("num1: " + num1 + "\nnum2: " + num2);
    }

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 80;

        System.out.println("Original Numbers:\n" + "num1: " + num1 + "\nnum2: " + num2);
        // usingThreeNum(num1, num2);
        usingTwoNum(num1, num2);

        System.out.println();
    }
}
