package collections.kit.exceptionDemo;

import java.util.Scanner;

public class PrintStackTraceDemo {

    public static void main(String[] args) throws InterruptedException {

        double balance = 500;
        double withDraw = 700;
       try {
           if (balance > withDraw) {
               System.out.println("you can withdraw the amount");
           } else {
               throw new InSufficientBalaceException(withDraw-balance);
           }
       } catch (InSufficientBalaceException e) {
           e.printStackTrace();
       }


        Thread.sleep(1000);


    }
}
