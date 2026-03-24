import java.util.Arrays;
import java.util.Scanner;
public class left_rotate_array_k_pos {
    static void reverse(int a,int b,int []arr){
        int p1=a;
        int p2=b-1;
        while(p1<p2){
            int temp=arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=temp;
            p1++;
            p2--;
        }
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
        System.out.print("Enter K: ");
        int k=sc.nextInt();
        k=k%n;
        reverse(0,k,arr);
        reverse(k,n,arr);
        reverse(0,n,arr);
        System.out.println(Arrays.toString(arr));
    }
   }
}
