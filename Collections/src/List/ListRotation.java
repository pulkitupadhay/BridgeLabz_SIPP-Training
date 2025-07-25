package List;
import java.util.*;
public class ListRotation {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int rotateBy = 2;

        List<Integer> rotated = new ArrayList<>();
        int size = list.size();

        for (int i = rotateBy; i < size + rotateBy; i++) {
            rotated.add(list.get(i % size));
        }

        System.out.println(rotated);
    }
}
