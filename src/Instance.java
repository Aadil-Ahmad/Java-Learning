public class Instance {
    public static void main(String[] args){
        Person obj1 = new Person();
        Person obj2 = new Boy();
        System.out.println("obj1 instanceof Person: " + (obj1 instanceof Person));
        System.out.println("obj1 instanceof Boy: " + (obj1 instanceof Boy));
        System.out.println("obj1 instanceof Human: " + (obj1 instanceof Human));
        System.out.println("obj2 instanceof Person: " + (obj2 instanceof Person));
        System.out.println("obj2 instanceof Boy: " + (obj2 instanceof Boy));
        System.out.println("obj2 instanceof Human: " + (obj2 instanceof Human));

        int a = 20, b = 10, c = 0;
        int d = 20, e = 40, f = 30;
        System.out.println("a<<1 : "+ (a << 1));
        System.out.println("a>>1 : "+ (a>>1));

        boolean x = true;
        boolean y = false;
        System.out.println("x&&y: "+ (x && y));
        System.out.println(" x \\ y");
        System.out.println("!x "+(!x));
        System.out.println("!y : "+(!y));

        System.out.println("a is greater than b:"+ (a>b));
        System.out.println("a is lesser than c:"+ (a<c));
        System.out.println("a is greater or equal to b:"+ (a>=b));
        System.out.println("a is less or equal to c:"+ (a <= c));
        System.out.println("a is not equal to  b:"+ (a != b));
        System.out.println("a is equal to b : "+(a == b));

        System.out.println("a+b/d : "+ (a+b/d));
        System.out.println("a+b*d-e/f : "+(float) (a+b*d-e/f));

    }

}
interface Human{}
class Person{}
class Boy extends Person implements Human{}


