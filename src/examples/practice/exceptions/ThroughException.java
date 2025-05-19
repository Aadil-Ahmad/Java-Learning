package examples.practice.exceptions;

public class ThroughException {

    public static void fun(){
        try {
            throw new NullPointerException("demo");
        }
        catch (NullPointerException e){
            System.out.println("Catches me ");
            throw e;
        }
    }
    public static void main(String[] args){

        try {
            fun();
        }
        catch (NullPointerException e){
            System.out.println("Caught inside Main: "+e);
        }

    }
}
