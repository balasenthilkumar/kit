package collections.kit.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        Set<String> listValues = new LinkedHashSet<>();
        listValues.add("Senthilkumar");
        listValues.add("Kamal");
        listValues.add("Abinaya");
        listValues.add("xavior");
        listValues.add("Aathma");
        listValues.add("xavior");
        listValues.add("Abinaya");
        listValues.add("Senthilkumar");

        System.out.println(listValues);

    }
}
