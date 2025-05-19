package examples.student_management;

public class Student {
    String name;
    String grade;
    int rollNum;

    public Student(String newName, String newGrade, int newRollNum){
        this.name = newName;
        this.grade = newGrade;
        this.rollNum = newRollNum;
    }

    public void reaData(){
        System.out.println("Name : "+name+" Grade : "+grade+" Roll No "+ rollNum);
    }

    public static void main(String[] args){
        Student obj1 = new Student("Vinoth", "8th", 5);
        obj1.reaData();

    }
}
