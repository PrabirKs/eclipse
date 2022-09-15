
package accioJob;
import java.io.*;
import java.util.*;


public class RemoveZeroes {
	 public static void main(String args[]) {
	        // your code here
	        		 Scanner sc=new Scanner(System.in);
		        int t=sc.nextInt();
		        for(int i=0;i<t;i++)
		        {
		            String s=sc.next();
		            calculate(s);
		        }
		    }
		
		static void calculate(String s)
	    {
			int length=s.length();
	      
	        int c=0;
	        for(int i=0;i<length;i++)
	        {
	            int count=0;
	            if(s.charAt(i)=='1')
	             {
	               for(int j=i+1;j<length;j++)
	               {
	                   if(s.charAt(j)=='0')
	                   {
	                       count++;
	                   }
	                   else
	                   {
	                       c=c+count;
	                       break;
	                   }
	               
	               }
	              
	                 
	             }
	        }
	         System.out.println(c);

	    }
}
  