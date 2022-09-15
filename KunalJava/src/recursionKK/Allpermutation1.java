package recursionKK;
import java.util.*;
public class Allpermutation1 {

	public static void main(String[] args) {
		int arr[] = {1,2,3} ;
		
        System.out.println(permut(arr)) ;
	}

	private static List<List<Integer>> permut(int[] arr) {
		List<List<Integer>> ans =  new ArrayList<>() ;
		boolean[] freq =  new boolean[arr.length] ;
		findpermut(arr,freq,new ArrayList<>(),ans) ;
		return ans ;
	}
   static void findpermut(int[] arr, boolean[] freq, List<Integer> ds, List<List<Integer>> ans) {
       if(ds.size()==arr.length) {
    	   ans.add(new ArrayList<>(ds)) ;
    	   return ;
       }
	   for(int i = 0 ; i < arr.length ; i++) {
		   if(!freq[i]) {                        //by default false so !false = true
			freq[i] = true ;                     //make that true , in future it cant be taken !true = false
			ds.add(arr[i]) ;                     //add that in the ds
			findpermut(arr,freq,ds,ans) ;        //call for another
			ds.remove(ds.size()-1) ;             //remove that during backtrack
			freq[i] = false ;                    //make that index true again
	     }
	  }
    }
}
