import java.util.Scanner;
import java.util.Arrays;
public class SecondlargestOptimal {
    public static void main(String[] sanjay){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        int sl=-1;
        for(int i=1;i<n-1;i++){
            if(arr[i]>largest){
                sl=largest;
                largest=arr[i];
            }
            else if(arr[i]>sl && arr[i]!=largest){
                sl=arr[i];
            }
        }
    System.out.println("Second largest: "+sl);}
  }
}


