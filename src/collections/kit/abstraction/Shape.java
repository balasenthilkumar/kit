package collections.kit.abstraction;

public interface Shape {
    public void draw();  // abstract method  / method declaration

    default void print(){
        System.out.println("method defintion in abstract class");
    } //non-abstract method / method definition
}
