import java.util.Scanner;
public class Q14 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter how many number you want to enter :");
    int N=sc.nextInt();
    int[] A=new int[N];
    
    for(int i=0;i>N;i++){
        System.out.println("Enter Number" + (i+1)+":");
        A[i]=sc.nextInt();
    }
    for(int i=0;i<N-1;i++){
       for(int j=0;j<N-i;j++){
        if(A[j]>A[j+1]){
            int temp=A[j];
            A[i]=A[j+1];
            A[j+1]=temp;
        }
       }
    }
        sc.close();
    }
    
    }
