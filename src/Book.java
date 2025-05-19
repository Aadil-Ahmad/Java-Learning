// Java Program to initialize Java Object
// by using method/function
public class Book {
    static String n;
    static float p;

    static void set(String name, float price){
        n = name;
        p = price;
    }

    static void get(){
        System.out.println("The name of the book is : "+n);
        System.out.println("The price of the book is : " +p);
    }

    public static void main(String[] args){
        set("The pursuit of happiness",150);
        get();

    }

}
