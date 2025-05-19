package examples.practice.exceptions;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ThrowThrows {
//    USING THROW AND THROWS METHODS

    public static void main(String[] args) {
        try {
            methodA();  //
            System.out.println("Calling method A from the main method");
        }
        catch (ArithmeticException ex){
            System.out.println("Arithmetic Exception   caught... ");
        }
    }
    private static void methodA() throws ArithmeticException{
        int a = 10, c;
        System.out.println("Enter the value of b: ");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        scanner.nextLine();
        if (b==0){
            System.out.println("Throw Exception from Method a");
            throw new ArithmeticException();
        }
        else {
            c = a/b;
            System.out.println("Exit Method A: " + c);
        }
    }

}
