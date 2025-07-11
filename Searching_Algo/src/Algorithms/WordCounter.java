package Algorithms;

import java.io.*;

public class WordCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String line;
        int count = 0;
        String target = "example";
        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (word.equalsIgnoreCase(target)) count++;
            }
        }
        reader.close();
        System.out.println("Occurrences of \"" + target + "\": " + count);
    }
}
