import java.util.Scanner;
public class Permutation_npeople_occupy_rseats {
    public static void main(String[] Sanjay){   // 0<=n<=100000;
       Scanner sc=new Scanner(System.in); 
       int n=sc.nextInt();
       int r=sc.nextInt();int per=1;
       for(int i=n;i>n-r;i--){
          per*=i;
       }
       System.out.println(per);
}
}
