package collections.kit;

public class StaticVariableDemo {
    int i;   //instance variable having copy with each object
    String name;  //instance variable
    static int j;  // static variable unique per class

    public static void main(String[] args) {
        StaticVariableDemo obj1 = new StaticVariableDemo();
        StaticVariableDemo obj2 = new StaticVariableDemo();
        StaticVariableDemo obj3 = new StaticVariableDemo();
        StaticVariableDemo obj4 = new StaticVariableDemo();

        System.out.println("instance Variable = "+ obj1.i++);
        System.out.println("static variable = "+ j++);

        System.out.println("instance Variable = "+ obj1.i++);
        System.out.println("static variable = "+ j++);

        System.out.println("instance Variable = "+ obj2.i++);
        System.out.println("static variable = "+ j++);

        System.out.println("instance Variable = "+ obj2.i++);
        System.out.println("static variable = "+ j++);

      /*  System.out.println("instance variable    : "+ ++obj1.i);
        System.out.println("instance string variable   : "+ obj1.name);
        System.out.println("static variable   :"+StaticVariableDemo.j++);

        System.out.println("instance variable    : "+ ++obj2.i);
        System.out.println("instance string variable   : "+ obj2.name);
        System.out.println("static variable   :"+StaticVariableDemo.j++);

        System.out.println("instance variable    : "+ ++obj3.i);
        System.out.println("instance string variable   : "+ obj3.name);
        System.out.println("static variable   :"+StaticVariableDemo.j++);

        System.out.println("instance variable    : "+ ++obj4.i);
        System.out.println("instance string variable   : "+ obj4.name);
        System.out.println("static variable   :"+StaticVariableDemo.j++);*/
    }
}
