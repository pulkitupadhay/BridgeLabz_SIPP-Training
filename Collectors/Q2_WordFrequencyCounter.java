import java.util.*;
import java.util.stream.*;

public class Q2_WordFrequencyCounter {
    public static void main(String[] args) {
        String paragraph = "hello world hello java java world";
        List<String> words = Arrays.asList(paragraph.split(" "));
        Map<String, Long> freq = words.stream()
            .collect(Collectors.toMap(w -> w, w -> 1L, Long::sum));
        System.out.println(freq);
    }
}

