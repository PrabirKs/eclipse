package question;
import java.util.*;
public class SmallestWindowContainngAllChar {

	public static void main(String[] args) {
		char[] s = {'A','B','C','D','E','A','B','C','E','A'} ;
		char[] p = {'A','A','C','E'} ;
		System.out.println(check(s,p));
	}
    
	static int check(char[] s , char[] p) {
		HashMap<Character,Integer> map = new HashMap<>() ;
	//	HashMap<Character,Integer> Smap = new HashMap<>() ;
		for(int i = 0 ; i < p.length ;i++) {
			map.put(p[i],map.getOrDefault(p[i],0) + 1) ;
		}
		
		int i = 0 ; int j = 0 ; int min = Integer.MAX_VALUE ; int size = map.size() ;
		while(j < s.length) {
			//calculation
			if(map.containsKey(s[j])) {
				map.put(s[j], map.get(s[j]) -1 ) ;
				if(map.get(s[j]) == 0) {
					size-- ;
				}
			}
			
			if(size>0) {
				j++ ;
			}
			else if(size == 0) {
				min = Math.min(min, j-i+1) ;
				while(size==0) {
					if(map.containsKey(s[i])) {
						map.put(s[i],map.getOrDefault(s[i], 0) + 1) ;
						if(map.get(s[i]) == 1) {
							size++ ;
						}
						
					}
					i++ ;
					if(size == 0) 
					min = Math.min(min, j-i+1) ;
				}
				j++ ;
			}
		}
		return min ;
	}
	
	//for string and printing the substring also
	static void check(String s , String p) {
        int start = 0 ; int end = 0 ;
		HashMap<Character,Integer> map = new HashMap<>() ;
	//	HashMap<Character,Integer> Smap = new HashMap<>() ;
		for(int i = 0 ; i < p.length() ;i++) {
			map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0) + 1) ;
		}
		
		int i = 0 ; int j = 0 ; int min = Integer.MAX_VALUE ; int size = map.size() ;
		while(j < s.length()) {
			//calculation
			if(map.containsKey(s.charAt(j))) {
				map.put(s.charAt(j), map.get(s.charAt(j)) -1 ) ;
				if(map.get(s.charAt(j)) == 0) {
					size-- ;
				}
			}
			
			if(size>0) {
				j++ ;
			}
			else if(size == 0) {
				if(j-i+1<min){
                     start = i ;
                     end  = j ;
                    min = j-i+1 ;
                  }
				while(size==0) {
					if(map.containsKey(s.charAt(i))) {
						map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0) + 1) ;
						if(map.get(s.charAt(i)) == 1) {
							size++ ;
						}
						
					}
					i++ ;
					//in case there is extra char is in the string having -minus freq, so when
					//i will start removing from the left, when got a situation for size==0, it will
					//also calculate it .
					if(size == 0) 
					if(j-i+1<min){
                     start = i ;
                     end  = j ;
                    min = j-i+1 ;
                  }
				}
				j++ ;
			}
		}
      System.out.print(s.substring(start,end+1)) ;
		return ;
	}
}
