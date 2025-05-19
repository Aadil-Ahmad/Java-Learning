package examples.practice.problems;

public class Swap {
    public static void main(String[] args) {
        int a = 10, b = 12, c;
        System.out.println("a = "+a+". b = "+b);
        c = a;
        a = b;
        b = c;
        System.out.println("a = "+a+". b = "+b);

        int num1 = 2, num2 = 4;
        System.out.println("num1 = "+num1+". num2 = "+num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("num1 = "+num1+". num2 = "+num2);


    }
}
