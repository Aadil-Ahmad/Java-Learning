// Java Program to Demonstrate the
// use of a class with instance variable
public class Dog {
    String name;
    String bread;
    String colour;
    int age;

    public Dog(String name,String bread, String colour, int age){
        this.name = name;
        this.bread = bread;
        this.colour = colour;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getBread(){
        return bread;
    }
    public String getColour(){
        return colour;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return ("Name is : "+ getName()+"\nThe Bread, Colour & the age of the Dog is : "+getBread()+" "+getColour()+" "+getAge());
    }
    public static void main(String[] args){
        Dog nik = new Dog("Nik","Husky","grey",4);
        System.out.println(nik);
    }

}
