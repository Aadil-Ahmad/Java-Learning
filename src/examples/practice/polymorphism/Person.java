package examples.practice.polymorphism;

public class Person {
    public void role(){
        System.out.println("I am a person");
    }
}
 class Father extends Person{
    public void role(){
        System.out.println("I am a father");
    }
 }

 class Engineer extends Person{
     @Override
     public void role() {
         System.out.println("I am an Engineer");
     }
 }
class Main{
    public static void main(String[] args){
        Person p1 = new Father();
        p1.role();
    }
}