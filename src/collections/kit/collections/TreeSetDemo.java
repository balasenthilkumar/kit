package collections.kit.collections;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        Set<String> listValues = new TreeSet<>();
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

