package examples.practice.innerclass;

public class NestedClass {

    class Inner{
        public void print(){
            System.out.println("Print inner class data");
            show();
        }
        private void show(){
            System.out.println("Show the private class");

        }
    }


}

class Main{
    public static void main(String[] args){
        NestedClass.Inner in = new NestedClass().new Inner();
        in.print();

    }
}