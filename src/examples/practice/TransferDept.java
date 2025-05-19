package examples.practice;

import java.util.Scanner;

public class TransferDept {
    String name;
    String empId;
    String department;

    public TransferDept(String name, String empId, String department){
        this.name = name;
        this.empId = empId;
        this.department = department;
    }

    public String getName(){
        return  name;
    }
    public String getEmpId(){
        return empId;
    }
    public String getDepartment(){
        return department;
    }

    public void transferDepartment(String newDepartment){
        if (newDepartment!= null && newDepartment.equalsIgnoreCase(department)){
            displayInfo(false);
        }else {
            department = newDepartment;
            displayInfo(true);
        }
    }
    public void displayInfo(boolean transferred){
        if (transferred){
            System.out.println("The department has been transferred");
        }
        else {
            System.out.println("The department has not been transferred");
        }
        System.out.println("Employee name: " + name +", Employee ID: " + empId + ", Employee Department: " + department);
    }
    public static void main(String[] args){
        TransferDept td = new TransferDept("studio","1008","IT");
        System.out.println("Enter the department : ");
        Scanner scanner = new Scanner(System.in);
        String newDept = scanner.nextLine();

        td.transferDepartment(newDept);
    }
}
