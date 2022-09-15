package array;

import java.util.Arrays;

public class ReArrngepostiveNgtv {

	public static void main(String[] args) {
		int arr[] = {1,2,-3,-4,4,6,-7,8,9,-1} ;
		solve2(arr) ;
		System.out.println(Arrays.toString(arr));
	}

	private static void solve(int[] arr) {
		int i = 0 ; 
		int j = arr.length-1 ;
		
		while(i<=j) {
			if(arr[i]<0 && arr[j]>0) {  //small big
				i++ ; j-- ;
			}else
			if(arr[i]>0 && arr[j]<0) {  //big small
				int temp = arr[i] ;
				arr[i] = arr[j] ;
				arr[j] = temp ;
				i++; j-- ;
			}else
			if(arr[i]<0 && arr[j]<0) {  //small small
				i++ ;
			}else
			if(arr[i]>0 && arr[j]>0) {  // big big
				j--;
			}
				
		}
		
	}
	//1,2,-3,-4,4,6,-7,8,9,-1
	private static void solve2(int[] arr) {
		int i = 0 ; 
		int j = arr.length-1 ;
		
		while(i<=j) {
              while(arr[i]<0) { i++; } 
              while(arr[j]>0) { j-- ;}
        
              if(i<j) {
            	  int temp = arr[i] ;
            	  arr[i] = arr[j] ;
            	  arr[j] = temp ;
              }
		}
	}

}
