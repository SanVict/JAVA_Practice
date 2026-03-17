import java.util.Scanner;

public class sumof_digits {
       public static void main(String[] Sanjay){
       Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();  
       System.out.println("Sum of digits is :"+sumofdigit(n));  
}
static int sumofdigit(int n){
    if (n==0) return n;
    return n%10+sumofdigit(n/10);
}
}
// using recursion 
// use extraction method this is only for understanding 