package Java;

public class Star_pattern {
    public static void main(String[] args) {
        // 1. Simple Triangle
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. Simple Triangle

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // 3. Simple Triangle
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
