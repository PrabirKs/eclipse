package binarySearch;

public class CountOfElement {

	public static void main(String[] args) {
		int arr[] = {2,2,2,2,4,4,4,10,10,10,10,10,10,18,20,20} ;
		System.out.println(findFirstLastt(arr,10));

	}
   
	  static int findFirstLastt(int[] arr,int key) {
		  
		  //find the last occurance 
    	  int start = 0 ; int end = arr.length - 1 ;
    	  int res =  -1 ;
    	  while(start <= end) {
    		  int mid = start + (end - start) / 2 ;
    		  
    		  if(key == arr[mid]) {
    			  res = mid ;
    			  start = mid + 1  ;            // decrease the search place and search within this .
    		  }else if(key < arr[mid]) {
    			  end =  mid -  1 ; ;
    		  }else {
    			  start = mid +  1 ;
    		  }
    	  }
    	  
    	  int last =  res ;  res = -1 ;
  
          //find the first occurance
    	  
    	  start = 0 ;  end = arr.length ;
    	  while(start <= end) {
    		  int mid = start + (end - start) / 2 ;
    		  
    		  if(key == arr[mid]) {
    			  res = mid ;
    			  end = mid -1   ;            // decrease the search place and search within this .
    		  }else if(key < arr[mid]) {
    			  end =  mid -  1 ; ;
    		  }else {
    			  start = mid +  1 ;
    		  }
    	  }
    	  int first =  res ;
      
	     return last -  first + 1 ;    //count of the number
  }
	  
}
