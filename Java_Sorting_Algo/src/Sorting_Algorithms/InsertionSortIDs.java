package Sorting_Algorithms;

public class InsertionSortIDs {
    public static void main(String[] args) {
        int[] ids = {104, 101, 105, 102, 103};
        insertionSort(ids);
        for (int id : ids) System.out.print(id + " ");
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > key) arr[j + 1] = arr[j--];
            arr[j + 1] = key;
        }
    }
}
