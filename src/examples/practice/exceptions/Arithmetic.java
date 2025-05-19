package examples.practice.exceptions;

public class Arithmetic {

    public static void main(String[] args){
        int n = 10;
        int m = 0;
        try {
            int ans = n/m;
            System.out.println("The result is: "+ ans);
        }
        catch (NullPointerException e){
            System.out.println("Error: Null Pointer Exception"+ e);
        }
        catch (ArithmeticException e){
            System.out.println("Error: Arithmetic exception"+ e);
        }
        catch (Exception e){
            System.out.println("Error: "+e);
        }
        finally {
            System.out.println("Program continue after handling the arithmetic exception");
        }


        try {
            String s = null;
            System.out.println("The string length is: " + s.length());
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
        finally {
            System.out.println("Programme continue after handling null pointer exception ");
        }

        System.out.println("New operation");
    }


}
