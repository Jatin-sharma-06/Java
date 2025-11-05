package Java.LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Jatin";
        char target = 'k';

        System.out.println(search(name, target));
    }
    static boolean search(String str, char target) {
        if(str.length() == 0) {
            return false;
        }

        for(int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)) {
                return true;
            }
        }

        // using enhanced for loop and inbuild function (Convert string into array).
//       for(char ch : str.toCharArray()) {
//            if(ch == target) {
//                return true;
//            }
//        }

        return false;
    }
}
