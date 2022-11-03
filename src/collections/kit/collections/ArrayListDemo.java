package collections.kit.collections;

import java.util.*;
import java.util.LinkedList;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(); // list implementation are ArrayList, LinkedList, Vector

       list.add(200);
       list.add(300);
       list.add(1);
       list.add(25);
       list.add(0);

       /*for(Integer i:list){
           System.out.println(i);
       }*/

      /*  Iterator<Integer> i = list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }*/

        ListIterator<Integer> i = list.listIterator();

        while(i.hasNext()){
            System.out.println("printingElements :"+i.next());
        }

        while(i.hasPrevious()){
            System.out.println("reverseOrder : "+i.previous());

    }

        //converting Array to List

        String[] array = {"java", "python", "scala", "kafka", "elk"}; // its mandatory to initialize the value or size

        List<String> lg = Arrays.asList(array);

       /* for(String s:array){
            lg.add(s);
        }*/

        System.out.println(lg);


        //converting List to Array

        String[] copiedArray = lg.toArray(new String[lg.size()]);

        System.out.println("Array elements: "+Arrays.toString(copiedArray));

        //get & set elements in list

        System.out.println(lg.get(3));

       lg.set(4,"kafka");

        System.out.println(lg);



}}
