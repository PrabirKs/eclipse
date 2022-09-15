package sortng;

import java.util.Arrays;

public class SelectionSort {
    static void SelectionSort(int[] arr) {
    	for(int i=0;i<arr.length;i++) {
    		for(int j=i+1;j<arr.length;j++) {
    			if(arr[j]<arr[i]) {
    				
    				int temp=arr[j];                         //unnecessary swap operation
    				arr[j]=arr[i]; 
    				arr[i]=temp;
    			}
    		}
    		
    	}
    }
    
    
    static void SelctionSort(int[] arr) {
    	for(int i=0;i<arr.length;i++) {
    		 int max=0;                                  //solution
    		for(int j=1;j<arr.length-i;j++) {
    			//System.out.println(" i = " + i + " j = " + j);
    			  if(arr[j]>arr[max]) {
    				    max = j; 
    				  System.out.println(" i = " + i + " j = " + j);
    			      }	
    			  
    		      }
    		   int temp = arr[max];
			   arr[max]=arr[arr.length-1-i];
			   arr[arr.length-1-i]=temp;
               
				System.out.println(i+":"+Arrays.toString(arr));

    		  }
    
    }
   
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,10,36,29,11,5};
		System.out.println("before:"+Arrays.toString(arr));
		SelctionSort(arr);
		System.out.println("after: "+Arrays.toString(arr));
	}

}
