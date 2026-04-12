import java.util.Scanner;
class Employee{
    String Name;
    int Salary;
    public Employee(String Name,int Salary){
        this.Name=Name;
        this.Salary=Salary;
    }
    void display(){
        System.out.println("Name of Employee :"+Name);
        System.out.println("Salary of Employee :"+Salary);
    }
}
class Manager extends Employee{
    int teamSize;
    public Manager(String Name,int Salary,int TeamSize){
        super(Name,Salary);
        this.teamSize=TeamSize;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Team Size :"+teamSize);
    }

}
class ProjectManager extends Manager{
    String ProjectName;
    public ProjectManager(String Name,int Salary,int TeamSize,String ProjectName){
        super(Name,Salary,TeamSize);
        this.ProjectName=ProjectName;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Project Name :"+ProjectName);
    }
}
public class Q9B {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name of Employee :");
        String Name=sc.nextLine();
        System.out.println("Enter Salary of Employee :");
        int Salary=sc.nextInt();
        System.out.println("Enter team size :");
        int TeamSize=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Project Name :");
         String ProjectName=sc.nextLine();
        Manager M=new Manager(Name,Salary,TeamSize);
        M.display();
        ProjectManager P=new ProjectManager(Name,Salary,TeamSize,ProjectName);
        P.display();
        sc.close();
    }
}