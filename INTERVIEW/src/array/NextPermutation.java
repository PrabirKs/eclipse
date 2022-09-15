package array;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		int[] pr= {1,3,5,4,2} ;
		nxtprmtn(pr) ;
		System.out.println(Arrays.toString(pr));
	}
	// n = 1 3 5 4 2 
    static void nxtprmtn(int[] pr) {
    	if(pr==null && pr.length==1) return ;
    	
    	int i = pr.length - 2 ; //start check from the second last elmnt to the next elmnt
    	
    	while(i>=0 && pr[i]>=pr[i+1])  i-- ;  //now i is at the elmnt which break the sequence  //3
    	
    	if(i>=0) {
    		int j = pr.length - 1 ;
    		while(pr[j]<=pr[i]) j-- ;  // now j is at the element//(4) which is just greater than the pr[i] (3), 
    	
    		swap(pr,i,j) ;             // now swap the values and
    	}
    	reverse(pr,i+1,pr.length-1);   // make the numbers after i+1 to increasing order from the left ;
    }
   static void swap(int[] pr,int i ,int j) {
	   int temp = pr[i] ;
	   pr[i] = pr[j] ;
	   pr[j] = temp ;
   }
   
   static void reverse(int[] pr , int i , int j) {
	   while(i<j)
		 swap(pr,i++,j--);
	 }
}
