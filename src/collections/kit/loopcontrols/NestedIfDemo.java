package collections.kit.loopcontrols;
import java.util.Arrays;
import java.util.List;


public class NestedIfDemo {

    public static void main(String[] args) {
        List<Object> childrens = Arrays.asList("B", "E", "G");
        List<Object> parents = Arrays.asList("A", "C", "D", "F", "G", childrens);
            // in java String is also a object
        if (!(parents.isEmpty())) {
                if(parents.contains(childrens))
                    for(Object o:childrens){
                        System.out.println(o);
                    }
            return;
        }


    }

}
