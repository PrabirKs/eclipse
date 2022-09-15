package sortng;

import java.util.Arrays;
import java.util.Collections;

public class Bubble_sort {
	static void BubbleSort(int[] arr) {
		int temp;
		
		 for(int i=0;i<arr.length;i++) {
		    int flag=0;        
		   for(int j=0;j<arr.length-1-i;j++) {
			   System.out.println(" i = " + i + " j = " + j);

				  if(arr[j]>arr[j+1]) {
					   temp=arr[j+1];
					   arr[j+1]=arr[j];
					   arr[j]=temp;
					   flag=1;
				  }
			}
		//   System.out.println(Arrays.toString(arr));
		     	if(flag==0)  //lets suppose at some certain step the array get 
		     		//sorted so no need of running the loop again, thats why this
		     		//flag helps
		     		break;
	}
       
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,3,8,5,9,6,7};
		int arr[]= {36,29,12,5};

		System.out.println("before:"+Arrays.toString(arr));
		BubbleSort(arr);
		System.out.println("after: "+Arrays.toString(arr));

	}

}
