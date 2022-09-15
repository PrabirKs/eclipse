package recursionKK;

import java.util.Arrays;

public class SlctnSrtRecrsn {

	public static void main(String[] args) {
        int arr[]= {4,3,2,1,8,9,10,15,11};
		
		System.out.println("before:"+Arrays.toString(arr));
        SelctnSortRcrsn(arr,arr.length-1,0,0);
       // SsortRcrsn(arr,arr.length,0,0);
 		System.out.println("after: "+Arrays.toString(arr));
	}
   
	//here the arr.length -1 is passed , 
	static void SelctnSortRcrsn(int[] arr , int length, int i,int max) {
         if(length==0) return ;
         
         if(i<=length) {
        	 if(arr[i]>arr[max]) {
        		 max=i ;
        	 }
        	 SelctnSortRcrsn(arr,length,i+1,max);
         }else {

        	 swap(arr,length,max) ;
        	 
        	 SelctnSortRcrsn(arr,length-1,0,0) ;
         }
   	}
	
	
	
	
	
	static void swap(int[] arr ,int i ,  int max) {
		int temp = arr[max] ;
		arr[max] = arr[i] ;
		arr[i] = temp ;
	}
}
