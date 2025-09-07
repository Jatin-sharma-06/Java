package Java.Array;

//Pair Sum : Return pair in sorted array with target sum.

public class PairSum {
    public static int[] pairSum(int[] nums, int target){
        int[] ans = new int[2];
        int n = nums.length;

        // Brute force -> nested loop
        // O(n^2)

//        for(int i=0; i<n; i++){
//            for(int j=i+1; j<n; j++){
//                if(nums[i] + nums[j] == target){
//                    ans[0] = i;
//                    ans[1] = j;
//                    return ans;
//                }
//            }
//        }

        // Optimal Solution -> tow pointer approach
        // O(n) = O(n/2) + O(n/2)

        int i = 0, j = n-1;
        while(i < j){
            int pairSum = nums[i] + nums[j];

            if(pairSum > target){
                j--;
            }
            else if(pairSum < target){
                i++;
            }
            else {
                ans[0] = i;
                ans[1] = j;
                return ans;
            }
        }


        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] ans = pairSum(nums, target);
        System.out.println(ans[0]+", "+ans[1]);
    }
}
