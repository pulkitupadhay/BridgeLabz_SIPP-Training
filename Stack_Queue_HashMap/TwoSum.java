package DSA.Stack_Queue_HashMap;

import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{ map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[]{ -1, -1 };
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);

        if (result[0] != -1) {
            System.out.println("Indices of the two numbers that add up to " + target + ": " + Arrays.toString(result));
        } else {
            System.out.println("No two numbers add up to " + target);
        }
    }
}

