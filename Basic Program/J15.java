import java.util.Scanner;
public class J15
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter username : ");
String user=sc.nextLine();
System.out.print("Enter Password : ");
String password=sc.nextLine();

if(user.equals("admin")&&password.equals("admin@123"))
System.out.println("Login Success");
else
System.out.println("Login Failed");
}
}