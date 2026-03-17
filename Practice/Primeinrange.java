import java.util.Scanner;
public class Primeinrange {
    public static void main(String[] Sanjay){   
       Scanner sc=new Scanner(System.in); 
       int a=sc.nextInt();
       int b=sc.nextInt();
       for(int i=a;i<=b;i++){
        int res=prime(i);
        if(res!=0){System.out.println(i);}
       }
}
static int prime(int n){
    if(n==0 || n==1 ){return 0;}
    if(n==2 || n==3){return n;}
    if(n%2==0 || n%3==0) return 0;
    for(int i=5;i*i<=n;i=i+2){
        if(n%i==0) return 0;
    }
    return n;
   }
  }

