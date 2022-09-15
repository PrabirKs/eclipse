package hashTable;

import java.util.Arrays;
import java.util.*;

public class IntrstionOfTwoArry {

	public static void main(String[] args) {
		int arr1[]= {5,5,7,7,2,5};
		int arr2[]= {6,7,9,5,5,5,5};
		
     	System.out.print(findIntersection(arr1,arr2));
		
	}
	
	
	static ArrayList<Integer> findIntersection(int[] arr1, int[] arr2) {
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr1.length;i++) {
			int prev=map.getOrDefault(arr1[i],0);
			map.put(arr1[i], prev+1);
		}
		
		ArrayList<Integer> list=new ArrayList<>();
		map.ge
       for(int i=0;i<arr2.length;i++) {
    	   if(map.containsKey(arr2[i])){
    		   int freq=map.get(arr2[i]);
    		   if(freq>0) {
    			   list.add(arr2[i]);
    			   map.put(arr2[i], freq-1);
    		   }
    	   }
       }
		
		return list;
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//	
//	for(int j=0;j<arr2.length;j++) {
//		    if(map.containsKey(arr2)) {
//			int freq=map.get(arr2[j]);
//		   
//		/* if(freq>0) {
//				list.add(arr2[j]);
//				map.put(arr2[j],freq-1);
//			}
//	    }
//	}	    
//		
//		
//		return list;  */
//	}
//}
