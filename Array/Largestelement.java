public class Largestelement {
    public static void main(String [] sanjay){
        int []arr={12,65,87,98,54,78,65,54};
        int max=arr[0];int min=arr[0];
        for(int i=1;i<arr.length;i++){
             if(arr[i]>max){max=arr[i];}
             if(arr[i]<min){min=arr[i];}
        }
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
    }
}
