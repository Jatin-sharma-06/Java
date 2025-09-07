package Java.Array;

public class PairsInArray {
    public static void pairsOfArray(int[] nums){
        int l = nums.length;
        for(int i = 0; i < l; i++) {
            for(int j = i+1; j < l; j++) {
                System.out.print("("+nums[i]+","+nums[j]+ ")  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[] numbers = {2, 4, 6, 8, 10};
        pairsOfArray(numbers);
    }
}
