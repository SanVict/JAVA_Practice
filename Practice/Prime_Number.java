import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] Sanjay){   
       Scanner sc=new Scanner(System.in); 
       int n=sc.nextInt();
       boolean output=prime(n);
       System.out.println(output);
}
static boolean prime(int n){
    if(n==0 || n==1 ){return false;}
    if(n==2 || n==3){return true;}
    if(n%2==0 || n%3==0) return false;
    for(int i=5;i*i<=n;i=i+2){
        if(n%i==0) return false;
    }
    return true;
}

}
