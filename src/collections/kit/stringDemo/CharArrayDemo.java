package collections.kit.stringDemo;

import collections.kit.classesnobjects.User;

public class CharArrayDemo {
    public static void main(String[] args) {
        String institute= "Kirirom Institute of Technology";
        User user1 = new User();


        char[] charArray = institute.toCharArray();
        String[] stringArray = institute.split(" ");

        for(String s:stringArray){
            System.out.print(s+", ");
        }

        for(char i:charArray){
            System.out.print(i +", ");
        }

        //contains()
        System.out.println("contains() === "+institute.contains("Institdfute"));

    }
}
