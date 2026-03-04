import java.util.Scanner;
public class J13{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Table-");
int n=sc.nextInt();
for (int i=1;i<=10;i++)
System.out.println(n+"x"+i+"="+(n*i));
}
}