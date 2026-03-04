import java.util.Scanner;
public class J17{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int sum=0,n;
while(true){
n=sc.nextInt();
if (n=+0){
break;}
sum=sum+n;
}
System.out.print("SUM : "+sum);
}}