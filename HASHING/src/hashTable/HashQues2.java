package hashTable;

import java.util.*;

//find the max frequency element
public class HashQues2 {


	public static void main(String[] args) {
		String str="abbcddsdefffffffffsbbcbb" ;
		
		System.out.println(MaxFreqChar(str));

	}
   private static char MaxFreqChar(String str) {
	   HashMap<Character,Integer> map= new HashMap<>();
	   
	   //store all the frequecy 
	   
	   for(int i=0;i<str.length();i++) {
		   
		   /*for(int i=0;i<n;i++){
		    * int prevFreq = map.getOrDefault(A[i] , 0);  //char array
		    * map.put(A[i], prevFreq+1);
		    * }
		    *   //can be done by this way but the curret , mentor doing in the below appraoch
		    */
		   char ch=str.charAt(i);
		   if(map.containsKey(ch)) {
			   int val=map.get(ch);
			   
			   map.put(ch, val+1);
		   }else {
			   map.put(ch,1);
		   }
	   }
	   //  the keyset fun basically gives you all the keys present in the hashtable
	   
	   Set<Character> keyset= map.keySet();
	   
	   int maxFreq= -10;    //set a negative freq 
	   
	   char maxChar = ' ';
	   
	   for(char key: keyset) {    //iterate ovre all the keyset
		   
		   if(map.get(key)>maxFreq) {    // check for highest freq
			   
			 maxFreq= map.get(key) ;     //get the max freq and upadate
			 
			 maxChar=key;                // assign the key
		   }
	   }
	   return maxChar;                  // return the key
   }
}
