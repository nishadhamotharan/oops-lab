abstract class Vehicle{
    abstract void start();
    abstract void fuelType();
}
class Car{
    String CarBrand;
    String FuelType;
    public Car(String CarBrand,String FuelType){
        this.CarBrand=CarBrand;
        this.FuelType=FuelType;
    }
    void start(){
        System.out.println("Car Brand : ");
    }
    void FuelType(){
        System.out.println("Fuel Type");
    }
}
class ElectricBike{
    String Brand;
    String FuelType;
    public ElectricBike(String Brand,String FuelType){
        this.Brand=Brand;
        this.FuelType=FuelType;
    }
    void start(){
        System.out.println("Car Brand : ");
    }
    void FuelType(){
        System.out.println("Fuel Type");
    }
}
public class Q16 {
   public static void main(String[] args){
    Car C=new Car(Audi,Diesel);
    C.start();
    C.FuelType();
    ElectricBike E=new ElectricBike(E,Petrol);
    E.start();
    E.FuelType();
   }
}
