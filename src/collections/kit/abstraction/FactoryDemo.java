package collections.kit.abstraction;

import java.util.List;

public class FactoryDemo{
    public static void main(String[] args) {
        Shape s = new Rectangle() ;
        s.draw();
    }
}
