package collections.kit.keywords;

class ParentClass {
    public ParentClass() {
        System.out.println("from ParentClass");
    }

    public ParentClass(int i) {
        System.out.println("int from ParentClass");
    }

    public void show(){
        System.out.println("Super class method");
    }

}

class ChildClass extends ParentClass{
    public ChildClass() {
        super(); // by default java compiler will write this super() for all the child classes
        System.out.println("from Child class");
    }


    public ChildClass(int i) {
        super();
        System.out.println("int from Child class");
        super.show();

    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        ChildClass objRef = new ChildClass(5);

    }
}
