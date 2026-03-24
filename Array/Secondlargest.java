import java.util.Scanner;
import java.util.Arrays;
public class Secondlargest {
    static int secondlar(int[]arr){
        int n=arr.length;int sl=-1;
         int largest=arr[n-1];
         for(int i=n-2;i>=0;i--){
             if(arr[i]!=largest){
                sl=arr[i];
                break;}
         }
         return sl;
    }
    public static void main(String[] sanjay){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Second Largest: "+secondlar(arr));
    }
  }
}
