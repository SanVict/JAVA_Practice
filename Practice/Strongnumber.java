import java.util.Scanner;

public class Strongnumber {
 
       public static void main(String[] Sanjay){
       Scanner sc=new Scanner(System.in); 
       int n=sc.nextInt();
       int temp=n;
       int sum=0;
       while(n>0){
        int d=n%10;
         sum=sum+fact(d);
         n/=10;
       }  
       if(sum==temp){System.out.println("Strong_Number");}
       else 
        System.out.println("Not an Strong Number");
                                  
}
static int fact(int n){
    if(n==0) return 1;
    return n*fact(n-1);
}
}


