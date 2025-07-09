package DSA.Stack_Queue_HashMap;

import java.util.*;

class PairWithSum {
    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(target - num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
public class PairWithSumDemo {
    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;

        System.out.println("Input Array: " + Arrays.toString(arr));
        System.out.println("Target Sum: " + target);

        boolean result = PairWithSum.hasPairWithSum(arr, target);
        if (result) {
            System.out.println("There exists a pair with the given sum.");
        } else {
            System.out.println("No pair found with the given sum.");
        }
    }
}
