package collections.kit.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HasMapDemoAdding {

    public static void main(String[] args) {
        Map<Integer, String> mapValues = new HashMap<>();

        mapValues.put(10,"A");
        mapValues.put(1,"B");
        mapValues.put(30,"C");


        for(Map.Entry m:mapValues.entrySet()){
            System.out.println(m.getKey()+ "=="+m.getValue());
        }

        System.out.println("after adding another map");

        Map<Integer, String> addValues = new TreeMap<>();
        addValues.put(15,"sg");
        addValues.put(11,"KG");
        addValues.putAll(mapValues);

        for(Map.Entry m:addValues.entrySet()){
            System.out.println(m.getKey()+ "=="+m.getValue());
        }




    }
}
