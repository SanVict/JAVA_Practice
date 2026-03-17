import java.util.Scanner;

public class reverse_the_number {
    public static void main(String[] Sanjay){
       Scanner sc=new Scanner(System.in); 
       int n=sc.nextInt();
       int sum=0;
       while(n!=0){
        int d=n%10;
        sum=(sum*10)+d;
        n/=10;
       }
       System.out.println(sum);
    }
}
