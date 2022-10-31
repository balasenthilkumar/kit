package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemoForArrayList {
    private  static String name;
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(5);
        list1.add(5);

        for (int i : list1) {
            System.out.println(i);
        }
    }
}
