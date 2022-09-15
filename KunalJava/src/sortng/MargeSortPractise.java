package sortng;

import java.util.Arrays;
import java.util.Random;

public class MargeSortPractise {

	public static void main(String[] args) {
		Random rand = new Random() ;
				
			int arr[] = {7,4,12,1,8,3,6,2} ;
		
		System.out.println(Arrays.toString(arr));
		merge(arr,0,arr.length-1) ;
		System.out.println(Arrays.toString(arr));
	}

	private static void merge(int[] arr, int start, int end) {
		if(start < end) {
			int mid = (start + end) / 2 ;
			merge(arr,start,mid) ;          //left part
			merge(arr,mid+1,end) ;          //right part
			
			sort(arr,start,mid,end) ;
		}
		
		
	}

	private static void sort(int[] arr, int start, int mid, int end) {
		//lets create 2 array left and right and put the 2 array elements for each calls
		
		//first get the array size
		int leftSize = mid -  start +1 ;
		int rightSize = end - mid ;
		//creeate 2 array
		int left[] = new int[leftSize] ;
		int right[] = new int[rightSize] ;
		//filling the array element
		for (int i = 0; i < left.length; i++) {
			left[i] = arr[start + i] ;
		}
		for (int i = 0; i < right.length; i++) {
			right[i] = arr[mid+1 + i] ;
		}
		//now we have the left array and right array,  time to sort the aray and put in orginal array
		
		int i = 0 ;  //traverse the left array
		int j = 0 ;  //traverse the rigth array
		//create an index to fill in the original array, 
		int k = start ;  //for every call start is the starting index to modify
		
		while(i<leftSize && j<rightSize) {
			if(left[i] <= right[j]) {
				arr[k] = left[i] ;
				i++ ;
			}else {
				arr[k] = right[j] ;
				j++ ;
			}
			k++ ;
		}
		while(i < leftSize) {
			arr[k++] = left[i++] ;
		}
		while(j < rightSize) {
			arr[k++] = right[j++] ;
		}
		
		
	}

}
