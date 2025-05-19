package examples.practice;

public class BankAccount {
    String accountHolderName;
    String accountNumber;
    double balance;

    public BankAccount(String newAccount, String newNum, double bal){
        this.accountHolderName = newAccount;
        this.accountNumber = newNum;
        this.balance = bal;
    }

    private void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Your A/C "+ accountNumber+" is credited with INR "+amount+" New Bal INR "+ balance);
        }else {
            System.out.println("Invalid");
        }
    }

    private void withdraw(double amount){
        if (amount <= balance){
            balance -= amount;
            System.out.println("Your A/C "+ accountNumber+" is debited with INR "+amount+" New Bal INR "+ balance);
        }else {
            System.out.println("Invalid");
        }
    }

    private void displayAccount(){
        System.out.println("Account Holder Name : "+ accountHolderName);
        System.out.println("Account Number : "+ accountNumber);
        System.out.println("Balance : "+ balance);
    }

    public static void main(String[] args){
        BankAccount account = new BankAccount("130249800627","Raj Kamal",85000);
        account.displayAccount();
        account.withdraw(2000);
        account.deposit(8000);
        account.withdraw(1500);
        account.deposit(1000);
    }
}




















