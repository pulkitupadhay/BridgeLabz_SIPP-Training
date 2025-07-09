package DSA.Stack_Queue_HashMap;

import java.util.*;

public class ZeroSumSubarrays {
    public static void findSubarrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;
        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                for (Integer start : map.get(sum)) {
                    System.out.println("Subarray: [" + (start + 1) + ", " + i + "]");
                }
            }
            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        System.out.println("Input Array: " + Arrays.toString(arr));
        System.out.println("Zero Sum Subarrays:");
        findSubarrays(arr);
    }
}
