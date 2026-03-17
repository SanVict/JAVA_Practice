import java.util.Scanner;

public class All_Divisors {
    public static void main(String[] Sanjay){   // 0<=n<=100000;
       Scanner sc=new Scanner(System.in); 
       int n=sc.nextInt();
    //    for(int i=1;i<=n;i++){                  <-- BruteForce 
    //     if(n%i==0){System.out.println(i);}      <-- BruteForce
    //    }
      for(int i=1;i*i<=n;i++){
        if(n%i==0 && i*i==n){
            System.out.println(i);
        }
        else if(n%i==0){
            System.out.println(i);
            System.out.println(n/i);
        }
      }
}
}
