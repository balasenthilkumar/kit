package collections.kit;

public class TestModifier {
    boolean x;
    int y;
    float z;
    double a;

    public static void main(String[] args) {
        TestModifier obj1 = new TestModifier();
        obj1.x = true;
        System.out.println(obj1.x);
        System.out.println(obj1.y);
        System.out.println(obj1.z);
        System.out.println(obj1.a);

            if(obj1.x == true){
                System.out.println("the value is true");
            } else {
                System.out.println("the value is false");
            }

    }
}
