package hashTable;
import java.util.*;
 // to find the longest common sub sequence i.e. [2,12,9,16,10,5,3,20,25,11,1,8,6]    // sub sequence [1,2,3] [5,6] [8,9,10,11,12] [16] [25] 
public class LongestCmnSeq{ 
      public static void main(String[] args) {
		                int arr[]= {2,12,9,16,10,5,5,3,20,25,11,1,8,6} ;
	
	                   System.out.println(findseq(arr)); 
     }
//---------------------------------------------------------------function--------------------------------------------------------------------//
	static ArrayList<Integer> findseq (int[] arr) {
		HashMap<Integer,Boolean> map= new HashMap<>();
		
		//storig all the start of the sequences with true value and rest to false
		for(int i=0;i<arr.length;i++) {
			//check if n-1 is present in the hsahmap or not, if present then 
			// this element cant be the start of a sequaence so make it FALSe
			
		  int nm1= arr[i]-1;
		  if(map.containsKey(nm1)) {    
			  map.put(arr[i],false) ;
		  }
		  else {
			  map.put(arr[i],true);
		  }
		
		
		// if the current element is the start of the sequence 
		//then n+1 cant be the start of the sequence
		
		int np1= arr[i] + 1;
		if(map.containsKey(np1)) {
			map.put(np1,false);
		}
    }	
         // create a array list to store all the keyset in the hashtable		
		
    	ArrayList<Integer> keys= new ArrayList<>(map.keySet());
    	
    	int maxlength= -1 ;
    	int maxStartingNo= 0 ;
    	
    	for(int key: keys) {                               //iterate over the arraylist for each key 
    		
    		if(map.get(key)==true) {    // select all the keys which are selected for to be the starting of the sequnce  , value is true
    			
    			int pstartingNo = key;    // store the starting no and check for the availability of next numbers in the hash map
    			int count=0;
    			while(map.containsKey(pstartingNo + count)) {    //lets startingno is 7 then it will look for 7+1=8 then 7+2=9
    				count++;
    			}
    			
    			if(count>maxlength) {            // if a sequence has max no of element then it will be catch here
    				maxlength=count;             // maxlength will be change here for track
    				maxStartingNo=pstartingNo;   // store the first element of the longest sunsequence
    			}
    		}
    	 }
    //create another arraylist to store all the element of the largest sequence and return it 	
    	ArrayList<Integer> maxSeq=new ArrayList<>();
    	for(int i=0;i<maxlength;i++) {       // iterate from the starting no to the length 
    		maxSeq.add(maxStartingNo + i);   // add value in the arraylist
    	}
	  return maxSeq;
	}
}
