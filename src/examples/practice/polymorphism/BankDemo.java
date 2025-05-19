package examples.practice.polymorphism;

class Bank{
    public double getInterestRate(){
        return 0.0;
    }
}

class HDFC extends Bank{
    public double getInterestRate(){
        return 0.5;
    }
}

class Axis extends Bank{
    public double getInterestRate(){
        return 01.0;
    }
}
class JKBank extends Bank{
    public double getInterestRate(){
        return 1.5;
    }
}

public class BankDemo {
    public static void main(String[] args){
        Bank b1 = new HDFC();
        Bank b2 = new Axis();
        Bank b3 = new JKBank();
        System.out.println("HDFC interest rate: "+b1.getInterestRate());
        System.out.println("Axis interest rate: "+b2.getInterestRate());
        System.out.println("J&K Bank interest rate: "+b3.getInterestRate());

    }
}
