package hashTable;

import java.util.HashMap;
import java.util.Scanner;

public class HashQues1 {


	public static void main(String[] args) {
	
		 Scanner input = new Scanner(System.in);
	    
	        int n = input.nextInt();
	        int target = input.nextInt();
	        int a[] = new int[n];
	        for(int i= 0; i < n; i++){
	          a[i] = input.nextInt();
	        }
	       System.out.println(countPairs(a,n,target));
	}
	
	static int countPairs(int array[],int n,int target) {
		int count=0;                  //initially the count is zero
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();    // (elements-->frequency)             //create a hash map of integer and integer
		
		for(int j=0;j<n;j++) {   //fixing  a value and checking its pair below in the hashmap
			
			int pairElement = target - array[j];                                       // find the second pair i.e 6=5+1 , keeping 5 fixed , second one is 6-5=1
			
			int freqOfParElmnt = map.getOrDefault(pairElement,0);        //by default the map not have any value so it will return zero as default value         //find the existance of that element in the table if , yes then return 
			
			count = count + freqOfParElmnt;          //keep track of how many number available
			
			map.put(array[j],  map.getOrDefault(array[j],0) + 1);   //it will set at every a[j] value to 1,and at any conddition  a pair value search for it on above statemeant he will get 1 and add 1 to cont
		    if(freqOfParElmnt>0) {
				map.remove(array[j]);
			}
		
		}
		
		return count;
	}

}
