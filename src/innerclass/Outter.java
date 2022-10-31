package innerclass;

public class Outter {
    int num;

    void outerDisplay() {
        System.out.println("display from outer class");
    }

    class Inner {
        int x;

        void innerDisplay() {
            System.out.println("display from inner class");
        }
    }


}
