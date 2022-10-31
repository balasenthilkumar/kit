package collections.kit.Demo;

import java.util.ArrayList;
import java.util.List;

public class ForLoopDemo {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();

        for(int i=100;i>1;i--){
            int x = --i;  //99
            int y = --x;  //98
            l1.add(y);
        }

        for(Integer key:l1){
            // key value is 98
            System.out.println("Iteration using forEach : "+  --key);
        }




    }
}
