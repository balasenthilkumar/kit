package collections.kit.keywords;

class Students {
    int studId;
    String studName;
     static String studUniversity;

    @Override
    public String toString() {
        return "Students{" +
                "studId=" + studId +
                ", studName='" + studName + '\'' +
                ", studUniversity='" + studUniversity + '\'' +
                '}';
    }
}

public class StaticKeyworkDemo {
    public static void main(String[] args) {
        Students student1 = new Students();
        Students student2 = new Students();

        student1.studId = 101;
        student1.studName = "Paul";
        Students.studUniversity = "KIT";
        System.out.println(student1.toString());

        student2.studId = 102;
        student2.studName = "Peter";
        Students.studUniversity = "KIT";
        System.out.println(student2.toString());

    }
}
