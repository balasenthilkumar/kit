package collections.kit.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> lList = new LinkedList<>();

        for(int i=1;i<=5;i++){
            lList.add(i);
        }

        System.out.println(lList);

        lList.remove(3);

        System.out.println(lList);


    }
}
