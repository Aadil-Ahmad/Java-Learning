package examples.practice.inheritance;

class EngineerS{
    int engineers;
    public void engineerS(int newValue){
        engineers = newValue;
        System.out.println(engineers);
    }
}
class EngineerI extends EngineerS{
    int engineerI;
    public void engineerI(int newValue){
        engineerI = newValue;
        System.out.println(engineerI);
    }
}
public class Employee {
    public static void main(String[] args){
        EngineerI s1 = new EngineerI();

        s1.engineerS(60000);
        s1.engineerI(1000);

    }
}
