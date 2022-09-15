package question;
import java.util.*;
public class FirstNegativeNumber {

	public static void main(String[] args) {
		int k = 3 ;
		int arr[] = {12,-1,-7,8,-15,30,16,28} ;
		System.out.println(firstNegativeFind(arr,k));
		System.out.println(firstNegativeFind2(arr,k));

	}

    static List<Integer> firstNegativeFind(int[] arr, int k) {
		List<Integer> ans = new ArrayList<Integer>() ;
		List<Integer> negatives = new ArrayList<Integer>() ;
		
		int i = 0 , j = 0 ;
		while(j < arr.length) {
			//calculation
		   if(arr[j] < 0) {
			   negatives.add(arr[j]) ;
		   }
		   
		   //if window size is small
		   if(j-i+1 < k) {
			   j++ ;
		   }
		   else if(j-i+1 == k) {
			   if(!negatives.isEmpty()) {
				   ans.add(negatives.get(0)) ;
			   }else {
				   ans.add(0) ;
			   }
			   if(!negatives.isEmpty() && arr[i] == negatives.get(0)) {
				   negatives.remove(0) ;
			   }
			   i++ ;
			   j++ ;
		   }
		}
        return ans;
	}

    static List<Integer> firstNegativeFind2(int[] arr, int k){
    	List<Integer> ans = new ArrayList<Integer>() ;

    	int i = arr.length - 1 ;
    	int j = arr.length - 1 ;
    	
    	int index = Integer.MAX_VALUE , negative = -1 ; 
    	while(j >= 0) {
    		if(arr[j] < 0) {
    			negative = arr[j] ;
    			index = j ;
    		}
    		
    		if(i-j+1 < k) {
    			j-- ;
    		}else if(i - j + 1 == k) {
    			if(index > i) {  //no -ve [i,j] means the prev -ve no found is out side the window
    				ans.add(0) ;
    			}else {
    				ans.add(negative) ;
    			}
    			i-- ; j-- ;
    		}
    	}
    	Collections.reverse(ans) ;
    	return ans ;
    }
}
