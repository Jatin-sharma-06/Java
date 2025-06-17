package Java;

public class InvertedStarPattern {
    public static void main(String[] args) {
        // Inverted Star
        for(int i = 1; i <= 4; i++) {
//          for(int j = i; j <= 4; j++) {
            for(int j = 1; j <= 4-i+1; j++){    // (n-i+1)
                System.out.print("*");
            }
            System.out.println();        }
    }
}
