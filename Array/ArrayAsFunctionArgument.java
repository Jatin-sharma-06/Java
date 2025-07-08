package Java.Array;

public class ArrayAsFunctionArgument {

    public static void update(int marks[], int nonchange) {
        nonchange = 20;  //update value but not in main function
        System.out.println("Nonchange in update function : " + nonchange);
        for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {90, 96, 95, 94}; //pass by reference
        int nonchange = 10; //Pass by value

        System.out.println("Original marks: ");
        System.out.println("nonchange in main function : " + nonchange);
        for(int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]+ "");
        }

        System.out.println();
        update(marks, nonchange);

        //print our marks
        System.out.println("Updated marks : ");

        System.out.println("nonchange in main function : " + nonchange);
        for(int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]+ "");
        }

        System.out.println();
    }
}
