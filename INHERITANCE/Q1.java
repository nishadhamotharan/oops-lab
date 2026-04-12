import java.util.Scanner;
class Bank_Transaction{
    double balance=0;
    void deposit(double amount){
        balance=balance+amount;
        System.out.println("Cash deposit:"+amount+"successful");
        System.out.println("updated balance:"+balance);
    }
    void deposit(double amount,String chequeNumber){
        balance=balance+amount;
        System.out.println("Cheque Deposit: "+amount+"Successful");
        System.out.println("Cheque Number: "+chequeNumber);
        System.out.println("Updated Balance :"+balance);
    }
    void deposit(double amount,String TransactionID,String Mode){
        balance=balance+amount;
        System.out.println("Online Transfer: "+amount+"Successful");
        System.out.println("Transaction ID: "+TransactionID);
        System.out.println("Mode of transfer: "+Mode);
        System.out.println("Updated Balance:"+balance);
    }
}
public class Q1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Bank_Transaction bt=new Bank_Transaction();
        int choice;
 
        do{
            System.out.println("BANK TRANSACTION");
            System.out.println("1.Cash Deposit");
            System.out.println("2.Cheque Deposit");
            System.out.println("Online Transfer");
            System.out.println("4.Exit");
            choice=sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter Amount :");
                    double cash=sc.nextDouble();
                    bt.deposit(cash);
                    break;
                case 2:
                    System.out.print("Enter Amount :");
                    double chequeAmt=sc.nextDouble();
                    System.out.print("Enter cheque number: ");
                    String chequeNo=sc.nextLine();
                    bt.deposit(chequeAmt,chequeNo);
                    break;
                case 3:
                    System.out.print("Enter Amount :");
                    double onlineAmt=sc.nextDouble();
                    System.out.print("Enter transaction ID :");
                    String TransactionID=sc.nextLine();
                    System.out.print("Enter Mode (UPI/NEFT/IMPS)");
                    String mode=sc.nextLine();
                    bt.deposit(onlineAmt,TransactionID,mode);
                    break;
                case 4:
                    System.out.print("Thank you");
                    break;
            }
        }while(choice!=4);
        sc.close();
    }
}