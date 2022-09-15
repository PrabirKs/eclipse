package recursionKK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombintnSumII {

	public static void main(String[] args) {
		int arr[] = {1,1,1,2,2} ;   // it is sorted , but in case of unsorted array first sort it
		int target = 4 ; 
		System.out.println(findcombntn(arr,target)) ;
		
	}
    static List<List<Integer>> findcombntn(int[] arr , int target){
    	Arrays.sort(arr);
    	List<List<Integer>> ans =  new ArrayList<>() ;
    	search(arr,target,0,new ArrayList<>(),ans) ;
    	return ans ;
    }
    static void search(int[] arr, int target, int index,List<Integer> ds, List<List<Integer>> ans) {
		if(target==0) {
			ans.add(new ArrayList<>(ds)) ;
			return ;
		}
		for(int i = index ; i < arr.length ; i++ ) {
			if(i > index && arr[i]==arr[i-1]) continue ;
			
			if(arr[i]>target) break ;
			
			ds.add(arr[i]) ;
			search(arr,target-arr[i],i+1,ds,ans) ;  // here instead of i+1 write indedx+1 and it is generatring all the subset of target sum
			//reset                                 //cz it is making target sum right but taking sample from the index before so .
			ds.remove(ds.size()-1) ;
		}
	}
}
