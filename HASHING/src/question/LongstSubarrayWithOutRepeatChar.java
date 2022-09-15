package question;
import java.util.*;
public class LongstSubarrayWithOutRepeatChar {

	public static void main(String[] args) {
		char[] arr = {'a','b','c','c','d','e','g','e','j','k','l','m'} ;
		System.out.println(longest(arr));
		System.out.println(longest2(arr));

	}
	//checking the map size as a condition , that if the map size is == j - i + 1
	//means the map has  all unique numbers and if the map contains lee
    static int longest(char[] arr) {
    	int i = 0 ; int j = 0 ; int maxLength = -1 ;
    	HashMap<Character,Integer> map = new HashMap<>() ;
    	while(j < arr.length) {
    		map.put(arr[j],map.getOrDefault(arr[j],0)+1)  ;
    		
    		if(map.size() == j-i+1) {
    			maxLength = Math.max(maxLength,j-i+1) ;
    			j++ ;
    		}
    		else if(map.size() < j - i + 1) {
    			while(map.size() != j - i +1) {
    				if(map.get(arr[i])>1) {
    					map.put(arr[i], map.get(arr[i]) -1 ) ;
    					i++ ;
    				}else {
    					map.remove(arr[i]) ;
    					i++ ;
    				}
    			}
    			j++ ;
    		}
    	}
    	return maxLength ;
    }
    
    static int longest2(char[] arr) {
    	int i = 0 ; int j = 0 ; int maxLength = -1 ;
    	HashMap<Character,Integer> map = new HashMap<>() ;
    	while(j < arr.length) {
    		map.put(arr[j],map.getOrDefault(arr[j],0)+1)  ;
    		
    		if(map.get(arr[j]) <= 1) {
    			maxLength = Math.max(maxLength,j-i+1) ;
    			j++ ;
    		}
    		else if(map.get(arr[j]) > 1) {
    			while(map.get(arr[j]) > 1) {
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
}
