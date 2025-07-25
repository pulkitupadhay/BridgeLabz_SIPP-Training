package List;
import java.util.*;
public class FrequencyCounter {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> freqMap = new HashMap<>();

        for (String item : items) {
            freqMap.put(item, freqMap.getOrDefault(item, 0) + 1);
        }

        System.out.println(freqMap);
    }
}
