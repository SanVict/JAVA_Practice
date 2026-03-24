import java.util.*;
public class count_max_no_of_k {
     public static void main(String[] sanjay){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=-1;
        System.err.print("Enter K: ");
        int k=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
           if(arr[i]==k){
               count++;
           }
           if(count>max)max=count;
        }System.out.println("No of "+k+" in array: "+max);
     }
  }
}
