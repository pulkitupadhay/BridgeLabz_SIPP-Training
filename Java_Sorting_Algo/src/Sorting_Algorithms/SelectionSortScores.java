package Sorting_Algorithms;

public class SelectionSortScores {
    public static void main(String[] args) {
        int[] scores = {70, 85, 60, 90, 75};
        selectionSort(scores);
        for (int score : scores) System.out.print(score + " ");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[minIdx]) minIdx = j;
            int temp = arr[i]; arr[i] = arr[minIdx]; arr[minIdx] = temp;
        }
    }
}
