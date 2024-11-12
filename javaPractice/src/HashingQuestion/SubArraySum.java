package HashingQuestion;


import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
    public static void main(String[] args) {

        int[] arr = {10, 2, -2, -20, 10};
        int n = arr.length;
        subArrays(arr,n);
        maxSubArraySum(arr,n);
        subArraysSumequalsToK(arr,n);
    }

    private static void subArraysSumequalsToK(int[] arr, int n) {
        //sumarray sum equal to k
        int k = -10;
        int sum = 0;
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();///sum ,freq
        map.put(0, 1);// sum=0 and freq=1

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (map.containsKey(sum - k)) {
                ans = ans + map.get(sum - k);
            }
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        System.out.println("subarray sum equal to k exists "+ans+" times");
    }

    private static void maxSubArraySum(int[] arr, int n) {
        ////maximum subarray sum by kadane's algorithm
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int val : arr) {
            currSum = currSum + val;
            maxSum = Math.max(currSum, maxSum);
            if (currSum < 0)
                currSum = 0;
        }
        System.out.println("maximum subarray sum "+maxSum);
    }

    private static void subArrays(int[] arr, int n) {
        //all possible subarrays
        for (int start = 0; start < n; start++) {
            for (int end = 0; end < n; end++) {
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
