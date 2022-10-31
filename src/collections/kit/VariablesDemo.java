package collections.kit;

public class VariablesDemo {
    private int j;  //instance variable, so we no need to intialize
    public int add() {
            int a=10;  // local variable are need to initialize
            int b=10;
        return a+b;
    }

    public static void main(String[] args) {
        VariablesDemo obj1 = new VariablesDemo();
        int c = obj1.add();
        System.out.println(c);
       // obj1.j = 100;
        System.out.println("Example of instance variable :" +obj1.j);

    }

}
