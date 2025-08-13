package Java;

public class FloydsTriangle {
    public static void floyds_triangle() {
        int n = 5;
        int counter = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(counter + "\t");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Floyd's Triangle : ");
        floyds_triangle();
    }
}
