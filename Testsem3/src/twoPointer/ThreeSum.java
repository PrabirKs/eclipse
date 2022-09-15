package twoPointer;
import java.util.*;
public class ThreeSum {

	public static void main(String[] args) {
	    int[] arr = {1,-1,-1,0} ;
	    int target = 0 ;
	    List<List<Integer>> res = new LinkedList<>();
        res = findTriplet(arr,target);
        System.out.println(res);
	}
   static List<List<Integer>> findTriplet(int[] arr , int target){
	   Arrays.sort(arr);
	   List<List<Integer>> res = new LinkedList<>();	  
	   for(int i = 0 ; i < arr.length-2 ; i++) {
		   if(i==0 || (i >  0 && arr[i]!=arr[i-1])) {           // in case of the i!=0 we are checking for all the duplicates and just skipping them
			                                                    // into the operatoin , to avoid duplicates
			       int left = i+1 ; 
				   int right = arr.length - 1 ; 
				   int sum = target - arr[i] ;
				   
				   while(left<right) {                        // applying two poiinter to get a pair of target-arr[i] , sum
					   if(arr[left] + arr[right] == sum) {
						   
						   res.add(Arrays.asList(arr[i],arr[left],arr[right]));   // find the triplet and add it to the list
						   
						   while(left<right && arr[left] == arr[left+1]) left++ ;   // untill the left pointer skip all the duplicte element
						   while(left<right && arr[right] == arr[right-1]) right-- ; //untill right skip all the duplicates
						   
						   left++ ; right-- ;   // basically on the above while loop the pointer is still at the last duplicate element so , this
						                        // step to place them at the correct place
					 }
					   
					   else if(arr[left] + arr[right] < sum)  // for the sum less than the sum
						    left++ ;
					   else right-- ;                          // if get greater sum then
				   }
		       } 
	        }
	       return res ;
      }
}
 // time : o(n^2).nlogn ;  sc = o(m) // no of triplet