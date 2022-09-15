package sortng;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuickSortPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		Random rand = new Random() ;
		int arr[] = new int[100000];
		
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = rand.nextInt(100000) ;
		}
		
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int start, int end) {
	
		if(start >= end) {
			return ;
		}
		//choosing a pivot , generally ewe take the last index , but here we just take any element 
		//in the array and swap it with the last element , and perform the samw operation
	//	int pivot = arr[end];                
		int randPivotIndx = new Random().nextInt(end - start) + start ;
		int pivot = arr[randPivotIndx] ;
		swap(arr,randPivotIndx,end) ;
		
		
		int s = partition(arr, end, pivot);    //get the partition point
	  
		//partition code
		quickSort(arr,start,s-1) ;             //recursively calling for sort and partition point
		quickSort(arr,s+1,end) ;

	}

	private static int partition(int[] arr, int end, int pivot) {
		int s = 0;
		int e = end;

		while (s < e) {
			while (arr[s] <= pivot && s < e ) {
				s++;
			}
			while (arr[e] >= pivot && s < e) {
				e--;
			}
			swap(arr, s, e);
		}
		swap(arr, s, end);
		return s;
	}

	private static void swap(int[] arr, int s, int e) {
		int temp = arr[s];
		arr[s] = arr[e];
		arr[e] = temp;
    }
 
}
