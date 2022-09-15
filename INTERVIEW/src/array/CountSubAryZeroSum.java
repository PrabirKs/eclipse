package array;
import java.util.*;
public class CountSubAryZeroSum {

	public static void main(String[] args) {
		int[] arr = {1,2,4,-2,1,-3,6,2,-8,1,5,-6};
        System.out.println(countSubarray(arr)) ;
	}

	private static int countSubarray(int[] arr) {
		int count = 0 ; int sum = 0 ;
		HashMap<Integer,Integer> map = new HashMap<>() ;
		map.put(0, 1) ;                                  //till 0 index the sum = 0 , freq = 1
		
		for(int i = 0 ; i < arr.length ; i++) {
			sum+=arr[i] ;
			if(map.containsKey(sum)) {
				count += map.get(sum) ;
				map.put(sum, map.get(sum)+1) ;
			}else {
				map.put(sum, 1) ;
			}
			
		}
		return count ;
	}

}
