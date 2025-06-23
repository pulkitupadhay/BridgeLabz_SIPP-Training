package Strings;

import java.util.*;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        Map<Character, Integer> freq = new HashMap<>();
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        char mostFreq = ' ';
        int max = 0;
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                mostFreq = entry.getKey();
            }
        }

        System.out.println("Most Frequent Character: '" + mostFreq + "'");
    }
}
