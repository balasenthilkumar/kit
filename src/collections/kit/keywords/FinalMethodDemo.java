package collections.kit.keywords;


final class Parent {  // if we declare the Parent class as final, then the child class cannot inherit the feautres of Parent class
    String name;
    void show(){
        System.out.println("printing from Parent");
    }

}

class Child  {
    void show1(){   //overriding the method from parent class
        System.out.println("printing from Child");
    }
}

public class FinalMethodDemo {

    public static void main(String[] args) {
        Child obj1 = new Child();
        obj1.show1();
    }
}
