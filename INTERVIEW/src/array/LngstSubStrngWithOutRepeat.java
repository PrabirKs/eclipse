package array;
import java.util.*;
public class LngstSubStrngWithOutRepeat {

	public static void main(String[] args) {
		char arr[]= {'a','b','c','a','a','b','c','d','b','a'};
        System.out.println(calaculate3(arr));
	}

	private static int calculate(char[] arr) {
		int MaxLength = 0 ;
		for(int i = 0 ; i < arr.length ; i++) {
			Set<Character> set =  new HashSet<>() ;
			for(int j = i ; j < arr.length ; j++ ) {
				if(set.contains(arr[j])) {
					MaxLength = Math.max(MaxLength, j-i) ;
					break ;
				}
				set.add(arr[j]) ;
			}
		}
	    return MaxLength ;
	}

  
//this leads to a time complexity of n^2 and space complexity of o(1)

// optimise to by using hashmap and the 2 pointer
	//'a','b','c','a','a','b','c','d','b','a'
      private static int calculate2(char[] arr) {
	    int MaxLength = 0 ;
        Set<Character> set =  new HashSet<>() ;
        int i = 0 , j = 0 ;
        while(j<arr.length) {
        	if(set.contains(arr[j])) {
        		while(set.contains(arr[j])){
        			set.remove(arr[i]) ;
        			i++ ;
              	}
        	}	
        	set.add(arr[j]) ;
        	j++ ;
        	MaxLength = Math.max(MaxLength, j - i) ;
        }
        return MaxLength ;
    }
   //   Tc : O(2n) sc: O(n)
   //   best approach : on prev approach each time we found a duplicate we have to move
   // the i to that character , where it locates we have to travel till that . but if 
   // we have the index of that duplct element is present then we can directly move to
   //that index , it will save a time of n. in case of we found a duplicate at j = 8 and 
   // and another duplct elemnt is present just before it , then we have to move the i
   // fromm 0 -> j-i but its not necessery , if we have the index then we can directly move to it,.
 
   static int calaculate3(char[] arr) {
	   int maxLength = 0 ;
	   int j = 0 ;
	   HashMap<Character,Integer> set =  new HashMap<>() ;
	   for(int i = 0 ; i < arr.length ; i++) {
		   if(set.containsKey(arr[i]) && set.get(arr[i])>j) {
			   maxLength = Math.max(maxLength,i-j) ;
			   j = set.get(arr[i])+1 ;
		   }
		   set.put(arr[i],i) ;
	   }
	   return maxLength ;
   }

}
