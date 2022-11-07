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
        mapValues.put(30,"XYZ");



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
        // returns the view of Map
        mapValues.entrySet()
                //used to walkthrough one by one
                .stream()
                // used to sorting using comparator
                .sorted(Map.Entry.comparingByKey())
                // perform the print action with the help of method reference
                .forEach(System.out::println);

    }
}
