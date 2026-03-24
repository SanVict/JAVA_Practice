import java.util.Scanner;

public class Isarray_sorted {
    public static void main(String[] sanjay){

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int flag=0;
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            if(arr[i-1]<arr[i] ){continue;} //arr[i-1]>arr[i]->descending if needed include <= || >=
            else flag=1;;                      //purely depends on coder 
        }
        if(flag==1)System.out.println("Not sorted");
        if(flag==0)System.out.println("Sorted Ascending");
        
}
}
}
