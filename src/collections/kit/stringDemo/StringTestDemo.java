package collections.kit.stringDemo;
import java.util.Objects;
public class StringTestDemo {

    public static void main(String[] args) {
        String name = "Masaki";
        String firstName = new String("masaki");
        String index = "  Kirirom Institute of technologies  ";

        // charAt()
        System.out.println("charAt() == "+name.charAt(4)); // k

        //String is immutable
        name.concat(" is a student from KIT");  // the reason is String class is immutable
        System.out.println(name);

        //concat
        System.out.println("concatenation == "+name.concat(" is a Student from KIT"));

        //length()
        System.out.println("length = "+name.length());

        //replace()
        System.out.println("replace() = "+firstName.replace('m','A'));

        //replaceAll()
        System.out.println("replaceAll() = "+firstName.replaceAll("A", "a"));

        //subString()
        System.out.println("subString"+index.substring(7, 13));

        //trim()
        System.out.println("without trim()"+ index);
        System.out.println("with trim()"+ index.trim());

        System.out.println(name == firstName); //  it will check the reference
        System.out.println(name.equalsIgnoreCase(firstName)); //  it will check value
    }
}
