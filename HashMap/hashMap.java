package Java.HashMap;
import java.util.*;
public class hashMap {
    public static void main(String[] args) {
//        List<Integer> arr = new ArrayList<>();

//        Map<String, Integer> marks = new HashMap<>();
//
//        marks.put("Jatin", 100);
//        marks.put("Krish", 200);
//
//        for(Map.Entry<String, Integer> entry : marks.entrySet()){
//            System.out.print(entry.getKey() + "---------");
//            System.out.println(entry.getValue());
//            System.out.println("--------------");
//        }

//        System.out.println(marks.get("rohit")>100);
        // Optional : helps to handle null pointer exception.`


        int[] nums = {1,2,2,3,3,3,3,4};
        int k = 2;

        int result = freqCount(nums, k);
        System.out.println(result);
    }

    static int freqCount(int[] nums,int k){


        HashMap<Integer, Integer> hmap = new HashMap<>();
        int sum = 0;
        for(int num : nums) {
            hmap.put(num, hmap.getOrDefault(num, 0)+1);
        }

        for(int i = 0; i < nums.length; i++) {
            int fSum = 0;
            if(hmap.get(nums[i]) % 2 == 0) {
                fSum = hmap.get(nums[i])*nums[i];
            }

            if(fSum != 0) {
                sum += fSum;
            }
        }

        return sum;
    }
}
