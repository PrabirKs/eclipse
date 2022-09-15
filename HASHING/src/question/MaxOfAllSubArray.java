package question;
import java.util.*;
public class MaxOfAllSubArray {

	public static void main(String[] args) {
		int k = 3; 
		int arr[] = {1,3,-1,-3,5,3,6,7} ;
		int arr2[]= {1};
		System.out.println(maxOfAllOfSizeK(arr,k));

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


}
