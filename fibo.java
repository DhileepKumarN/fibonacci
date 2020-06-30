import java.util.Scanner;
class Fibonacci
 {
   public static void main(String args[])
   {
     int a=0,b=1,c;
     System.out.print(a+","+b);
    // Scanner a= new Scanner(System.in);
    // num=a.nextInt();
     for(int i=1;i<=10;i++)
     {
       c=a+b;
       System.out.print(","+c);
       a=b;
       b=c;
     }
   }
 }
