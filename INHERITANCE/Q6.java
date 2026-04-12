import java.util.Scanner;
class computer{
    String Processor;
    int Ram;
    public computer(String P,int R){
        this.Processor=P;
        this.Ram=R;
    }
    public void showconfiguration(){
        System.out.println("Processor :"+Processor);
        System.out.println("Ram :"+Ram+"GB");
    }
}
class Laptop extends computer{
    int Battery;
    public Laptop(String P,int R,int B){
        super(P,R);
        this.Battery=B;
    }
    @Override
    public void showconfiguration(){
        super.showconfiguration();
        System.out.println("Battery :"+Battery+"hours");
    }
}
public class Q6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of processor :");
        String Processor=sc.nextLine();
        System.out.println("Enter the RAM :");
        int Ram=sc.nextInt();
        System.out.println("Enter Battery Life :");
        int Battery=sc.nextInt();

        Laptop L=new Laptop(Processor,Ram,Battery);
        L.showconfiguration();
        sc.close();
    }
}
