package recursionKK;
import java.util.*;
public class CombinationsumI {

	public static void main(String[] args) {
		int arr[] =  {2,3,6,7} ;
		int target = 7 ;
		System.out.println(combintnsum(arr,target) ) ;
	}
	
    static List<List<Integer>> combintnsum(int[] arr, int target){
    	List<List<Integer>> ans =  new ArrayList<>() ;
    	findCombnation(arr,target,0,new ArrayList<>() , ans) ;
    	return ans ;
    }

	static void findCombnation(int[] arr, int target, int i, List<Integer> ds, List<List<Integer>> ans) {
		 if(i == arr.length || target == 0) {
			 if(target == 0) {
				 ans.add(new ArrayList<>(ds));
			 }
			 return ;
		 }
		 
		 if(target >= arr[i]) {
			 ds.add(arr[i]);
			 print(arr,target-arr[i],i,ds) ;
			 findCombnation(arr,target - arr[i],i,ds,ans) ;
			 ds.remove(ds.size()-1) ;
		 }
		     print(arr,target-arr[i],i,ds) ;
		     findCombnation(arr,target,i+1,ds,ans) ;
	}

	static void print(int[] arr, int target, int index, List<Integer> ds) {
		System.out.println("F(arr , "+ target +", "+ index +", " + ds);
		
	}
}

