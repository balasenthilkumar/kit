package collections.kit.collections;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMap {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Senthilkumar");
        Employee emp2 = new Employee(1,"Leo");
        Employee emp3 = new Employee(1,"Dinesh");

        Map<String, Employee> map = new HashMap<>();

        map.put(emp1.getName(), emp1);
        map.put(emp2.getName(), emp2);
        map.put(emp3.getName(), emp3);

        for(Map.Entry m:map.entrySet()){
            Employee a = (Employee) m.getValue();
            System.out.println(m.getKey() +": "+a.getId() +", "+a.getName());
        }
    }
}
