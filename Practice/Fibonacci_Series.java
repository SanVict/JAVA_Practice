import java.util.Scanner;

public class Fibonacci_Series {
     public static void main(String[] Sanjay){   
       Scanner sc=new Scanner(System.in); 
       int n=sc.nextInt();
       int a=0;int b=1;
       System.out.println("Fibonacci Series");
       System.out.println(a+"\n"+b);
       for(int i=1;i<=n-2;i++){
        int c=a+b;
        System.out.println(c);
        a=b;
        b=c;
       }
     }
    }
