package collections.kit.serialization;

import java.io.*;

public class Student extends Person{

    String course;
    int fee;

    Student(int id, String name,Address address, String course, int fee){
        super(id,name,address);
        this.course = course;
        this.fee = fee;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //wrinting the student object into some where
        Address address1 = new Address("RockStree","Chennai",600100L);
        Student s1 = new Student(101,"Rokesh", address1, "Java", 10000);
        FileOutputStream fileInput = new FileOutputStream("D:\\serialization.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileInput);
        out.writeObject(s1);
        out.flush();
        out.close();
        System.out.println("object converted into stream");

     /*   //FileInputStream fileIn = new FileInputStream("D:\\serialization.txt")
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("D:\\serialization.txt"));
        Student s = (Student)input.readObject();
        System.out.println(s.id +"==="+s.name+ "===="+s.course+ "==="+s.fee);
        input.close();*/

    }
}
