package examples.practice.polymorphism;

class Animal {
    public void makeSound(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("Dog Sound");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Cat Sound");
    }
    public void colour(){
        System.out.println("White Colour");
    }
}

class OverrideExample{
    public static void main(String[] args){
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Animal();
        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}