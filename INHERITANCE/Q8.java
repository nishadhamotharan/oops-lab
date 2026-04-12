import java.util.Scanner;
abstract class Employee{
    abstract void calculateSalary();
}
class Manager extends Employee{
    int days,hours;
    public Manager(int days,int hours){
        this.days=days;
        this.hours=hours;
    }
    void calculateSalary(){
    System.out.println("No. of days worked :"+days);
    System.out.println("No. of hours worked :"+hours);
    int salary=days*hours+50000;
    System.out.println("Manager Salary :"+salary);
}
}
class Developer extends Employee{
    int days,hours;
    public Developer(int days,int hours){
        this.days=days;
        this.hours=hours;
    }
    void calculateSalary(){
        System.out.println("No. of days worked :"+days);
        System.out.println("No. of hours worked :"+hours);
        int salary=days*hours+60000;
        System.out.println("Developer Salary :"+salary);
    }
}
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Manager M=new Manager(30,9);
        Developer D=new Developer(30,12);

        M.calculateSalary();
        D.calculateSalary();
        sc.close();
    }
}
