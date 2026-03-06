import java.util.Scanner;
public class J17 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int number;
int sum = 0;
System.out.println("Enter numbers (Enter 0 to stop : ");
number = sc.nextInt();
while (number != 0) 
{
 sum = sum + number;
 number = sc.nextInt();
 }
 System.out.println("Sum of entered numbers: " + sum);
 sc.close();
}
}
