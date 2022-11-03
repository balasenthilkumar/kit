package collections.kit.collections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        List<String> listValues = new ArrayList<>();
        listValues.add("Senthilkumar");
        listValues.add("Kamal");
        listValues.add("Abinaya");
        listValues.add("xavior");
        listValues.add("Aathma");
        listValues.add("xavior");
        listValues.add("Abinaya");
        listValues.add("Senthilkumar");

        System.out.println("List Values "+ listValues);


        Set<String> setValues = new HashSet<>(listValues);

        System.out.println("Set Values "+ setValues);


    }
}
