package array;

import java.util.*;
import java.util.Collections;

public class ArrangeEvenOdd {

	public static void main(String[] args) {
	   Integer arr[] = {4,7,3,6,1,9,8,11,10,2} ;
	   Integer arr3[] = {4,-7,3,-6,-1,9,8,-11,-10,-2 } ;
	//   solve3(arr3) ;
       System.out.println(Arrays.toString(arr3));
	}
    //rearrange like "odd" at left (in descending order) and "even" at right (in Descending order)
	//Tc: Nlogn + n
	private static void solve(Integer[] arr) {
		int s = 0 ; int e = arr.length-1 ; int odd_count = 0 ;
		
		while(s<=e) {
			while(arr[s]%2 != 0)  {s++; odd_count++; }
			
			while(arr[e]%2==0) { e-- ; } 
			
			if(s<e) {
				int tmp = arr[s] ;
				arr[s] = arr[e] ;
				arr[e] = tmp ;
			}
			Arrays.sort(arr,0,odd_count,Collections.reverseOrder());   // the reverseorder() can't reverse
			//diretly firstly , we have to sort it and then pass it to this func . 2. it don't support 
			//non-primitive so declare the array " Integer[] arr " ;
			Arrays.sort(arr,odd_count+1,arr.length);
		}
	}
	//making every odd no to -ve and then sort we will have all the odd no one side with ascending order
	// cz the bigger odd no became smaller by * -1 , and all the even are also ascending sorted
	private static void solve2(Integer[] arr) {
	        for(int i = 0 ; i < arr.length ; i++) {
	        	if(arr[i]%2 != 0) {
	        		arr[i]*=-1;
	        	}
	        }
	        Arrays.sort(arr);
	        //again just multiply -1 with them to get back the odds
	        for(int i = 0 ; i < arr.length ; i++)
	        	if(arr[i]%2 != 0)
	        	arr[i]*=-1 ;
	}
	
	//but the above approach is just possible , if no -ve numbers in in array . 
	//cz if there were -ve even no then there will be no desired result
	
	// 4,-7,3,-6,-1,9,8,11,-10,-2               -7 -4 6 9 3    // 9 -7 -4 6
	//so what we have to do , 
	

	
	 
}
