import java.util.*;

public class Last_Digit {
    public static void main(String[] Sanjay){
     Scanner sc=new Scanner(System.in); // Also use Logbase 10(n) to find the last digit 
                                        //  The above opt will be in float use floor to round off
	    int n=sc.nextInt();
	    System.out.println(" The last digit is :" +(n%10));
}
}
