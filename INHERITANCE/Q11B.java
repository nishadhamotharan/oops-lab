import java.util.Scanner;
class Q11B{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter how many numbers you want to enter :");
       int N=sc.nextInt();
       int[] A=new int[N];
       int sum=0;
       for (int i=0;i<N;i++){
        System.out.print("Enter Number :"+(i+1)+" ");
        A[i]=sc.nextInt();
        sum+=A[i];
       }
       System.out.println("Sum of all numbers :"+sum);
       sc.close();
    }
}