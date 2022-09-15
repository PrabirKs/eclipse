package accioJob;
import java.io.*;
import java.util.*;

public class TimeConversion {
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
     String s=sc.next();
    
     if(s.charAt(8)=='A')
     {
     
         int n=Integer.parseInt(s.substring(0,2)) ;
	       if(n==12)
		      System.out.println("00"+s.substring(2,8));
	       else
		      System.out.println(s.substring(0,8));  
     }
    
     
  else
	    
  //  (s.charAt(8)=='P');
      {
        int n=Integer.parseInt(s.substring(0,2));
        if(n==12)
    	 System.out.print("12"+s.substring(2,8));
        else
         {
            n=12+n;
            System.out.println(n + s.substring(2,8) );
         }
      }
 
  }
}
