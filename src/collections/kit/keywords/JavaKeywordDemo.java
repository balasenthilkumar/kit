package collections.kit.keywords;

class A {
    public A(){
        System.out.println("in class A");
    }

    public A(int i){
        System.out.println("int i in  class A");
    }
}

class B extends A{
    public B(){
        System.out.println("in class B");
    }

    public B(int i){

        System.out.println("int i in  class B");
    }
}

public class JavaKeywordDemo {
    public static void main(String[] args) {
        B obj1 = new B();

    }
}
