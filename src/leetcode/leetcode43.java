package leetcode;

import java.util.*;

public class leetcode43 {


    public static void main(String[] args) {
        List<Integer>li=new ArrayList<>();
        
        int[] nums = {7,1,2};
        int target = 2;

        int[] result = findSubarrayIndices(nums, target);

        if (result[0] == -1) {
            System.out.println("No subarray with sum " + target + " found.");
        } else {
            System.out.println("First index: " + result[0] + ", Last index: " + result[1]);
        }
    }

    public static int[] findSubarrayIndices(int[] nums, int target) {
        int start = 0;
        int end = 0;
        int currentSum = 0;
        int[] result = {-1, -1};  // Default if no solution found

        while (end < nums.length) {
            // Add next element to sum
            currentSum += nums[end];

            // If sum exceeds target, remove elements from start until sum is less than or equal to target
            while (currentSum > target && start < end) {
                currentSum -= nums[start];
                start++;
            }

            // If sum equals target, we've found our subarray
            if (currentSum == target) {
                result[0] = start;
                result[1] = end;
                return result;
            }

            end++;
        }

        return result;

    }
}
