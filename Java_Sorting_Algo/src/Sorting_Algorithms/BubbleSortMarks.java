package Sorting_Algorithms;

public class BubbleSortMarks {
    public static void main(String[] args) {
        int[] marks = {87, 45, 67, 90, 76, 55};
        bubbleSort(marks);
        for (int mark : marks) System.out.print(mark + " ");
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
