package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** paragraph dsfndskjf
 * sfsdfsf
 */

public class CollectionsDemoForMap {
    public static void main(String[] args) {
        Map<String, Integer> employee = new LinkedHashMap<>();

        employee.put("ABC", 1000);
        employee.put("CBA", 2000);
        employee.put("AAb", 5000);

        employee.remove("CBA");

        for(Map.Entry<String, Integer> emp:employee.entrySet()){
            System.out.println(emp.getKey() +" - " + emp.getValue());
            System.out.println();
        }

        DemoForConditional obj = new DemoForConditional();







    }
}
