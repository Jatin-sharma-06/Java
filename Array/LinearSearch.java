package Java.Array;

public class LinearSearch {

//    public static int linearSearch(int[] numbers, int key){
//        for(int i = 0; i < numbers.length; i++) {
//            if(numbers[i] == key) {
//                return i;
//            }
//        }
//        return -1;
//    }

    public static String linearSearch(String[] menu, String order){
        for(int i = 0; i < menu.length; i++) {
            if(menu[i] == order) {
                return "Item Found at line number : "+ i;
            }
        }
        return "Item not found in Menu list !!";
    }

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 40, 4, 634, 88,54, 34, 54};
//        int key = 80;
//
//        int index = linearSearch(numbers, key);
//
//        if(index == -1){
//            System.out.println("Key not found.");
//        } else {
//            System.out.println("Key is at index : " + index);
//        }


        String[] menu = {"dosa", "samosa", "idle", "pizza"};
        String order = "pizza";

        String myOrder = linearSearch(menu, order);

        System.out.println(myOrder);
    }
}
