import java.util.Scanner;

public class Armstrong {
       public static void main(String[] Sanjay){
       Scanner sc=new Scanner(System.in); 
       int n=sc.nextInt();
       int ans=0;
       int temp=n;
       int count=(int)Math.floor(Math.log10(n)+1);
       while(n>0){
        int d=n%10;
        ans=(int)(ans+Math.pow(d,count));
        n=n/10;
       }
     if(ans==temp){System.out.println("Armstrong Number");}
    else 
            System.out.println("Not an Armstrong");
     }
}

