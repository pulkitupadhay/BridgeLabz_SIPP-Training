import java.util.*;
import java.util.stream.*;

public class Q5_TransformingNamesForDisplay {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob", "charlie", "david");
        names.stream()
            .map(String::toUpperCase)
            .sorted()
            .forEach(System.out::println);
    }
}

