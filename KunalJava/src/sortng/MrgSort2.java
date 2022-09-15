package sortng;

import java.util.Arrays;

public class MrgSort2 {
	static void merge(int[] arr,int s,int e){
		if(s<e) {
			
		//find the middle
		int mid=s+(e-s)/2;
		//sort first and second halves
		merge(arr,s,mid);
		merge(arr,mid+1,e);
		//merge the second halves
		sort(arr,s,mid,e);
		}
	}
	
	static void sort(int[] arr,int s,int m,int e) {
		
		//find sizes of two subarray to be merged
		int n1=m-s+1;
		int n2=e-m;
		//create temp arrays
		int left[]=new int[n1];
		int right[]=new int[n2];
		//copy data from the original array to temp array
		for(int i=0;i<n1;i++)
			left[i]=arr[s+i];
		for(int j=0;j<n2;j++)
			right[j]=arr[m+1+j];
		//merge the temp arrays
		//initial index of merged subarray array
		int i=0;
		int j=0;
		//intial index of merged subarray array
		int k=s;
		
		while(i<n1 && j<n2) {
			if(left[i]<=right[j]) {
				arr[k]=left[i];
				i++;
			}
			else {
				arr[k]=right[j];
				j++;
			}
			k++;
	     }
	while(i<n1) {
		arr[k]=left[i];
		i++;
		k++;
	}
	while(j<n2) {
		arr[k]=right[j];
		j++;
		k++;
	}
	
}

	public static void main(String[] args) {
		int arr[]=  { 12, 11, 13, 5, 6, 7 };
		System.out.println("before:"+Arrays.toString(arr));
	    merge(arr,0,arr.length-1);
		System.out.println("after: "+Arrays.toString(arr));


	}

}
