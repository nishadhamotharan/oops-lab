import java.util.Scanner;
class Employee{
void calculateSalary(Scanner sc){
    System.out.println("Enter Salary");
    }
}

class FullTimeEmployee extends Employee{
    @Override
    void calculateSalary(Scanner sc){
       
        System.out.print("Enter Monthly Salary : ");
        double Salary=sc.nextDouble();
        System.out.println("Full time : "+Salary);
       
    }
}
class partTimeEmployee extends Employee{
    @Override
    void calculateSalary(Scanner sc){
        System.out.println("Enter Hours worked : ");
        int hours=sc.nextInt();
        System.out.println("Enter rate per hour : ");
        int rate=sc.nextInt();
        double Salary=hours*rate;
        System.out.println("Part Time Salary :"+Salary);
    }
}
class ContractEmployee extends Employee{
    @Override
    void calculateSalary(Scanner sc){
        System.out.println("How days of contract : ");
        int days=sc.nextInt();
        System.out.println("Enter rate per hour : ");
        int rate=sc.nextInt();
        double Salary=days*rate;
        System.out.println("Contract Salary"+Salary);
    }
}
public class Q3B{
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        FullTimeEmployee F=new FullTimeEmployee();
        partTimeEmployee P=new partTimeEmployee();
        ContractEmployee C=new ContractEmployee(); 
        
        F.calculateSalary(sc);
        P.calculateSalary(sc);
        C.calculateSalary(sc);
        sc.close();
    }
}