package collections.kit.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> mapValues = new HashMap<>();

        mapValues.put(10,"A");
        mapValues.put(1,"B");
        mapValues.put(30,"C");
        mapValues.put(11,"D");
        mapValues.put(2,"E");
        mapValues.put(6,"F");

        //have to create the Set to iterate these map values
        /*Set setValue = mapValues.entrySet();

        Iterator itr = setValue.iterator();

        while(itr.hasNext()){
            Map.Entry<Integer, String> entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }*/

        // traverse using forEach

       /* for(Map.Entry<Integer, String> entry: mapValues.entrySet()){
            System.out.println(entry.getKey()+" = "+ entry.getValue());
        }*/

        mapValues.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

    }
}
