public class VariablesExample {
    String name;
    int age;

    public VariablesExample(String n, int a){
        this.name = n;
        this.age = a;
    }
    public String getName(){
        return name;
    }
  public int getAge(){
        return age;
  }
    public void changeName(String newName){
        this.name = newName;
    }

    public void printData(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }

    public void display(){
        this.show();
        System.out.println("Inside display function");
    }
    public void show(){
        System.out.println("Inside show function");
        System.out.println("Inside Show: "+this.name);
    }

    public static void main(String[] args){
        VariablesExample obj = new VariablesExample("Raj", 33);
        VariablesExample obj1 = new VariablesExample("Kamal", 32);

        obj.printData();
        obj1.printData();
        obj.changeName("Hyder");
        System.out.println("The updated name is : "+ obj.getName());
        System.out.println("The second person name is : "+obj1.getName());
        System.out.println("The first person age is : "+ obj.getAge()+" and the second person age is : "+obj1.getAge());

        obj.display();
        obj1.display();
    }
}
