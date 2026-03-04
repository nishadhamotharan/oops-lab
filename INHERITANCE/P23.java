class N{
void Add(int x,int y){
int add=x+y;
System.out.println(add);
}
}


class V extends N{


void Add(int x,int y){
int add=x*y;
System.out.println(add);
}


void info(){
System.out.println("Hello world!"); 
int a =9;
int b =2;
super.Add(a,b);
Add(a,b);
}
}

public class P23{
public static void main(String[] args){
V ob=new V();
ob.Add(2,3);
ob.info();
}
}