package collections.kit.exceptionDemo;

public class InSufficientBalaceException extends Exception {
    double amount;
    InSufficientBalaceException(double amt){
        amount = amt;
    }
}
