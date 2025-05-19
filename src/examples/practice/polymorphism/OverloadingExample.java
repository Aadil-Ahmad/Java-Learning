package examples.practice.polymorphism;

public class OverloadingExample {


    public void displayData(){
        System.out.println("Display the Student Data");
    }
    public void displayData(String name){
        System.out.println("The name of the student is : "+name);
    }
    public void displayData(String name, String colgName){
        System.out.println("The name of the student is : "+ name+" Studying at "+colgName);
    }
    public void displayData(String name, String colgName, int age){
        System.out.println("The name is: "+ name+" studying at: "+colgName+ " age "+ age);
    }
    public static void main(String[] args){
        OverloadingExample obj1 = new OverloadingExample();
        obj1.displayData();
        obj1.displayData("Vinoth");
        obj1.displayData("Hydel", "VYAS");
        obj1.displayData("Raj","Vyas.",25);

    }
}
