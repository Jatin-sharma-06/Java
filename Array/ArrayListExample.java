package Java.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(12);
//        list.add(4);
//        list.add(1562);
//        list.add(128);
//        list.add(412);
//        list.add(512);
//        list.add(5512);
//        list.add(6712);
//        list.add(1672);
//        list.add(1972);
//        list.add(1226);
//        list.add(1312);
//        list.add(1232);
//        list.add(152);
//        list.add(122);
//        list.add(15);
//        list.add(13);
//
//        System.out.println(list);
//
//        System.out.println();
//
//        System.out.println(list.contains(12));
//
//        list.set(2, 53);
//
//        System.out.println(list);
//
//        list.remove(2);
//
//        System.out.println(list);

        for(int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //get item at any index
        for(int i=0; i<5; i++) {
            System.out.print(list.get(i) + " "); // pass index here, list[index] syntex will not work here

        }
    }
}
