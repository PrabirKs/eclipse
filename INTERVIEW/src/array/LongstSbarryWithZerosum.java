package array;
import java.util.*;
public class LongstSbarryWithZerosum {

	public static void main(String[] args) {

		int[] arr = {15,-2,2,-8,1,7,10,23} ;
		int[] arr2 = {1,-1,3,2,-2,1,7,10,23} ;

		subarray(arr2) ;

	}
	// by this way we can generate all subarry and calculate their sum , and when we get a sum == 0 , we just take (j - i + 1 ) as the
	// length of the subarray with zero sum and take the max of the length ,  O(n^3) approach .
	static void subarray(int[] arr) {
		int n = arr.length ; int maxlength = 0;
		for(int i = 0 ; i < n ; i++) {
			for(int j = i ; j < n ; j++) {
				int sum = 0 ;
				for(int k = i ; k <=j ; k++) {
					sum+=arr[k] ;
				}
				if(sum==0) {
					maxlength = Math.max(maxlength,(j-i+1)) ;
				}
			}
		}
		System.out.println(maxlength);
	}
	
 // and it can be more optimised , by just removing the 'k' loop as before . this will also giv the O(n^2) . 
	
	static int subarray2(int[] arr) {
		int n = arr.length ; int prefixsum =  0 ; int max = 0 ;
		HashMap<Integer,Integer> map =  new HashMap<Integer,Integer>() ;
		for(int i = 0 ; i < n ; i++) {
			 prefixsum = prefixsum + arr[i] ;
			if(prefixsum == 0) {
				max = i + 1 ;
			 }else {
			       if(!map.containsKey(prefixsum)) {
				      map.put(prefixsum, i ) ;
			       }else {
		                max = Math.max(max,  i - map.get(prefixsum)) ;
			       }
		      }
	      }
		System.out.println(max);
		return max ; 
	}
	
}
