package collections.kit.inheritance;

public abstract class SuperClassDemo {

     int id;
     String name;
     String location;

     SuperClassDemo(int i, String s, String l){
         this.id = i;
         this.name = s;
         this.location = l;
     }

     SuperClassDemo(int i){
          System.out.println("argumented constructor from Superclass");
     }




}
