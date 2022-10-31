package collections.kit.loopcontrols;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        String name = "Daravuth";
        switch (name) {
            case "Daravuth":
                System.out.println("Hello my name is Daravuth");
                break;
            case "Sreng":
                System.out.println("Hello my name is Sreng");
                break;
            case "Masaki":
                System.out.println("Hello my name is Masaki");
                break;
            default:
                System.out.println("Please enter your name");
        }

    }
}
