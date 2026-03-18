import java.util.Scanner;

public class Primeassum {
     public static void main(String[] Sanjay){
     Scanner sc=new Scanner(System.in); 
        int sum=0;
	    int n=sc.nextInt();
        boolean res=prime(n-2);
        if(res==true){
            System.out.println("Can be expressed in terms of prime");
        }
        else 
            System.out.println("Can't be expressed in terms of prime");

 }
 static boolean prime(int n){
    if(n==0 || n==1) return false;
    if(n==2 || n== 3) return true;
    if(n%2==0 || n%3==0) return false;
    for(int i=5;i<n;i=i+2){
        if(n%i==0)return false;
    }
    return true;
}
}
