import java.util.Scanner;
public class J14
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the marks : ");
int marks=sc.nextInt();
if(marks>=90)
System.out.print("A");
else if(marks>=75)
System.out.print("B");
else if(marks>=50) 
System.out.print("C");
else
System.out.print("Fail");
}
}