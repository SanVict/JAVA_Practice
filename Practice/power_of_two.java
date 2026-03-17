import java.util.Scanner;

public class power_of_two {
     public static void main(String[] Sanjay){
       Scanner sc=new Scanner(System.in); 
       int n=sc.nextInt();int flag=0;
    //    if((n&(n-1))==0) System.out.println("Power of two");   <--- optimized 
    //    else System.out.println("Not the power of two");       <--- optimized
    while(n%2==0){
        n=n/2;
        if(n==1){flag=1;break;}
    }
    if(flag==1){System.out.println("Power of two");}
    else {System.out.println("Not power of two");}
}
}
