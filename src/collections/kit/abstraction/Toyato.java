package collections.kit.abstraction;

public class Toyato extends Bike{
    @Override
    void run() {
        System.out.println("running safely");
    }

    public static void main(String[] args) {
        Bike b1 = new Toyato();
        b1.run();
    }
}
