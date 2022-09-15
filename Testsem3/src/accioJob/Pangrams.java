package accioJob;

import java.util.*;
import java.io.*;

public class Pangrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
      
       char[] ch=s.toCharArray();
     //  System.out.print(s);
       char c1='a',c2='A'; 
       int count=0;
       for(int i=0;i<26;i++)
       {
    	   for(int j=0;j<ch.length;j++)
    	   {
    		   char m=(char)(c1+i);
    		   char n=(char)(c2+i);
    		   if(m==ch[j]||n==ch[j])
    		   {
                 count++;
    		   }
    		   
    	   }
       }

	}

}
