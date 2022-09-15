package binarySearch;

public class FIrstAndLastOccurence {
	
      public static void main(String[] args) {
		int arr[] = {2,2,2,2,4,4,4,10,10,10,10,18,20,20} ;
		System.out.println(findFirst(arr,20));
		System.out.println(findFirst1(arr,20));
		
		System.out.println(findLastt1(arr,20));
	  }
      // here we have dont create a variable for storing the result , we just change the (<=  -> <)
      //inside the while loop , and keep our search place [start,mid] when we got any matched key .
      //so when start == end means there is a answer of this question
      
      //but this approach is showing wrong result , when there is no key exist , so 2nd one is better 
      //to keep a res varible to store the result
      
      static int findFirst(int[] arr,int key) {
    	  int start = 0 ; int end = arr.length - 1 ;
    	  
    	  while(start < end) {
    		  int mid = start + (end - start) / 2 ;
    		  
    		  if(key == arr[mid]) {
    			  end = mid ;
    		  }else if(key < arr[mid]) {
    			  end =  mid -  1 ; ;
    		  }else {
    			  start = mid +  1 ;
    		  }
    	  }
    	  return end ;
      }
    // this approach is workng well  
      static int findFirst1(int[] arr,int key) {
    	  int start = 0 ; int end = arr.length - 1 ;
    	  int res =  -1 ;
    	  while(start <= end) {
    		  int mid = start + (end - start) / 2 ;
    		  
    		  if(key == arr[mid]) {
    			  res = mid ;
    			  end = mid -1  ;            // decrease the search place and search within this .
    		  }else if(key < arr[mid]) {
    			  end =  mid -  1 ; ;
    		  }else {
    			  start = mid +  1 ;
    		  }
    	  }
    	  return res ;
      }
      
   //last occurance   
   // this approach is workng well   // just change the search place to (mid,end] after getting the key 
      static int findLastt1(int[] arr,int key) {
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
    	  return res ;
      }
}
