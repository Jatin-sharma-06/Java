package Java.Array;

public class ReverseArray {

    public static void reverseWithThreeVar(int numbers[]){
        // T.C = O(n);
        // S.C = O(1);

        //Swap using three variables > first, last, temp;
        int first = 0, last = numbers.length-1, temp;
        while(first < last) {
            temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void reverstWithTwoVar(int numbers[]){
        //Swap using two variables > first, last >> using mathematics
        int first = 0, last =  numbers.length-1;
        numbers[first] = numbers[last] + (numbers[last] = numbers[first]) - numbers[first];

    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
//        reverseWithThreeVar(numbers);
        reverstWithTwoVar(numbers);
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}
