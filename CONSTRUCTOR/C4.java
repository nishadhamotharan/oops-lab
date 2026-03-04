import java.util.Scanner;
class Order{
String Item;
int Quantity;
String Address;
String Instruction;

public Order(){
Item="Veg Combo";
Quantity=1;
Address="To be updated";
Instruction="None";
}
public Order(String q1,int q2){
this.Item=q1;
this.Quantity=q2;
Address="Home Address on File";
Instruction="None";
}
public Order(String q1,int q2,String q3,String q4){
this.Item=q1;
this.Quantity=q2;
this.Address=q3;
this.Instruction=q4;
}

void display(){
System.out.println("Item : "+Item);
System.out.println("Quantity : "+Quantity);
System.out.println("Address : "+Address);
System.out.println("Instruction : "+Instruction);
System.out.println("-------------------");
}
}
public class P30{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Order o1=new Order();
Order o2=new Order("pizza",2);
Order o3=new Order("pizza",2,"College Hostel","Less Spicy");

o1.display();
o2.display();
o3.display();
sc.close();
} 
}