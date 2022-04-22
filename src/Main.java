import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        SortedSet<Integer> myList = new TreeSet<>();
        for (int i : intList) {
            if (i > 0 && i % 2 == 0) {
                myList.add(i);
            }
        }
        for (Integer my : myList) {
            System.out.println(my);
        }


    }
}
