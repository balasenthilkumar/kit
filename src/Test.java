import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args)   {
        String s1 = "Global Council Steering Team Council is application that will help application ford admins to Manage their purchase Details. Formal procedure for purchasing commodity buyers to present information to obtain approvals, The GCST needs to approve All New Model programming sourcing, Modified programs with significant volume.";
        String[] sArray = s1.split(" ");
        Map<String, Integer> map1 = new HashMap<>();

        for(String s:sArray){
            Integer count = map1.get(s);
            if(null == count){

                map1.put(s,1);

            } else {
                map1.put(s,++count);
            }
        }


    for(Map.Entry m1: map1.entrySet()){
        System.out.println(m1.getKey()+ " - "+m1.getValue());
    }

    }
}
