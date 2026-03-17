import java.util.Scanner;

public class Palindrome {    // if reverse of number and input is same then its true
     public static void main(String[] Sanjay){
       Scanner sc=new Scanner(System.in); 
       int n=sc.nextInt();
       int temp=n;
       int sum=0;
       while(n!=0){        // use n !=0 for both -ve and +ve test case will satisfy
        int d=n%10;        // Using string also we can done it 
        sum=(sum*10)+d;
        n/=10;
       }
    
    if(sum==temp){System.out.println("Palidrome");}
    else 
        System.out.println("Not an Palidrome");
}
}
