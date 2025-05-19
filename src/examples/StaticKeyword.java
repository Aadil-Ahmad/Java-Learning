package examples;

public class StaticKeyword {
//  STATIC VARIABLES
    static int num1 = 20;
    static int num2;


//  STATIC METHOD
    public static void display(){
        System.out.println("The number value is : " +num1);
    }
//      STATIC METHOD
    public static void display(int num3){

        System.out.println("Overloading:"+ num3);
    }
//    STATIC BLOCK
    static {
        System.out.println("Static block initialized");
        num2 = num1+5;
    }

//    When to use static variables and methods?
    String name;
    int rollNo;
    static int counter = 0;
    static String colgNane;

    public StaticKeyword(String n){
        this.name = n;
        this.rollNo = setRollNum();
    }
    static int setRollNum(){
        counter++;
        return counter;
    }
    static String setClogName(String cName){
        return colgNane = cName;
    }

    public void printData(){
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+rollNo);
        System.out.println("College name: "+colgNane);
    }
    public static void main(String[] args){
        display();
        display(6);
        System.out.println("The value if num2 = " +num2);



        StaticKeyword.colgNane ="XYZ";
        StaticKeyword obj = new StaticKeyword("kamal" );
        StaticKeyword obj1 = new StaticKeyword("Hyder");
        obj.printData();
        obj1.printData();

    }
}
