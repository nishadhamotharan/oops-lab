import java.util.Scanner;
public class J18 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter first number: ");
double num1 = sc.nextDouble();
System.out.print("Enter second number: ");
double num2 = sc.nextDouble();
System.out.println("Choose operation (+, -, *, /): ");
char operator = sc.next().charAt(0);
double result;
switch (operator) {
case '+':
result = num1 + num2;
System.out.println("Result: " + result);
break;
case '-':
result = num1 - num2;
System.out.println("Result: " + result);
break;
case '*':
result = num1 * num2;
System.out.println("Result: " + result);
break;
case '/':
if (num2 != 0)
System.out.println("Result: " + (num1 / num2));
else
System.out.println("Division by zero is not allowed");
break;
default:
System.out.println("Invalid operator");
}
sc.close();
}
}
