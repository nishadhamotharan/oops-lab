class shape{
    double length,breadth;
    public shape(double l,double b){
       this.length=l;
    this.breadth=b;
    }
}
class Rectangle extends shape{
    Rectangle(double l,double b){
    super(l,b);
}
void calculateArea(){
    double area=length*breadth;
    System.out.println("Area of Rectangle:"+area);
}
}
public class Q3 {
    public static void main(String[] args){
        Rectangle R=new Rectangle(5,4);
        R.calculateArea();
    }
}
