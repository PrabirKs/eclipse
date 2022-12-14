package sortng;
import java.util.*;



/* Java program for Merge Sort */
class Msort{
	// Merges two subarrays of arr[].
	// First subarray is arr[l..m]
	// Second subarray is arr[m+1..r]
	static void merge(int arr[], int l, int m, int r)
	{
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/*Copy data to temp arrays*/
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarray array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// merge()
  static void sort(int arr[], int l, int r)
	{
		if (l < r) {
			// Find the middle point
			int m =l+ (r-l)/2;

			// Sort first and second halves
			sort(arr, l, m);
			sort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver code
	public static void main(String args[])
	{
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		printArray(arr);

	     sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);
	}
}





















































/*public class Msort {
	  static void divide(int[] arr,int start,int end) {
		  while(start<end) {
			      int mid=(start+end)/2;
			      //sort left half from start to mid
			      divide(arr,start,mid);
			      //sort right half from mid+1 to end
			      divide(arr,mid+1,end);
			      //merge the sorted halves
			      merge(arr,start,mid,end);
		  }
	  }
	  
	  static void merge(int[] arr,int start,int mid,int end) {
		  int leftSize = mid - start + 1;
		  int rightSize= end-mid;  //
		  
		  int[] left=new int[leftSize];
		  int[] right=new int[rightSize];
		  
		  for(int i=0;i<leftSize;i++) {
			  left[i]=arr[start+i];
		  }
		  for(int j=0;j<rightSize;j++) {
			  right[j]=arr[mid+j+1];
		  }
		  
		  int i=0; 
		  int j=0;
		  
		  //inittial index of each merge opertion from which the sorted element adding willl be start
		  int k=start;
		  
		  while(i<leftSize && j<rightSize) {
			  if(left[i]<=right[j]) {
				  arr[k]=left[i];
				  i++;
			  } else {
				  arr[k]=right[j];
				  j++;
			  }
			  k++;
		  }
		  
		  while(i<leftSize) {
			  arr[k]=left[i];
			  i++; k++;
		  }
		  
		  while(j<rightSize) {
			  arr[k]=right[j];
			  j++; k++;
		  }
	  }
	  
	  
	  
	  
	  
     public static void main(String[] args) {
		int arr[]=  { 12, 11, 13, 5, 6, 7 };
		System.out.println("before:"+Arrays.toString(arr));
	    divide(arr,0,arr.length-1);
		System.out.println("after: "+Arrays.toString(arr));
      
     }
	
	
}

*/