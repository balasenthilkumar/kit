package collections.kit.classesnobjects;

public class ConstructorDemo {

        public ConstructorDemo(){
            // this constructor will take responsibility to initialize the default value
        }


    int i;
    String name;
    boolean validate;
    char c;  // instance variable, so no need to initialize



    public ConstructorDemo(int ijk, String name123, boolean validate123, char c123){
        // going to assign the incoming values to the instance variables

        this.i = ijk;
        this.name = name123;
        this.validate = validate123;
        this.c = c123;
    }

    public static void main(String[] args) {
        ConstructorDemo objRef = new ConstructorDemo(10, "Senthilkumar", true, 'S'); // do some allocation in memory and pointing to this reference objRef

        System.out.println("int value is "+objRef.i); // 0
        System.out.println("String value is "+objRef.name); // null
        System.out.println("boolean Value is "+objRef.validate); //false
        System.out.println("char value is "+objRef.c); //null
    }
}
