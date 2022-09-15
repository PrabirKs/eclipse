package sortng;

import java.util.Arrays;

public class InsertionSort {
	static void InsertionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i];
			int j=i;
			while(j>0 && arr[j-1]>temp) {
				arr[j]=arr[j-1];
				j--;
				System.out.println(Arrays.toString(arr));
			}
			arr[j]=temp;
			//System.out.println(Arrays.toString(arr));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {36,19,29,12,5};
		System.out.println(""+Arrays.toString(arr));
		InsertionSort(arr);
		System.out.println(""+Arrays.toString(arr));

	}

}
