package examples.practice.innerclass;

public class InnerClass2nd {
    public void innerMethod(){
        int x = 30;
        System.out.println("Method of the main class");
        class InnerSecond{
            public void displayInner(){
                System.out.println("Inner method outer variable value: " + x);
            }
        }
        InnerSecond y = new InnerSecond();
        y.displayInner();
    }
}
class Main2{
    public static void main(String[] args) {
        InnerClass2nd z = new InnerClass2nd();
        z.innerMethod();
    }
}
