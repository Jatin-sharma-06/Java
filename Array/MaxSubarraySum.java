package Java.Array;

public class MaxSubarraySum {
//     Brute Force Approach
//
//     T.C. : O(n^3)
//
//     public static void maxSubArrSum(int[] arr){
//        int currSum = 0;
//        int maxSum = Integer.MIN_VALUE;
//        for(int i = 0; i < arr.length; i++){    //O(n)
//            int start = i;
//            for(int j = i; j < arr.length; j++){    //O(n)
//                int end = j;
//                currSum = 0;
//                for(int k = start; k <= end; k++){  //O(n)
//                    currSum += arr[k];
//                }
//                System.out.println(currSum);
//                if(maxSum < currSum){
//                    maxSum = currSum;
//                }
//            }
//        }
//        System.out.println("max sum : " + maxSum);
//    }


//  Prefix Array Sum (Optimal Approach)
//    T.C. = O(n^2)
//    public static void maxSubArrSum(int[] arr){
//        int currSum = 0;
//        int maxSum = Integer.MIN_VALUE;
//        int[] prefix = new int[arr.length];
//
//        prefix[0] = arr[0];
//        //calculate prefix array
//        for(int i=1; i<prefix.length; i++){
//            prefix[i] = prefix[i-1] + arr[i];
//        }
//
//        for(int i = 0; i < arr.length; i++){
//            int start = i;
//            for(int j = i; j < arr.length; j++){
//                int end = j;
//
//                currSum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];
//
//                if(maxSum < currSum){
//                    maxSum = currSum;
//                }
//            }
//        }
//        System.out.println("Max Sum : " + maxSum);
//    }


//    Kadanes Algorithm (Most Optimal Solution)

//    T.C. : O(n)

    public static void maxSubArrSum(int[] arr){
         int maxSum = Integer.MIN_VALUE;
         int currSum = 0;

         for(int i=0; i<arr.length; i++){
             currSum = currSum + arr[i];
             if(currSum < 0){
                 currSum = 0;
             }
             maxSum = Math.max(currSum, maxSum);
         }
        System.out.println("Max Sub Array Sum : "+ maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};

        maxSubArrSum(arr);
    }
}
