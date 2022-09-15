package question;
import java.util.*;
public class FindAllAnagrams {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in) ;
		 
	     String s = "abaabaa";
 		 
		
		
		 String p = "aaba" ;
         List<Integer> list = new ArrayList<>() ;
        list =  findAnagrams(s,p) ;
        System.out.println(list);
          

	}
	  static List<Integer> findAnagrams(String s, String p) {
	        List<Integer> ans = new ArrayList<>();

	        HashMap<Character,Integer> m = new HashMap<>();
	        
	        //put all elements of pttrn p in map
	        for(int i=0;i<p.length();i++){
	           m.put(s.charAt(i) , m.getOrDefault(s.charAt(i),0) + 1) ;
	        }
	        int count = m.size();  // keep the count of the distinct element for matching
	        int i=0,j=0;
	        while(j<s.length()){
	            //calculations
	            if(m.containsKey(s.charAt(j))){ // if the elmnt is at pattern / map
	            	
	                m.put(s.charAt(j),m.get(s.charAt(j))-1);  //then  we got one , so just freq - 1 is left to match for a elmnt
	                if(m.get(s.charAt(j))==0){       //during updation if a elmnt freq has reduced to 0  ,means we have now count  -1 distinct elmnt left to match
	                    count--;  // so c =  c - 1 ;
	                }
	            }
	            //window size less than k
	            if(j-i+1<p.length()) {
	                j++;      //untill the (window_size < pattern_length)
	            }
	            else if(j-i+1==p.length()){  //when we got a pattern length window we check whether is is a answer or not
	                //ans calculate
	                      if(count==0){
	                         ans.add(i);
	                        //count  == 0  means that we have the window that has
	                        // same count of the element as that of the pattern
	                      }
	                      //if the s[i] is at map and we have just update their freq during matching
	                      //we have to make it as before -1 (before) so (+1) now
	                      if(m.containsKey(s.charAt(i))){ 
	                         m.put(s.charAt(i), m.get(s.charAt(i)) + 1 ) ;
	                         
	                           //the moment when its start appear in the map , make the count++
	                           if(m.get(s.charAt(i))==1)
	                             count++;   // it keep track of the unmatched distinct elemnt in the map for pattern
	                      }
	                i++;  //move the window a step forward // when window is of pattern size
	                j++;
	            }
	        }
	        return ans;
	    }

}
