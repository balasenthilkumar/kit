package collections.kit.stringBuffer;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Senthil");
        s1.append(" kumar");
        System.out.println(s1);  //  advisable Multithreaded environment

        StringBuilder s2 = new StringBuilder("Dinesh");
        s2.append(" kumar");
        System.out.println(s2); // if there is no parallel programing execution, then StringBuilder is advisable
    }
}
