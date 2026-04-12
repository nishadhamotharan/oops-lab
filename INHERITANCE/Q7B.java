import java.util.Scanner;
class Room{
  int getRate(int a){
    return 0;
  }
}
class Deluxe extends Room{
  @Override
  int getRate(int a){
    return 4000+a;
  }
}
class Standard extends Room{
  @Override
  int getRate(int a){
    return 3000 +a;
  }
}
public class Q7B{
  public static void main(String[] args){
    int[] r = new int[4];
    r[0]=100;
    r[1]=200;
    r[2]=300;
    r[3]=400;
    Scanner sc = new Scanner(System.in);
    Deluxe d = new Deluxe();
    Standard s = new Standard();
    System.out.println("choose the option \n standard room : 0 \n deluxe room : 1");
    int a = sc.nextInt();
    System.out.println("choose the option \n single room : 0 \n double room :1 \n single room with ac : 2 \n double room with ac : 3 \n");
    int n = sc.nextInt();
    int y;
    switch (n){
      case 0 :
       if(a==0){
        y=s.getRate(r[0]);
        System.out.println("the rate is  for standard for single bedroom  is : "+ y);
       }
       else if (a==1) {
        y=d.getRate(r[0]);
        System.out.println("the rate is  for deluxe for single bedroom  is : "+ y);
       }
       break;
      case 1:
      if(a==0){
        y=s.getRate(r[1]);
        System.out.println("the rate is  for standard for double bedroom  is : "+ y);
      }
      else if(a==1){
        y=d.getRate(r[1]);
        System.out.println("the rate is  for deluxe for double bedroom  is : "+ y);
      }
      break;
      case 2:
        if(a==0){
          y=s.getRate(r[2]);
          System.out.println("the rate is  for single for single bedroom with ac is : "+ y);
        }
        else if(a==1){
          y=d.getRate(r[2]);
          System.out.println("the rate is  for deluxe for single bedroom with ac is : "+ y);
        }
        break;
      case 3:
        if(a==0){
          y=s.getRate(r[3]);
          System.out.println("the rate is  for standard for double bedroom with ac is : "+ y);
        }
        else if(a==1){
          y=d.getRate(r[3]);
          System.out.println("the rate is  for deluxe for double bedroom with ac is : "+ y);
        }
        break;
    }
    
    sc.close();
    
  }
}