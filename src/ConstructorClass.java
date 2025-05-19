public class ConstructorClass {
    String name;
    int id;
    float height;
    ConstructorClass(){
        System.out.println("Constructor with no perimeters");
    }

    ConstructorClass(String n, int i){
        this.name = n;
        this.id = i;
        System.out.println("The Second Constructor contains the perimeters : "+name+id);
    }

    ConstructorClass(float h){
        this.height = h;
        System.out.println("The third constructor containing the height : " + height);
    }
    public static void main(String[] args){
        ConstructorClass obj1 = new ConstructorClass();

        ConstructorClass obj2 = new ConstructorClass("Hyder ", 32);

        ConstructorClass obj3 = new ConstructorClass(172.4f);
    }
}
