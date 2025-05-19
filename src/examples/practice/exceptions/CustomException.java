package examples.practice.exceptions;

public class CustomException extends Exception{
    public CustomException(String m){
        super(m);
    }
}

class CustomTest{
    public static void main(String[] args) {
        try {
            throw new CustomException("This is a Custom Exception");
        }
        catch (CustomException e){
            System.out.println("Caught");
            System.out.println(e.getMessage());
        }
    }
}

class newTest{
    public static void main(String[] args) {
        try {
            throw new CustomException("New testing exception");
        }
        catch (CustomException ex){
            System.out.println("Caught New");
            System.out.println(ex.getMessage());
        }
    }
}
