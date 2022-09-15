package array;

import java.util.HashMap;

public class LngstSubAryKsum {

	public static void main(String[] args) {
		int[] arr1 = {3,1,0,6,4,2,7,-5,-10};
		int arr[] = {1,2,3,7,5} ;
		int k = 12 ;
    //    System.out.println(maxSubarray(arr,k)) ;
        System.out.println(maxSubarray2(arr,k)) ;
	}

	private static int maxSubarray(int[] arr,int k) {
		int maxLength = 0 ; int sum = 0 ;
		HashMap<Integer,Integer> map = new HashMap<>() ;
		                           
		
		for(int i = 0 ; i < arr.length ; i++) {
			sum+=arr[i] ;
			
			if(sum==k) {
				maxLength = i+1 ;
			}
			if(map.containsKey(sum-k)) {                              //check for 14-10 is present or not
				maxLength = Math.max(maxLength,i - map.get(sum-k)) ;  // calculate the max length 
				map.put(sum,i) ;                                      //and put that sum
			}else {        
				map.put(sum,i) ;      //if that sum-k is not present before then also put
			}
		 }
		return maxLength ;  //think about the 2 dplicate statement to add sum can be just one line cz at any case we have to add it in the hashmap
	}
	
	private static int maxSubarray2(int[] arr,int k) {
		int i = 0 ; 
		int j = 0 ;
		int sum = 0 ; int maxLength = -2 ;
		while(j < arr.length) {
			//calculation
			
			 sum = sum + arr[j] ;
			 
			 if(sum < k) {
				 j++ ;
			 }
			 else if(sum == k) {
				maxLength = Math.max(maxLength ,j-i+1) ;
				j++ ;
			}else if(sum > k) {
		        	while(sum > k) {
				      sum = sum - arr[i] ;
				      i++  ;
		        	}
		        	//during the calculation a situation mght be coome that
		        	//sum == k and if we will not handle this situatoin then
		        	//after j++ we will loose that subsequence, so calculate it again
				if(sum == k) {
					maxLength = Math.max(maxLength, j-i+1) ;
				}
				
		        j++ ;
			  }
		   }
		return maxLength  ;
	}

}
