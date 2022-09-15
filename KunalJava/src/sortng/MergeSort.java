package sortng;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,88,1,36,19,29,12,5};
		System.out.println("before:"+Arrays.toString(arr));
	    int[] ans=MrgeSort(arr);
	System.out.println("after: "+Arrays.toString(ans));


	}
	
	static int[] MrgeSort(int[] arr) {
		if(arr.length==1) {
			return arr;
		}
		int mid=arr.length/2;
		int[] left=MrgeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right=MrgeSort(Arrays.copyOfRange(arr, mid, arr.length));
		return merge(left,right);
	}
	static int[] merge(int[] first,int[] second) {
		int[] mix=new int[first.length+second.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<first.length && j<second.length) {
			if(first[i]<second[j]) {
				mix[k]=first[i];
				i++;
			}
			else {
				mix[k]=second[j];
				j++;
			 }
			k++;
		}
		while(i<first.length) {
			mix[k]=first[i];
			i++; 
			k++;
		}
		while(j<second.length) {
			mix[k]=second[j];
			j++;
			k++;
		}
		return mix;
	}


}
