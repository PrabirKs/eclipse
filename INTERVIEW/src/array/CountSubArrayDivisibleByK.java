package array;

import java.util.HashMap;

public class CountSubArrayDivisibleByK {

	public static void main(String[] args) {
		int arr[] = {2,3,5,4,5,3,4};
		int k = 7 ;
        System.out.println(count(arr,k)) ;
        System.out.println(longest(arr,k)) ;
	}
   
	static int count(int arr[],int k) {
		int cnt = 0 ; int sum = 0 ;
		HashMap<Integer,Integer> map =new HashMap<>() ;
		map.put(0,1) ;
		for(int i = 0 ; i<arr.length ; i++) {
			sum += arr[i] ;
			int rem = sum % k ;
			if(rem<0) rem+=k ;
			
			if(map.containsKey(rem)) {
				cnt += map.get(rem) ;
			}
			
			map.put(rem,map.getOrDefault(rem, 0)+1) ;  //for each rem
		}
		return cnt ;
	}
	
	static int longest(int arr[],int k) {
		int maxLength= 0 ; int sum = 0 ;
		HashMap<Integer,Integer> map =new HashMap<>() ;
		map.put(0,-1) ;
		for(int i = 0 ; i<arr.length ; i++) {
			sum += arr[i] ;
			int rem = sum % k ;
			if(rem<0) rem+=k ;
			
			if(map.containsKey(rem)) {
				 maxLength = Math.max(maxLength, i - map.get(rem)) ;
			}
			else
			map.put(rem,i) ;  //for each rem
		}
		return maxLength ;
	}
}
