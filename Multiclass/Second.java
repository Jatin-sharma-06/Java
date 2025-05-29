package Java.MultiClass;

public class Second {
    int x = 343;
    public static void main(String[] args) {
        Second sec = new Second();
        System.out.println(sec.x);

        First first = new First();
        System.out.println( first.x + first.y + sec.x);
    }
}
