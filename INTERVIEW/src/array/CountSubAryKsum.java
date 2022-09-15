package array;

import java.util.HashMap;

public class CountSubAryKsum {

	public static void main(String[] args) {
		int[] arr = {3,1,0,6,4,2,7,-5,-10};
		int k = 4 ;
        System.out.println(countSubarray(arr,k)) ;
	}

	private static int countSubarray(int[] arr,int k) {
		int count = 0 ; int sum = 0 ;
		HashMap<Integer,Integer> map = new HashMap<>() ;
		map.put(0, 1) ;                                  //till 0 index the sum = 0 , freq = 1
		
		for(int i = 0 ; i < arr.length ; i++) {
			sum+=arr[i] ;
			if(map.containsKey(sum-k)) {                        //check for 14-10 is present or not
				count += map.get(sum-k) ;                       //get the freq of that
			}else {
				map.put(sum, map.getOrDefault(sum,0)+1 ) ;      //if that sum is present before then
			}
			
		}
		return count ;
	}
}
