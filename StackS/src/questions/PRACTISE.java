package questions;

import java.util.*;



public class PRACTISE {
     public static void main(String args[]) {
    	 int arr[] = {1,5,3,2,7,4,6,9} ;          //5 7 7 7 9 6 9
    	 
    	 int nxtGrtr[] = findRight(arr) ;
    	 
    	 
     }
     
     static int[] findRight(int[] arr) {
    	 int n = arr.length ;
    	 int[] res = new int[n] ;
    	 Stack<Integer> s = new Stack<>() ;
    	 for(int i = n-1 ; i>=0 ; i--) {
    	   while(!s.isEmpty() && s.peek()<=arr[i])  s.pop() ;
    	   
    	   if(s.isEmpty())
    		   res[i] = -1 ;
    	   else
    		   res[i] = s.peek() ;
    	   
    	   s.push(arr[i]) ;
        }	   
    	 return res ;
     }

  
} 
