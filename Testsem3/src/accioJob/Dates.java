package accioJob;
import java.io.*;
import java.util.*;
public class Dates {
	  static void Date(String s,char check){
		    int[] index=new int[2];
		    int c=0;
		    for(int i=0;i<s.length();i=i+1){
		       if(s.charAt(i)==check) {
		          index[c]=i; 
		          c++;
		       }
		    }  
		      String dd=s.substring(0,index[0]);
		      if(dd.length()<2) dd="0"+dd;
		      
		      String mm=s.substring(index[0]+1,index[1]);
		      if(mm.length()<2) mm="0"+mm;
		  
		      String yy=s.substring(index[1]+1,s.length());
		     
		      while(yy.length()<4) {
		    	  yy="0"+yy;
		      }
		  
		      
		      if(check=='.') {
		    	  System.out.print(dd+"."+mm+"."+yy+" ");
		    	  System.out.print(mm+"/"+dd+"/"+yy+" ");
		      }
		      else {
		    	  System.out.print(mm+"."+dd+"."+yy+" ");
		    	  System.out.print(dd+"/"+mm+"/"+yy+" ");
		      }
		      
		  
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        String s=new String();
	        int n=sc.nextInt();
	         for(int i=0;i<n;i++){
	           s=sc.next();
	           char check='a';
	           if(s.indexOf('.')==-1){
	             check='/';
	             Date(s,check);
	           }
	           else{
	             check='.';
	             Date(s,check);
	           }
	        }

	}

}
