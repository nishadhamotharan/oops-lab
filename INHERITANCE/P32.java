class Animal{
String Name;
int Age;
String dietType;

public Animal(String a1,int a2,String a3){
this.Name=a1;
this.Age=a2;
this.dietType=a3;
}
void eat(){
System.out.print("Eat");
}
void sleep(){
System.out.print("Sleep");
}
void display(){
System.out.print("Name : "+Name);
System.out.print("Age : "+Age);
System.out.print("Diet Type : "+dietType);
}
}

class Mammal extends Animal{
String furColor;
public Mammal(String m1,int m2,String m3, String m4){
super(m1,m2,m3);
this.furColor=m4;
}
void run(){
System.out.println(Name +" is running");
}
void display(){
super.display();
System.out.println("Fur Colour : "+furColor);
}
}

class Bird extends Animal{
double wingspan;
public Bird(String b1,int b2,String b3,double b4){
super(b1,b2,b3);
this.wingspan=b4;
}
void fly(){
System.out.println(Name +" is flying");
}
void display(){
super.display();
System.out.println("Wing Span : "+wingspan);
}
}

class Reptile extends Animal{
boolean venomous;
public Reptile(String r1,int r2,String r3,boolean r4){
super(r1,r2,r3);
this.venomous=r4;
}
void crawl(){
System.out.println(Name +" is Crawling");
}
void display(){
super.display();
System.out.println("Venomous : "+venomous);
}
}

public class P32{
public static void main(String[] args){

Mammal M=new Mammal("Lion",5,"Carnivore","Yellow");
Bird B=new Bird("Eagle",2,"Carnivore",2.55);
Reptile R=new Reptile("Snake",2,"Carnivore",true);

M.display();
M.run();
B.display();
B.fly();
R.display();
R.crawl();

}
}


































































