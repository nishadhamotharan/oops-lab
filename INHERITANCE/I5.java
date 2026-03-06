import java.util.Scanner;
class Employee{
    int empId;
    String Name;
    double basicSalary;
    public Employee(int E1,String E2,double E3){
        this.empId=E1;
        this.Name=E2;
        this.basicSalary=E3;
    }
    void displayEmployee(){
      System.out.println("Employee ID : "+empId);
      System.out.println("Name : "+Name);
      System.out.println("Basic Salary : "+basicSalary);
    }
}
class Manager extends Employee{
    double Bonus;
    public Manager(int E1,String E2,double E3,double E4){
    super(E1,E2,E3);
    this.Bonus=E4;
    }
   void displayManager(){
    super.displayEmployee();
    System.out.println("Bonus Salary : "+Bonus);
   }
   void calculateSalary(double totalSalary){
    super.displayEmployee();
    totalSalary=Bonus+basicSalary;
    System.out.println("Total Salary : "+totalSalary);
   }
  
}
public class I5 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Employee ID :");
    int Emp_ID=sc.nextInt();
    sc.nextLine();
    System.out.print("Enter the Name : ");
    String Name=sc.nextLine();
    System.out.print("Enter the Basic Salary : ");
    double Basic_Salary=sc.nextDouble();
    Employee E=new Employee(Emp_ID,Name,Basic_Salary);
    E.displayEmployee();
    System.out.print("Enter Bonus Salary :" );
    double Bonus=sc.nextDouble();
    Manager M=new Manager(Emp_ID,Name,Basic_Salary,Bonus);
    M.displayManager();
   
    sc.close();
    }
}
