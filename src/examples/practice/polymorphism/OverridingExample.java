package examples.practice.polymorphism;

public class OverridingExample {
    String name;
    int age;
    int marks;
    public void display(String name){
        System.out.println("The name is: "+ name);
    }
}
 class NewOverloading extends OverridingExample{
    public void display(String name){
        System.out.println("Overriding");
        System.out.println("The name is: "+name);
    }
    void callParent(){
        super.display("Kamal");
    }
    public static void main(String[] args){
       NewOverloading obj1 = new NewOverloading();
       obj1.display("Vinoth");
       obj1.callParent();


    }
}
class Result{
    public static void main(String[] args){

    }
}

