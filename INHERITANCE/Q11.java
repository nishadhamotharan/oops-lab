import java.util.Scanner;
class person{
    String Name;
    int age;
    public person(String Name,int age){
        this.Name=Name;
        this.age=age;
    }
    void display(){
        System.out.println("Name of the Doctor :"+Name);
        System.out.println("Age of the Doctor :"+age);
    }
}
class Doctor extends person{
    String Specialization;
    public Doctor(String Name,int age,String specialization){
        super(Name,age);
        this.Specialization=specialization;
    }
    void display(){
        super.display();
        System.out.println("Specialization :"+Specialization);
    }
}
public class Q11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Name of Doctor :");
        String Name=sc.nextLine();
        System.out.println("Enter Age of Doctor :");
        int Age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Specialization :");
        String Specialization=sc.nextLine();
        
        Doctor D=new Doctor(Name,Age,Specialization);
        D.display();

        sc.close();
    }
}
