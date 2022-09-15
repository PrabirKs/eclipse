package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
//rerurn the index of the elements of arry A in array B , 
public class AnagramMapping {

	public static void main(String[] args) {
		char A[] = {'a','b','b','c','e','d','h','e'};
		char B[] = {'a','c','b','e','h','b','e','d' } ;
		 
		System.out.println(Arrays.toString(check(A,B)));
				
		}

	private static int[] check(char[] A, char[] B) {
		HashMap<Character,ArrayList<Integer>> map = new HashMap<>() ;
		for (int i = 0; i < B.length; i++) {
			if(map.containsKey(B[i])) {
				ArrayList<Integer> list = map.get(B[i]) ;
				list.add(i) ;
				map.put(B[i],list) ;
			}else {
			ArrayList<Integer> list = new ArrayList<>();
			list.add(i) ;
			map.put(B[i],list) ;
			}
			
		}
		int ans[] = new int[A.length] ;
		for (int i = 0; i < A.length; i++) {
			ans[i] = map.get(A[i]).get(0) ;
			map.get(A[i]).remove(0) ;
		}
		return ans ;
	}

}


