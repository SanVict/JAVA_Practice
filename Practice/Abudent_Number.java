import java.util.Scanner;
public class Abudent_Number {
    public static void main(String[] Sanjay){   
       Scanner sc=new Scanner(System.in); 
       int n=sc.nextInt();int sum=1;
      for(int i=2;i*i<n;i++)
        if(n%i==0 ){
            if(i*i==n){
             continue;
        }
        else{
            sum+=i;
            sum+=(n/i);
        }}
      if(sum>n){System.out.println("Abudent_Number");}
      else 
        System.out.println("Not an Abudent Number");
    }
}
  

