package collections.kit.polymorphism;

public class PolymorphismDemo {

     PolymorphismDemo(){
        System.out.println("no argument constructor");
    }

    PolymorphismDemo(int i){
        System.out.println("argumented constructor");
    }

    PolymorphismDemo(int i, int j){
        System.out.println("multple argumented constructor");
    }

    PolymorphismDemo(int i, double j){
        System.out.println("example for implicit type conversion");
    }

    int add(int i, int j) { // method having the same name and diff parameters is called Polymorphism
        return i+j;
    }

    int add(int i, int j, int k){
        return i+j+k;
    }

    public static void main(String[] args) {
        PolymorphismDemo objRef = new PolymorphismDemo(5,6.5); // we are not declaring any type explicitly
    }
}
