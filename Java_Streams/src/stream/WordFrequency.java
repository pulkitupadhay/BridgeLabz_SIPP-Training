package stream;

import java.io.*;
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        Map<String, Integer> wordCount = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("text.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (String word : line.toLowerCase().split("\\W+")) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        wordCount.entrySet().stream()
            .sorted((a, b) -> b.getValue() - a.getValue())
            .limit(5)
            .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
