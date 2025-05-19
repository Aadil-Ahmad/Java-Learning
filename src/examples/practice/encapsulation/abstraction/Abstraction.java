package examples.practice.encapsulation.abstraction;
abstract class Abstraction {
    abstract void turnOn();
    abstract void turnOff();

}

class Test extends Abstraction{
    @Override
    public void turnOn(){
        System.out.println("Turned on");
    }
    @Override
    public void turnOff(){
        System.out.println("Turned off");
    }
}

class Main{
    public static void main(String[] args){
        Abstraction obj = new Test();
        obj.turnOn();
        obj.turnOff();
    }
}
