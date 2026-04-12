import java.util.Scanner;
interface Movie_Streaming{
    void Stream(Movie M);
}
abstract class User{
    String Name;
    public User(String Name){
        this.Name=Name;
    }
}
abstract class Movie{
    String title,genre;
    public Movie(String title,String genre){
        this.title=title;
        this.genre=genre;
    }
}
abstract class subscription{
    String plan;
    double price;
    public subscription(String plan,double price){
        this.plan=plan;
        this.price=price;
    }
    void showDetails(){
        System.out.println("plan :"+plan +"| price :"+price);
    }
}


public class Q10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        sc.close();
    }
}
