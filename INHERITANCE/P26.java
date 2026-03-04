import java.util.Scanner;
class Vehicle{
String brand;
String model;
int Rental_Price;
public Vehicle(String a,String b,int c){
this.brand=a;
this.model=b;
this.Rental_Price=c;
}

void display_Info(){
System.out.println("BRAND : "+brand);
System.out.println("MODEL : "+model);
System.out.println("RENTAL PRICE : "+Rental_Price);
}}
class Car extends Vehicle{
String Fuel_type;
public Car(String a,String b,int c,String d){
super(a,b,c);
this.Fuel_type=d;
}
void display_Info(){
super.display_Info();
System.out.print("FUEL TYPE :"+Fuel_type);

}}
class Bike extends Vehicle{
int Engine_Capacity;
public Bike(String a,String b,int c,int d){
super(a,b,c);
this.Engine_Capacity=d; 	
}
void display_Info(){
super.display_Info();
System.out.print("ENGINE CAPACITY :"+Engine_Capacity);
}}
public class P26{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("CHOOSE CAR OR BIKE");
String v=sc.nextLine();

System.out.print("brand :");
String brand=sc.nextLine();
System.out.print("model :");
String model=sc.nextLine();
System.out.print("rental price :");
int price=sc.nextInt();
if (v.equals("Car"))
{
System.out.print("fuel_type :");
sc.nextLine();
String ft=sc.nextLine();
Car car=new Car(brand,model,price,ft);
car.display_Info();
}
else{
System.out.print("engine capacity :");
int et=sc.nextInt();
Bike bike=new Bike(brand,model,price,et);
bike.display_Info();
}
sc.close();
}

}