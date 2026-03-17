import java.util.Scanner;

public class LCM {
    
    public static void main(String[] Sanjay){
       Scanner sc=new Scanner(System.in);
       int out=0; 
       int a=sc.nextInt();int A=a;
       int b=sc.nextInt();int B=b;
      while(a>0 && b>0){
        if(a>b) a=a%b;
        else b=b%a;
       }if(a==0)
       out=b;
      else 
          out =a;
    System.out.println("LCM :"+(A*B)/out);
    }
    
}
