package examples.practice;

import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;
        System.out.println("Enter the first number");
        num1 = scanner.nextDouble();
        System.out.println("Select the operator(+,-,*,/)");
        operator =scanner.next().charAt(0);
        System.out.println("Enter the second number");
        num2 = scanner.nextDouble();

        switch (operator){
            case '+':
                result = num1+num2;
                System.out.println(result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid operator");
        }
        scanner.close();
    }

}

 class BankingApp{
    String accountHolder, accountNumber;
    double balance;
    Scanner scanner = new Scanner(System.in);
    public BankingApp(String accountHolder, String accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void debited(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Your A/C is debited with INR "+amount+" Your new balance is INR "+balance);
        }
    }
    public void credited(double amount){
        if (amount <= balance){
            balance -= amount;
            System.out.println("Your A/C is credited with INR "+amount+" our new balance is INR "+balance);
        }
    }
//    public void setAccountHolder(){
//        System.out.println("Enter the amount");
//        balance = scanner.nextDouble();
//    }
    public void accountHolder(){
        System.out.println("Your banking application");
        System.out.println("Account Holder : "+accountHolder+" A/C Number : " +accountNumber+ "Total Balance : " + balance);
    }
    public static void main(String[] args){

        BankingApp obj = new BankingApp("Aadil", "210685421", 21506);
        obj.accountHolder();
        obj.credited(2000);
        obj.debited(3000);

    }
}
