import java.util.Scanner;

public class sum_of_digitinrange {
   
    public static void main(String[] Sanjay){
       Scanner sc=new Scanner(System.in);
	     int a=sc.nextInt(); 
       int b=sc.nextInt();
       if(b>a){int t=a;a=b;b=t; }
       excludeboundary(a, b);
       includeboundary(a, b); 
 }
static int excludeboundary(int a,int b) {
      int out=(a*(a+1)/2) - (b*(b-1)/2);
      System.out.println("Boundary included sum:"+out);
      return 0;
     }
   static int includeboundary(int a,int b) {
        int out=((a*(a-1)/2) - (b*(b+1)/2));
      System.out.println("Boundary Excluded sum:"+out);
      return 0;
     }
    }

 
