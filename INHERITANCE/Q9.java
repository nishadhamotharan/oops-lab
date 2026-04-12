import java.util.Scanner;
public class Q9 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of students");
    int  k=sc.nextInt();
    int[] n = new int[k];
    int tot=0;
    for(int i=0;i<k;i++){
        System.out.println("enter mark of student " + (i+1) );      
        n[i]=sc.nextInt();
        tot+=n[i];
    }
    System.out.println(tot);
    int indx=0;
    int max=n[0];
    for(int j=0;j<k;j++){
        if(n[j]>max){
            max=n[j];
            indx=j;
        }
         
  }
  System.out.println("top performer is " + (indx+1) + " and the mark is "+ max);
  sc.close();
}
}