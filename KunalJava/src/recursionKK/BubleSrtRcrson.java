package recursionKK;

import java.util.Arrays;

public class BubleSrtRcrson {

	public static void main(String[] args) {
		int arr[]= {12,3,80,8,23,5,9,6,7};
		
		System.out.println("before:"+Arrays.toString(arr));
		BubbleSortRcrsn(arr,arr.length-1,0);
		System.out.println("after: "+Arrays.toString(arr));


	}
    static void BubbleSortRcrsn(int[] arr,int length , int i) {
    	if(length==0) return ;
    	
    	if(i<length) {
    		if(arr[i]>arr[i+1]) {
    	       int temp = arr[i] ;
    	       arr[i] = arr[i+1] ;
    	       arr[i+1] = temp ;
    	       }
    		BubbleSortRcrsn(arr,length,i+1) ;
      }	
    	else {
    			BubbleSortRcrsn(arr,length-1,0);
    		}
    } 
}
