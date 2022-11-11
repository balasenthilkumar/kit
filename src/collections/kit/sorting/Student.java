package collections.kit.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    private int id;
    private String name;

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

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student s1 = new Student(5,"PranavBala");
        Student s2 = new Student(2,"AbinavBala");
        Student s3 = new Student(4,"YashwinBala");
        Student s4 = new Student(1,"TarunBala");
        Student s5 = new Student(3,"SanthoshBala");
        Student s6 = new Student(2,"Aala");

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);

        Collections.sort(list, new IdComparator());

        System.out.println(list.toString());

    }

}
