package interviewQuestions;
/*Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
        [1, 2, 3]: The triplet (1, 2, 3) satisfies the condition 1 < 2 < 3 and their indices 0 < 1 < 2. Output: true.
        [1, 2, 3, 4, 5]: Many increasing triplets exist (e.g., 1, 2, 3). Output: true.
        [5, 1, 5, 5, 2, 5, 4]: Although there are increasing pairs (like 1, 2), there is no subsequence of three numbers that is strictly increasing. Output: false.
        [5, 4, 3, 2, 1]: The array is strictly decreasing, so no increasing triplet exists. Output: false.
        [1, 5, 0, 4, 1, 3]: The subsequence 0 (index 2), 1 (index 4), 3 (index 5) forms an increasing triplet: 0 < 1 < 3 and 2 < 4 < 5. Output: true.
        [-5, -4, -3]: The triplet (-5, -4, -3) satisfies the condition. Output: true.
        [-1, -2, -3]: The array is strictly decreasing. Output: false.
        [1, 1, 2, 3]: The triplet 1 (at index 0), 2 (at index 2), 3 (at index 3) forms an increasing triplet. Output: true.*/
public class IdeasQuestion {
    public static boolean increasingTriplet(int[] nums) {
        // Initialize two variables to track the smallest and second smallest numbers
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                // Update first if the current number is smaller or equal
                first = num;
            } else if (num <= second) {
                // Update second if the current number is smaller or equal
                second = num;
            } else {
                // If we reach here, there exists a number > second, hence triplet found
                return true;
            }
        }

        // No increasing triplet found
        return false;
    }

    // Test cases
    public static void main(String[] args) {
        int[][] testCases = {
                {1, 2, 3},
                {1, 2, 3, 4, 5},
                {5, 1, 5, 5, 2, 5, 4},
                {5, 4, 3, 2, 1},
                {1, 5, 0, 4, 1, 3},
                {-5, -4, -3},
                {-1, -2, -3},
                {1, 1, 2, 3}
        };

        for (int[] testCase : testCases) {
            System.out.println(increasingTriplet(testCase));
        }
    }
}
