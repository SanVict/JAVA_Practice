import java.util.Scanner;

public class number_of_digit {
     public static void main(String[] Sanjay){
     Scanner sc=new Scanner(System.in); 
        int sum=0;
	    int n=sc.nextInt();
        while(n>0){
	    int d= n%10;
        sum+=d;
        n/=10;
     }System.out.println(sum);
    }
}
