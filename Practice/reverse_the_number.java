import java.util.Scanner;

public class reverse_the_number {
    public static void main(String[] Sanjay){
       Scanner sc=new Scanner(System.in); 
       int n=sc.nextInt();
       int sum=0;
       while(n!=0){        // use n !=0 for both -ve and +ve test case will satisfy
        int d=n%10;        // Using string also we can done it 
        sum=(sum*10)+d;
        n/=10;
       }
       System.out.println(sum);
    }
}
