class BankAccount{
    private int accountNumber;
    private String accountHolder;
    private double balance;
public BankAccount(int accNo,String name,double Balance){
    this.accountNumber=accNo;
    this.accountHolder=name;
    this.balance=Balance;
}
public void deposit(double amount){
    if(amount>0){
        balance=balance+amount;
        System.out.println("Deposit :"+amount);
    }
    else{
        System.out.println("Invalid deposit amount");
    }
}
public void withdraw(double amount){
    if(amount<=0){
        System.out.println("Invalid withdrawal amount");
    }
    else if(amount>balance){
        System.out.println("Insufficient Balance");
    }
    else{
        System.out.println("Balance"+balance);
    }
}
public void checkBalance(){
    System.out.println("Current Balance :"+balance);
}
public int getAccountNumber(){
    return accountNumber;
}
public String getAccountHolder(){
    return accountHolder;
}
}
public class Q15 {
    public static void main(String[] args){
        BankAccount B=new BankAccount(1,"Nisha",5000);
        System.out.println("Account Holder:"+B.getAccountHolder());
        B.deposit(2000);
        B.checkBalance();
        B.withdraw(1500);
        B.checkBalance();

    }
    
}
