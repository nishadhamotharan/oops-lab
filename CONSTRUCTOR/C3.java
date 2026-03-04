import java.util.Scanner;
class SmartDevice{
String deviceName;
String status;
String firmwareVersion;
public SmartDevice(){
deviceName="x";
status="y";
firmwareVersion="z";
}
public SmartDevice(String t1,String t2){
this.deviceName=t1;
this.status=t2;
}
public SmartDevice(String t1,String t2,String t3){
this.deviceName=t1;
this.status=t2;
this.firmwareVersion=t3;
}
void display(){
System.out.println("Device Name : "+ deviceName);
System.out.println("Status : "+status);
System.out.println("Firmware Version : "+firmwareVersion);
}
}
public class P28{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.print("Enter the device name :");
String deviceName=sc.nextLine();
System.out.print("Enter the status : ");
String status=sc.nextLine();
System.out.print("Enter the firmware Version : ");
String firmwareVersion=sc.nextLine();

SmartDevice S=new SmartDevice();
SmartDevice V=new SmartDevice(deviceName,firmwareVersion);
SmartDevice N=new SmartDevice(deviceName,status,firmwareVersion);

S.display();
V.display();
N.display();
sc.close();
}
}