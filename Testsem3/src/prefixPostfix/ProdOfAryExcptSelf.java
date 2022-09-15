package prefixPostfix;
import java.util.*;
public class ProdOfAryExcptSelf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
	    int n = sc.nextInt() ;
	    int[] nums = new int[n] ;
	  
	    for(int i = 0 ; i < nums.length ; i ++){
	      nums[i] =  sc.nextInt() ;
	    }
	    
	    int[] arr = new int[n];
	    arr = productExceptSelf(nums) ;
	    
	    for(int  i = 0 ; i < arr.length ; i ++)
	    	
	     System.out.print(arr[i] + " ") ;
	  }
		 static int[] PproductExceptSelf(int[] nums) {
			 int n = nums.length ;
			 int[] left = new int[n] ;
			 int[] right =  new int[n];
			 int product = 1 ;
			 for(int i = 0 ; i < n ; i++) {
				 left[i] = nums[i] * product ;
				 product = left[i] ;
			 }
			 product = 1 ;
			 for(int i= n-1 ;i>=0 ;i--) {
				 right[i] = nums[i] * product ;
				 product = right[i] ;
			 }
			 
			 int[] res = new int[n] ;
			 
			 res[0] = right[1] ;
			 res[n-1] = left[n-2];
			 
			 for(int i = 1 ; i < n-1 ; i++) {
				 res[i] = left[i-1] * right[i+1] ;
			 }
			 return res ;
		 }
		 
		 static int[] productExceptSelf(int[] nums) {
			 int n = nums.length ;
		     int[] product = new int[n] ;
		     
		     product[0] = 1 ;
		     
		     for(int i = 1 ; i < n ; i++) {
		    	 product[i] = nums[i-1] * product[i-1] ;
		     }
		     
		     int suffixProd = 1 ;
		     
		     for(int i = n-1 ; i>=0 ; i--) {
		    	 product[i] = product[i] * suffixProd ;
		    	 suffixProd = suffixProd * nums[i] ;		 
		     }
		     return product ;
		 }
		 
}




