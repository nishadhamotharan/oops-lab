class Vehicle{
    int speed;
    public Vehicle(int speed){
        this.speed=speed;
    }
    void display(){
        System.out.println("Speed :");
    }
}
class Bike extends Vehicle{
    int engine_capacity;
    public Bike(int speed,int engine_capacity){
        super(speed);
        this.engine_capacity=engine_capacity;
    }
    void display(){
        System.out.println("Speed :"+speed+"km/h");
        System.out.println("Engine Capacity :"+engine_capacity+"cc");
    }
}
public class Q7 {
    public static void main(String[] args){
        Bike B=new Bike(120,150);
        B.display();
    }
}
