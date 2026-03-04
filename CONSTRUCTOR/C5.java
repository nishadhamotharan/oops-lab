class Hospital{
int ID;
String Name;
int Age;
String Ward;
String Notes;


public Hospital(){
ID=1001;
Name="Unknown";
Age=0;
Ward="Emergency";
Notes="None";
}

public Hospital(int h1,String h2,int h3){
this.ID=h1;
this.Name=h2;
this.Age=h3;
Ward="OPD";
Notes="Fever";
}

public Hospital(int h1,String h2,int h3,String h4){
this.ID=h1;
this.Name=h2;
this.Age=h3;
this.Ward=h4;
Notes="BP High";
}

void display(){
System.out.print("ID :"+ID);
System.out.print("Name : "+Name);
System.out.print("Age : "+Age);
System.out.print("Ward : "+Ward);
System.out.print("Notes : "+Notes);
System.out.println("");
}
}
public class P31{
public static void main(String[] args){

Hospital p1=new Hospital();
Hospital p2=new Hospital(1002,"Kumar",35);
Hospital p3=new Hospital(1004,"Ravi",40,"Camp");

p1.display();
p2.display();
p3.display();
}
}