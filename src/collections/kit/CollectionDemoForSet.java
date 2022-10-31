package collections.kit;

import collections.kit.arithmeticOperators.LogicalOperatorDemo;

import java.util.HashSet;
import java.util.Set;

public class CollectionDemoForSet {

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();


        s1.add(1);
        s1.add(2);
        s1.add(3);

        Set<String> s2 = new HashSet<>();

        s2.add("Java");
        s2.add("Spring");
        s2.add("microservices");
        s2.add("Java");

        s2.remove("Java");



        System.out.println(s2);
    }

}
