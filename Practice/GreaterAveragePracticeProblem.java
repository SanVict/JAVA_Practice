import java.util.*;
import java.lang.*;
import java.io.*;

class GreaterAveragePracticeProblem
{
	public static void main (String[] args) throws java.lang.Exception
	{
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
          double a= sc.nextDouble() ;
          double b= sc.nextDouble();
          double c= sc.nextDouble();
          double avg=(a+b)/2;
          if(avg>c) System.out.println("YES");
          else 
          System.out.println("NO");
      }

	}
}
