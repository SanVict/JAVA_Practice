import java.util.Scanner;

public class Sum_of_n_natural_num {
     int sum=0;
    public static void main(String[]sanjay){    //N*(n-1)/2 also used now trying in recursion
      Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
        int out=sumofn(n);
        System.out.println("The sum is :"+out);
    }
    static int sumofn(int n){
        int sum=0;
          if(n==0) {return sum;}
          return (sum+n)+sumofn(n-1);  
    }
}
