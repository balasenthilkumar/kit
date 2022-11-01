package collections.kit.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList(); // list implementation are ArrayList, LinkedList, Vector

        for(int i=1;i<=5;i++){
            list.add(i);
        }
        //printing the list
        System.out.println(list);

        //removing elements from the list
        list.remove(3);

        //printing again

        System.out.println(list);
    }
}
