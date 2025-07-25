package set;
import java.util.*;

public class SubsetCheck {
    public static void main(String[] args) {
        Set<Integer> small = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> large = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        System.out.println(large.containsAll(small));
    }
}
