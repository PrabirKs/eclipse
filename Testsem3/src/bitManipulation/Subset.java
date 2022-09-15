package bitManipulation;
import java.util.*;
public class Subset {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in)  ;
		int n = sc.nextInt() ;
	   ArrayList<Integer> arr =  new ArrayList<>(n);
	    
	    for(int i = 0 ; i < n ; i++) {
	    	arr.add(sc.nextInt());
	    }
	    System.out.println();
	    ArrayList<ArrayList<Integer>> res = new ArrayList<>() ;
	    res = findSubArray(arr);
	    System.out.println(res);
	    for(int i = 0 ; i < (1<<n) ; i++) {
	    	for(int j = 0 ; j<res.get(i).size() ; j++) {
	    	 System.out.print(arr.get(res.get(i).get(j))+" ");
	    	}
	    	System.out.println();
	    }
	
	}
	
	static ArrayList<ArrayList<Integer>> findSubArray(ArrayList<Integer> arr) {
		int n = arr.size();
		ArrayList<ArrayList<Integer>> subset = new ArrayList<>() ;
		int subset_count = (1<<n) ;
		for(int i = 0 ; i<subset_count ; i++) {
	        ArrayList<Integer> subsetBit = new ArrayList<>();
	         for(int j = 0 ; j < n ; j++) {
	        	 if((i & (1<<j))!=0) {
	                subsetBit.add(j)  ; 		 
	        	 }
	         }
	         subset.add(subsetBit);
		}
		return subset;
	}

}
