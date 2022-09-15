package leetcode;

public class SecondsToRemoveOccurrences {
 //chanege all occurance of the 01 with 10 , untill a single occurence is not left
	//return the no of time the string must be set to the operation
	//at one go just can change the existing 01 not dynamically modfied thing
	public static void main(String[] args) {
		int i = secondsToRemoveOccurrences("01011011010") ;
		 System.out.println(i);

	}
	static int secondsToRemoveOccurrences(String s) {
	    char arr[] = new char[s.length()] ;
	    for(int i = 0 ; i < s.length() ; i++){
	        arr[i] = s.charAt(i) ;
	    }
	    int check = 0 ; int count = 1 ;
	    int i= 0 ; int j = 1 ;
	    while(count!=0){
	        count = 0 ; j = 1 ; i = 0 ;
	     while(j < arr.length){
	    	 
	        if(arr[i]=='0' && arr[j]=='1'){
	            count++ ; 
	            //swapping the values
	            char temp = arr[i] ;
	            arr[i] = arr[j] ;
	            arr[j] = temp ;
	            
	            if(j+2 < arr.length){
	                j+=2 ; i+=2 ;      // if found a pattern then jumping to the next after them for check
	            }else break ;
	     
	        }else{
	            i++ ; j++ ;
	         }
	        
	    }
	     check ++ ;; 
	  }
	    return check -1  ;
	}
}
