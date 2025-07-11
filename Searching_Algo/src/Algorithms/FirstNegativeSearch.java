package Algorithms;

public class FirstNegativeSearch {
    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 7, -3, 2, -5};
        System.out.println(findFirstNegative(nums)); 
    }
}
