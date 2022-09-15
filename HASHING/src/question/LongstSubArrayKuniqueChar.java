package question;
import java.util.*;
public class LongstSubArrayKuniqueChar {

	public static void main(String[] args) {
	   char[] arr= {'a','a','b','c','b','c','d','b','c','a' } ;
	   int arr2[] = {1,2,1,2,3} ;
	   int k = 2 ;
	   //System.out.println(Longest(arr,k));
	   
	   System.out.println(atMostK(arr,arr.length,k));
	}
    static int Longest(char arr[] , int k) {
    	int i = 0 ; int j = 0 ; int maxLength = -1 ;
    	HashMap<Character,Integer> map =  new HashMap<>() ;
    	
    	while(j<arr.length) {
    		//calculation
    		map.put(arr[j],map.getOrDefault(arr[j],0) + 1) ;
    		
    		//condition
    		if(map.size() < k) {
    			j++ ;
    		}
    		else if(map.size() == k) {
    		   maxLength = Math.max(maxLength, j-i+1) ;
    		   j++ ;
    		}
    		else if(map.size() > k) {
    			while(map.size() > k) {
    				map.put(arr[i] , map.get(arr[i]) -1 ) ; //reducing the freq
    				if(map.get(arr[i]) == 0) { //means the element is not within the window
    					map.remove(arr[i]) ;   // so remove it , to maintain the map size
    				}
    				i++ ;
    			}
    			j++ ;
    		}
    	}
    	return maxLength ;
    }
    
    private static int atMostK(char arr[], int n, int k)
    {
 
        // To store the result
        int count = 0;
 
        // Left boundary of window
        int left = 0;
 
        // Right boundary of window
        int right = 0;
 
        // Map to keep track of number of distinct
        // elements in the current window
        HashMap<Character, Integer> map = new HashMap<>();
 
        // Loop to calculate the count
        while (right < n) {
 
            // Calculating the frequency of each
            // element in the current window
            map.put(arr[right],
                    map.getOrDefault(arr[right], 0) + 1);
 
            // Shrinking the window from left if the
            // count of distinct elements exceeds K
            while (map.size() > k) {
                map.put(arr[left], map.get(arr[left]) - 1);
                if (map.get(arr[left]) == 0)
                    map.remove(arr[left]);
                left++;
            }
            //naturally when map.size() < k || == k but whenm  size > k , then
            //calculation will be done above and , make the i and j at right
            //place where the subarray has k distinct element 
            // Adding the count of subarrays with at most
            // K distinct elements in the current window
            count += right - left + 1;
            right++;
        }
        return count;
    }
 
}
