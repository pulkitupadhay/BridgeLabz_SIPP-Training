package Sorting_Algorithms;

public class CountingSortAges {
    public static void main(String[] args) {
        int[] ages = {16, 17, 13, 12, 15, 16, 14, 18, 11, 10};
        countingSort(ages, 10, 18);
        for (int age : ages) System.out.print(age + " ");
    }

    public static void countingSort(int[] arr, int min, int max) {
        int[] count = new int[max - min + 1];
        for (int num : arr) count[num - min]++;
        int index = 0;
        for (int i = 0; i < count.length; i++)
            while (count[i]-- > 0) arr[index++] = i + min;
    }
}
