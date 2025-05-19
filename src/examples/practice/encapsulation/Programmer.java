package examples.practice.encapsulation;

 public class Programmer {

  private String name;
  private long accountNo;
  private String branchName;
  private float amount;
  private int number;

  public String getName(){
      return name;
  }

  public void setName(String newName){
      name = newName;
  }
  public long getAccountNo(){
      return accountNo;
  }
  public void setAccountNo(long newAccountNo){
      accountNo = newAccountNo;
  }

  public String getBranchName(){
      return branchName;
  }
  public void setBranchName(String newBranchName){
      branchName = newBranchName;
  }

  public float getAmount(){
      return amount;
  }
  public void setAmount(float newAmount){
      amount = newAmount;
  }

  public int getNumber (){
      return number;
  }
  public void setNumber(int newNumber){
      number = newNumber;
  }
}

 class Main{
    public static void main(String[] args){
        Programmer obj = new Programmer();
        obj.setName("Kamal");
        obj.setAccountNo(1892354096);
        obj.setBranchName("Agro High Tech");
        obj.setAmount(15463);
        obj.setNumber(5);
        System.out.println("Name "+obj.getName());
        System.out.println("Account No "+ obj.getAccountNo());
        System.out.println("Branch Name"+ obj.getBranchName());
        System.out.println("Amount "+ obj.getAmount());
        System.out.println("Number "+ obj.getNumber());
    }
}
