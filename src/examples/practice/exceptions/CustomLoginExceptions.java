package examples.practice.exceptions;

import javax.sound.midi.Soundbank;
import java.security.PublicKey;
import java.util.Scanner;

public class CustomLoginExceptions {
    public static final String USER_PASSWORD = "Admin@22";
    public static final String USER_NAME = "ADMIN";

    public void login(String name, String password)throws EmptyFieldException, InvalidCredential{
        if (name == null || name.trim().isEmpty()
         || password == null || password.trim().isEmpty()){
            throw new EmptyFieldException("User name and password should not be null");
        }
        if (!name.equalsIgnoreCase(USER_NAME) || !password.equalsIgnoreCase(USER_PASSWORD)){
            throw new InvalidCredential("The user name or password is incorrect");
        }
        System.out.println("Login successfully");
    }
}

class Main{
    public static void main(String[] args) throws InvalidCredential, EmptyFieldException {
        CustomLoginExceptions obj = new CustomLoginExceptions();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Welcome to the Custom Login App\n\n");
            System.out.println("Enter your name");
            String name = scanner.nextLine();

            System.out.println("Enter your password: ");
            String password = scanner.nextLine();
            obj.login(name, password);
        }
        catch (EmptyFieldException | InvalidCredential ei){
            System.out.println("Error : "+ ei.getMessage());
        }
        catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        finally {
            scanner.close();
            System.out.println("Finish");
        }

    }
}

class EmptyFieldException extends Exception{
   public EmptyFieldException(String message){
       super(message);
   }
}
class InvalidCredential extends Exception{
    public InvalidCredential(String message){
        super(message);
    }
}