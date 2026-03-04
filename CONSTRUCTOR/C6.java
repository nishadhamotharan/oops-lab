class Company{

String Name;
int ID;
double Salary;
int Teamsize;
double Bonus;
String Project;
double Budget;

public Company(String c1,int c2,double c3,int c4,double c5,String c6,double c7)
{
this.Name=c1;
this.ID=c2;
this.Salary=c3;
this.Teamsize=c4;
this.Bonus=c5;
this.Project=c6;

this.Budget=c7;
}
void display(){
System.out.println("Name : "+Name);
System.out.println("ID : "+ID);
System.out.println("Salary : "+Salary);
System.out.println("Team size :"+Teamsize);
System.out.println("Bonus : "+Bonus);
System.out.println("Project : "+Project);
System.out.println("Budget : "+Budget);
}
}
public class P33{
public static void main(String[] args){

Company C=new Company("Rahul",201,90000.0,8,15000.0,"Bank App",500000.0);
C.display();
}
}