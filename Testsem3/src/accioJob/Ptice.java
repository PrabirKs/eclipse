package accioJob;
import java.io.*;
import java.util.*;
public class Ptice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	         String s=sc.next();
	         char[] arr = s.toCharArray();   
	        char[] adrian=new char[n+3];
	         char[] bruno=new char[n+4];
	          char[] goran=new char[n+6];

	      for(int i=0;i<=n;i+=3)
	        {
	            adrian[i]='A';
	            adrian[i+1]='B';
	            adrian[i+2]='C';
	        }
	        for(int i=0;i<=n;i+=4)
	        {
	            bruno[i]='B';
	            bruno[i+1]='A';
	            bruno[i+2]='B';
	            bruno[i+3]='C';
	         }
	         for(int i=0;i<=n;i+=6)
	         {
	             goran[i]='C';
	             goran[i+1]='C';
	             goran[i+2]='A';
	             goran[i+3]='A';
	             goran[i+4]='B';
	             goran[i+5]='B';
	         }
	         int ac=0;
	         int bc=0;
	         int gc=0;
	       for(int i=0;i<arr.length;i++)
	       {
	        if(arr[i]==adrian[i])
	        ac++;
	       }
	        for(int i=0;i<arr.length;i++)
	       {
	           
	        if(arr[i]==bruno[i])
	         
	        bc++;

	       }
	    
	        for(int i=0;i<arr.length;i++)
	       {
	        if(arr[i]==goran[i])
	        gc++;
	       }

	            // arr[i]=sc.next().charAt(0);
	             //   
	        
	            //for(int i=0;i<4;i++)
	       System.out.print(ac+ " "+bc+" "+gc+"\n");
	      if(ac>bc&&ac>gc)
	        System.out.print(ac+"\n"+"Adrian");
	     else 
	      if(bc>gc&&bc>gc)
	       System.out.print(bc+"\n"+"Bruno");
	     else
	       System.out.print(gc+"\n"+"Goran");
	         
	        // your code here
	        if(ac==bc&&ac==gc)
	        {
	            System.out.print(ac+"\n"+"Adrian"+"\n"+"Bruno"+"\n"+"Goran");
	        }
	        else
	        if(ac==bc)
	        {
	            System.out.print(ac+"\n"+"Adrian"+"\n"+"Bruno");
	        }
	        else
	        if(ac==gc)
	        {
	            
	            System.out.print(ac+"\n"+"Adrian"+"\n"+"Goran");
	        }
	        else
	        if(bc==gc)
	         {
	            
	            System.out.print(bc+"\n"+"Bruno"+"\n"+"Goran");
	         }

	}

}
