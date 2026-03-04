import java.util.Scanner;
public class J4
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the first number :");
int a=sc.nextInt();
System.out.print("Enter the second number : ");
int b=sc.nextInt();
if (a>b)
System.out.println(a + " is the largest number");
else
System.out.println(b + " is the largest number");
}
}