package array;

import java.util.Arrays;

public class InversionCount {

	public static void main(String[] args) {
		int arr[] = {5,3,2,4,1} ;
		countInversion(arr,0,arr.length-1) ;
		System.out.println(Arrays.toString(arr) + count);
	}
    private static void countInversion(int[] arr, int low, int high) {
    
		if(low<high) {
			int mid = (low + high)/2 ;
			
			countInversion(arr,low,mid) ;
			countInversion(arr,mid+1,high) ;
			
			merge(arr,low,mid,high) ;
		}
	}
	private static void merge(int[] arr, int low, int mid, int high) {
		int n1 = mid-low+1 ;
		int n2 = high-mid ;
		
		int left[]  = new int[n1]  ;
		int right[] = new int[n2] ;
		
		for(int i = 0 ; i < n1; i++) {
		    left[i] = arr[low+i] ;
		}
		for(int j = 0 ; j < n2 ; j++) {
			right[j] = arr[mid+1+j] ;
		}
		
		int i = 0 ; 
		int j = 0 ; 
		int k = low ;
		
		while(i < n1 && j < n2) {
			if(left[i] <= right[j]) {
				arr[k++] = left[i++] ;
			}else {
				arr[k++] = right[j++] ;
				count = count + ((mid+1)-(low+i)) ;
			 }
		 }
		
		while(i < n1) {
			arr[k++] = left[i++] ;
		}
		while(j < n2) {
			arr[k++] = right[j++] ;
		}
		
	}
	static int count = 0 ;
	
}
