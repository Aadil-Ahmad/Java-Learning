public class CloneMethod implements Cloneable{

    @Override
    public CloneMethod clone() {
        try {
            return (CloneMethod) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    String name = "ClonedMethod";
    public static void main(String[] args){
        CloneMethod obj1 = new CloneMethod();
        CloneMethod obj2 = obj1.clone();
        System.out.println(obj2.name);
    }
}