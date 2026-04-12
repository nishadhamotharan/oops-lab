abstract class shape{
    abstract void area();
}
class Circle extends shape{
    double radius;
    Circle(double r){
        radius=r;
    }
@Override
void area(){
    double A=Math.PI*radius*radius;
    System.out.println("Area of Circle"+A);
    }
}

class Rectangle extends shape{
    double length,breadth;
    Rectangle(double l,double b){
        length=l;
        breadth=b;
    }
@Override
void area(){
    double A=length*breadth;
    System.out.println("Area of Rectangle"+A);
}    
}
public class Q6B{
    public static void main(String[] args){
        shape[] shapes=new shape[2];
        shapes[0]=new Circle(5);
        shapes[1]=new Rectangle(4,6);

        for(shape s:shapes){
            s.area();
        }
    }
}