class Shape{
    void calculateArea(){
        System.out.println("Calculate Area");
    }
}
class Circle extends Shape{
    double radius;
    Circle(double r){
        radius=r;
    }
    @Override
    void calculateArea(){
        double area=Math.PI*radius*radius;
        System.out.println("Area of Circle:"+area);
    }
}
class Rectangle extends Shape{
    double length,width;
    Rectangle(double l,double w){
        length=l;
        width=w;
    }
    @Override
    void calculateArea(){
        double area=length*width;
        System.out.println("Area of Rectangle:"+area);
    }
}
class Triangle extends Shape{
    double base,height;
    Triangle(double b,double h){
        base=b;
        height=h;
    }
    @Override
    void calculateArea(){
        double area=0.5*base*height;
        System.out.println("Area of Triangle:"+area);
    }
}
public class Q2B {
    public static void main(String[] args){
        Shape s;
        s=new Circle(5);
        s.calculateArea();
        s=new Rectangle(4,6);
        s.calculateArea();
        s=new Triangle(3,3);
        s.calculateArea();
    }
}
