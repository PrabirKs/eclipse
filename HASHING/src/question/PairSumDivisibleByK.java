package question;
import java.util.*;
public class PairSumDivisibleByK {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt() ;
		int k = sc.nextInt() ;
		
		int arr[] =  new int[n] ;
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt() ;
		}
		
		System.out.println(countPair(arr,k));
	}
	static int countPair(int[] arr, int k) {
		HashMap<Integer,Integer> map =  new HashMap<>() ;
		
		for(int i = 0 ; i < arr.length ; i++) {
			int key = arr[i] % k ;
			
			map.put(key, map.getOrDefault(key,0) + 1) ;
		}
		 
		int count = 0 ; int count1 = 0 ;
		for(int key : map.keySet()) {
			if( (key*2 != k ) && (key!=0 && map.containsKey(k-key))) {
				count+= map.get(key) * map.get(k - key)  ;
			}
			else if(key == 0) {
				int val = map.get(key) ;
				count1 = count1 + (val * (val -1 )/2 ) ;
				
			}else if(key * 2 == k) {
				int val = map.get(key) ;
				count1 = count1 + (val * (val -1 )/2 ) ;
			}
	  }
		return (count/2) + count1 ;
	}
	
	static int countPair1(int[] A, int K) {
		// Create a frequency array to count
			// occurrences of all remainders when
			// divided by K
	     int n = A.length ;
			int freq[] = new int[K];

			// Count occurrences of all remainders
			for (int i = 0; i < n; i++)
				++freq[A[i] % K];

			// If both pairs are divisible by 'K'
			int sum = freq[0] * (freq[0] - 1) / 2;

			// count for all i and (k-i)
			// freq pairs
			for (int i = 1; i <= K / 2 && i != (K - i); i++)
				sum += freq[i] * freq[K - i];
			// If K is even
			if (K % 2 == 0)
				sum += (freq[K / 2] * (freq[K / 2] - 1) / 2);
			return sum;
		}
}
