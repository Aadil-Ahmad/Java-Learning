package examples.practice.innerclass;

public class NestedStatic {
    public static void methodMain(){
        System.out.println("Printing the details of the main method");
    }
    static class Inner{
        public static void methodInner(){
            System.out.println("Printing the details of the inner method");
            methodMain();
        }
    }

}
class Main3{
    public static void main(String[] args) {
        NestedStatic.Inner.methodInner();
    }
}
