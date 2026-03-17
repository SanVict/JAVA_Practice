import java.util.Scanner;

public class Harshadnumber {
    public static void main(String[] Sanjay){
       Scanner sc=new Scanner(System.in); 
       int n=sc.nextInt();
       int temp=n;
       int sum=0;
       while(n>0){
        int d=n%10;
         sum=sum+d;
         n/=10;
       }  
       if(temp%sum==0){System.out.println("Harshadnumber");}
       else 
        System.out.println("Not an Harshadnumber");                  
 }
}

