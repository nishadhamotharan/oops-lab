class BankAccount{
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int AccNo,String AccHolder,double bal){
        accountNumber=AccNo;
        accountHolder=AccHolder;
        balance=bal;
    }
    public void showdetails(){
        System.out.println("Account Number :"+accountNumber);
        System.out.println("Account Holder :"+accountHolder);
    }
    public void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("Deposited :"+amount);
        }
        else{
            System.out.println("Invalid Deposit amount");
        }
    }
    public void withdraw(double amount){
       
        if(amount<=0){
            System.out.println("Invalid Withdrawal Amount");
        }
        else if(amount>balance){
            System.out.println("Insufficient balance");
        }
        else{
            balance=balance-amount;
            System.out.println("Withdrawal Amount :"+amount);
        }
    }
public void checkbalance(){
    System.out.println("Balance:"+balance);
}  
}
public class Q5 {
    public static void main(String[] args){
        BankAccount acc=new BankAccount(50000,"Nisha",1000);
        acc.deposit(2000);
        acc.withdraw(100000);
        acc.checkbalance();

    }
}
