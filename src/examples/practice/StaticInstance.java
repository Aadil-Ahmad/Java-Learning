package examples.practice;

public class StaticInstance {
    static int staticValue = 0;
    int instanceValue = 0;

    void incrementCount(){
        staticValue ++;
        instanceValue ++;
    }
    static String collegeName ="Vyas College";
    String studentName ;
    StaticInstance(String newName){
        this.studentName = newName;
    }

    void displayIncrement(){
        System.out.println(staticValue);
        System.out.println(instanceValue);
        System.out.println(studentName +" is studying at : "+collegeName);
    }
    public static void main(String[] args){
        StaticInstance obj1 = new StaticInstance("Vinoth");
        StaticInstance obj2 = new StaticInstance("Hyder");
        obj1.incrementCount();
        obj1.displayIncrement();


        obj2.incrementCount();
        obj2.displayIncrement();
    }


}
