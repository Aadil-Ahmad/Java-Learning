package examples.practice.encapsulation.abstraction;

abstract class Shape{
    String colour;
    abstract double area();
    public abstract String toString();

    public Shape(String colour){
        System.out.println("Constructor of shape is called "+colour);
        this.colour = colour;
    }
    public String getColour(){
        return colour;
    }
}

class Circle extends Shape{
    double radius;
    public Circle(String newColour, double newRadius){
        super(newColour);
        this.radius = newRadius;
    }
    @Override
    public double area(){
        return Math.PI*radius*radius;
    }

    @Override
    public String toString(){
        return "Circle colour is : "+ colour + " The area is : "+area();
    }
}

class Rectangle extends Shape{
    double length;
    double breadth;
    public Rectangle(double l, double b, String colour ){
        super(colour);
        this.length = l;
        this.breadth = b;
    }
    @Override
    public double area(){
        return length*breadth;
    }
    @Override
    public String toString(){
        return "The Colour of rectangle is "+ colour+" The area is : "+ area();
    }

}

public class Area {
    public static void main(String[] args){
        Shape s1 = new Circle("red", 4);
        Shape s2 = new Rectangle(20.0f, 14.0f, "blue");
        System.out.println("Calling Circle Data : "+ s1);
        System.out.println("Calling Rectangle Data : "+ s2);
    }
}
