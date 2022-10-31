package collections.kit.inheritance;

public class ChildClassDemo extends SuperClassDemo {

    void printValue() {
        super.id = 101;
        super.name = "Senthilkumar";
        super.location = "Chennai";

        System.out.println(super.id);
        System.out.println(super.name);
        System.out.println(super.location);
    }

    ChildClassDemo() {
        super(1, "s", "l");

    }


    public static void main(String[] args) {

        ChildClassDemo objRef = new ChildClassDemo();
        objRef.printValue();

    }
}
