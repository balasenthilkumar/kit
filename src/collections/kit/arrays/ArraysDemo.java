package collections.kit.arrays;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {

        String[] name = new String[5];  // 1. name   2. copyArray
        name[0] = "A";
        name[1] = "B";
        name[2] = "C";
        name[3] = "D";
        name[4] = "E";

        String[] copyArray = Arrays.copyOf(name, 10);
        copyArray[5] = "xyz";
        copyArray[6] = "Senthilkumar";
        copyArray[7] = "Masaki";
        copyArray[8] = "Kimsur";
        copyArray[9] = "Thearen";

        for(int i=0;i< copyArray.length;i++){
            System.out.println(copyArray[i]);
        }

    }
}
