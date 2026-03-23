public class odd_numbers_even_numbers {
    public static void main(String []sanjay){
        int oddn=0,evenn=0;
        int []n={10,21,30,43,50,60,56,9,89,56};
        for(int i=0;i<n.length;i++){
            if(n[i]%2==0)evenn++;
            else 
                oddn++;
        }
        System.out.println("Even: "+evenn+"\nOdd: "+oddn);
        
    }
 }

 