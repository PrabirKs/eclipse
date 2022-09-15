package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
class Pair{
	int elmnt ;
	int index ;
	public Pair(int elmnt , int index) {
		this.elmnt = elmnt ;
		this.index = index ;
	}
}	
public class Slidingwindowmax {

	public static void main(String[] args) {
		//int demoslide[] = {2,4,5,3,12,9,8,7,11,10,18,12} ; //5,12,12,12,12,11,11,18,18
		int arr2[]= {2,9,3,8,1,7,12,6,14,4,32,0,7,19,8,12,6};
		//System.out.println(Arrays.toString(nxtGrtr));
   	//System.out.println(Arrays.toString(findnxtgrtr(demoslide)));
   	 System.out.println(sldingwindowmax(arr2,4));

	}

	   static int[] findnxtgrtr(int[] arr) {
	    	 int n = arr.length ;
	    	 int[] res = new int[n] ;
	    	 Stack<Integer> s = new Stack<>() ;
	    	 for(int i = n-1 ; i>=0 ; i--) {
	    	   while(!s.isEmpty() && arr[s.peek()]<=arr[i])  s.pop() ;
	    	   
	    	   if(s.isEmpty())
	    		   res[i] = n;
	    	   else
	    		   res[i] = s.peek();
	    	   
	    	   s.push(i) ;
	        }	   
	    	 return res ;
	     }
	     
	 
	 //here at each step i am traversing j linearly , and checking

	     static ArrayList<Integer> slidingwindowmax(int[] arr,int k){
	    	 int reference[] = findnxtgrtr(arr) ;
	    	 ArrayList<Integer> list =  new ArrayList<Integer>() ;
	    	 int j = 0 ;
	    	 for(int i = 0 ; i <=arr.length-k ; i++) {
	    	   while(j<i+k && reference[j+1] <= i+k-1 && reference[j+1]!=arr.length) {
	    		   j++ ;
	    	   }
	           list.add(arr[reference[j]]);
	    	   if(j<i) j=i ;
	    		   
	    	 }
	         return list ;
	     }
	     
 // but no need of that we just check first greater
		 //element of first element  then if it is lies within the window , we move the j to that point and ,
		 //check its next greter by doing this , we are saving some space  
	     static ArrayList<Integer> sldingwindowmax(int[] arr,int k){
	    	 int reference[] = findnxtgrtr(arr) ;
	    	 ArrayList<Integer> list =  new ArrayList<Integer>() ;
	    	 int j = 0 ;
	    	 
	    	 for(int i = 0 ; i <=arr.length-k ; i++) {
	    	   if(j<i) j=i ;
	    	   
	    	   while(reference[j] < i+k ){
	    		   j = reference[j] ;
	    	   }
	           list.add(arr[j]);
	    	 }
	         return list ;
	     }
	     
	     static List<Integer> maxOfAllOfSizeK(int[] arr,int k){
	  	   List<Integer> ans = new ArrayList<Integer>() ;
	  	   List<Integer> max = new ArrayList<Integer>() ;
	  	   int i = 0 ; 
	  	   int j = 0 ;
	  	   
	  	   while(j < arr.length) {
	  		   
	  		   //calculation 
	  		   int index = max.size() -1 ;
	  		   while(max.size() > 0 && max.get(index) < arr[j]) {
	  			   max.remove(index) ;
	  			   index-- ;
	  		   }
	  		   max.add(arr[j]) ;
	  		   
	  		   //if window size is small
	  		   if(j - i + 1 < k) {
	  			   j++ ; //
	  		   }
	  		   else if(j - i + 1  == k) {
	  			   ans.add(max.get(0)) ;
	  			   
	  			   //calculation
	  			   if(arr[i] == max.get(0)) {
	  				   max.remove(0) ;
	  			   }
	  			   i++ ;
	  			   j++ ;
	  		   }
	  	   }
	  	   return ans ;
	  	}

}
