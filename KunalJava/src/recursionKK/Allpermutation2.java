package recursionKK;
import java.util.*;
public class Allpermutation2 {

	public static void main(String[] args) {
		int arr[] =  {1,2,3} ;
		System.out.println(permutation(arr)) ;

	}

	private static List<List<Integer>> permutation(int[] arr) {
		List<List<Integer>> ans = new ArrayList<>() ;
		findpermutation(arr,0,ans) ;
		return ans ;
	}

	private static void findpermutation(int[] arr, int index, List<List<Integer>> ans) {
		if(index==arr.length) {
			//copy array to a ds
			List<Integer> ds = new ArrayList<>() ;
			for(int val : arr) {
				ds.add(val) ;
			}
			ans.add(new ArrayList<>(ds)) ; //then add
			return ;
		}
		
		for(int i = index ; i < arr.length ; i++ ) {
			swap(arr,index,i) ;                   //swap
			findpermutation(arr,index+1,ans) ;    //call for next index
			swap(arr,index,i) ;                   //reswap during backtrack
		}
		
	}

	private static void swap(int[] arr, int index, int i) {
		int temp = arr[index] ;
		arr[index] = arr[i] ;
		arr[i] = temp ;
		
		  List<Integer> list = new ArrayList<>() ;
		  list.
	 }
	
	
	  
	        
}
