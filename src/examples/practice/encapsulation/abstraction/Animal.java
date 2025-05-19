package examples.practice.encapsulation.abstraction;

abstract class AnimalMain{
    public String name;
    public AnimalMain(String newName){
         this.name = newName;
    }
    abstract void makeSound();

    public String toString(){
        return "The name of the animal is "+ name;
    }
}

class Dog extends AnimalMain{

    String sound;
    public Dog(String newName, String newSound){
        super(newName);

        this.sound = newSound;
    }
    @Override
    public void makeSound(){

    }
    public String toString(){
        return "The animal sound is: "+ sound;
    }
}

class Cat extends AnimalMain{
    public String sound;
    public Cat(String newName, String newSound){
        super(newName);
        this.sound = newSound;
    }
    public void makeSound(){

    }
    public String toString(){
        return "The animal sound is: "+ sound;
    }
}

public class Animal {
    public static void main(String[] args){
        AnimalMain a1 = new Dog("Lucky","Barks");
        AnimalMain a2 = new Cat("Tom","meows");
        System.out.println("The animal name is : "+ a1.name+ " "+a1);
        System.out.println("The animal name is : "+ a2.name+ " "+a2);

    }
}
