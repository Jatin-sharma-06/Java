package Java;

public class InvertedHalfPyramid_Numbers {
    public static void main(String[] args) {
        System.out.println("Inverted Half Pyramid with Numbers: ");

        for(int i = 1; i <= 6; i++) {
            for(int j = 1; j <= 6 - i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1