class Reservation{
String guestName;
String roomtype;
int floorNumber;
double nightlyRate;

public Reservation(){
guestName="x";
roomtype="deluxe";
floorNumber=2;
nightlyRate=2000;
}

public Reservation(String t1,String t2,int t3,double t4){
this.guestName=t1;
this.roomtype=t2;
this.floorNumber=t3;
this.nightlyRate=t4;
}

public Reservation(Reservation tp){
this.guestName=tp.guestName;
this.roomtype=tp.roomtype;
this.floorNumber=tp.floorNumber;
this.nightlyRate=tp.nightlyRate;
}
void display(){
System.out.println("Guest Name :"+guestName);
System.out.println("Room Type : "+roomtype);
System.out.println("Floor Number : "+floorNumber);
System.out.println("Nightly Rate : "+nightlyRate);
}
}
public class C1{
public static void main(String[] args){
Reservation R=new Reservation();
Reservation V=new Reservation("a","b",1,2.223);
Reservation F=new Reservation(V);
R.display();
V.display();
F.display();

}}