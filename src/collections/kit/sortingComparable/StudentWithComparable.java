package collections.kit.sortingComparable;

import collections.kit.sorting.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentWithComparable implements Comparable<StudentWithComparable> {
    private int id;
    private String name;

    public StudentWithComparable(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentWithComparable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        StudentWithComparable s1 = new StudentWithComparable(5,"PranavBala");
        StudentWithComparable s2 = new StudentWithComparable(2,"AbinavBala");
        StudentWithComparable s3 = new StudentWithComparable(4,"YashwinBala");
        StudentWithComparable s4 = new StudentWithComparable(1,"TarunBala");
        StudentWithComparable s5 = new StudentWithComparable(3,"SanthoshBala");

        List<StudentWithComparable> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        Collections.sort(list);
        System.out.println(list.toString());

    }

    @Override
    public int compareTo(StudentWithComparable s) {
       /* if(id == s.id){
            return 0;
        } else if(id > s.id) {
            return 1;
        } else {
            return -1;
        }*/

        return name.compareTo(s.name);
    }
}
