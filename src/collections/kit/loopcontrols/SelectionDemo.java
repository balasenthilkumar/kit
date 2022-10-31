package collections.kit.loopcontrols;

public class SelectionDemo {

    public static void main(String[] args) {
        String firstName = "DineshKUmar";
        String lastName = "Anand";

        if(firstName.equalsIgnoreCase("DineshKum")) {
            System.out.println("Hello Mr."+firstName);
        } else if(lastName.equalsIgnoreCase("Anand1")){
            System.out.println("Hello Mr."+lastName);
        } else {
            System.out.println( "couldn't identify the name in this class");
        }

    }
}
