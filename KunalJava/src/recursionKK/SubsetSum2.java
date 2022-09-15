package recursionKK;
import java.util.*;
public class SubsetSum2 {
	//the aray is consists of duplicates and task is to get the all unique subset
	public static void main(String[] args) {
		int arr[] = {1,2,2,3} ;
		System.out.println(uniqSubset(arr));
	}

	private static List<List<Integer>> uniqSubset(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>() ;
        find(arr,0,new ArrayList<>(),ans) ;
		return ans;
	}

	private static void find(int[] arr, int index, List<Integer> ds, List<List<Integer>> ans) {
//		if(index == arr.length) {
//		ans.add(new ArrayList<>(ds)) ;
//		return ;
//		}
		ans.add(new ArrayList<>(ds)) ;
		for(int i= index ; i < arr.length ; i++) {
			if(i != index && arr[i]==arr[i-1]) continue ;    //skipping all duplicates adjacent
			ds.add(arr[i]) ;
			find(arr,i+1,ds,ans) ;
			ds.remove(ds.size()-1) ;
		}
		
	}

}
