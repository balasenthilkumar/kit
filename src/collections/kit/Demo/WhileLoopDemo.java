package collections.kit.Demo;

public class WhileLoopDemo {

    public static void main(String[] args) {
        int x = 5;

      /*  while(x==5){
            System.out.println("Within the loop");
            x++;
        }
        System.out.println("outside the while loop");
    }*/
        do{
            System.out.println("within the loop");
            x++;
        } while(x==5);
        System.out.println("outside the loop");


    }

}
