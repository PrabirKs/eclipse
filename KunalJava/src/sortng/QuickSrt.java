package sortng;
import java.util.*;

public class QuickSrt {
	static void qsort(int[] arr,int low,int high) {
		if(low>=high) {
			return;
		}
		int s=low; int e=high;
		int m=s+(e-s)/2;
		int pivot=arr[m];
		while(s<=e) {
			while(arr[s]<pivot) {
				s++;
			}
			while(arr[e]>pivot) {
				e--;
			}
			//when the above while not get sufficient condition to be carried on it reached to two element which is smaller 
			//but lies in the end side and another is bigger but lies in the left start side; 
			
			if(s<=e) {                    //this will swap the two values 
				int temp=arr[s];
				arr[s]=arr[e];
				arr[e]=temp;
				s++;  
				e--;
				System.out.println((Arrays.toString(arr))) ;
			}
			
		}
		print(arr,low,e) ;
		System.out.print("--- ");
		print(arr,s,high) ;
		System.out.println();
		qsort(arr,low,e);     //then this same operation will be carried out on two part
		qsort(arr,s,high);
	}
	
	static void print(int[] arr,int start,int end) {
		for(int i=start; i <= end ; i++)
			System.out.print(arr[i]+ " ");
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {8,4,13,5,6,1};
		
		System.out.println(Arrays.toString(arr));
		
		qsort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
