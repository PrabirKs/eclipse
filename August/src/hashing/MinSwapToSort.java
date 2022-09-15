package hashing;
import java.util.*;
public class MinSwapToSort {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in) ;
	    int n = sc.nextInt() ;
		
		int arr[] =  new int[n] ;
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt() ;
		}
		
		System.out.println(count(arr));

	}
	
	static int count(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<>() ;
		int n = arr.length ;
		int nums[] = new int[n] ; int j = 0 ;
		for(int x :arr) {
			nums[j] = x ;
			j++ ;
		}
		
		Arrays.sort(nums);
		
		for(int i = 0 ; i < n ; i++) {
			map.put(arr[i], i) ;
		}
		int count = 0 ;
		for(int i = 0 ; i < n ;i++) {
			if(arr[i] != nums[i]) {
				count++ ;
				int index = map.get(nums[i]) ;
				map.put(arr[i], index) ;
				swap(arr,i,index) ;
				
			}
		}
		return count ;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i] ;
		arr[i] = arr[j] ;
		arr[j] = temp ;
		
	}
	

	

}
