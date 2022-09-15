package questions;

import java.util.*;

public class StockSpan {
    static class Pair{
    	 int first;
    	 int second;
    	 Pair(int first,int second){
    		 this.first=first;
    		 this.second=second;
    	 }
     }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++) {
        	arr[i]= sc.nextInt();
        }
         stock(arr,n);
     }

	public static  void stock(int[] arr, int n) {
		ArrayList<Integer> res = new ArrayList<>();
		Stack<Pair> st = new Stack<>();
		
		for(int i=0;i<n;i++) {
	     if(st.isEmpty()) {
	    	 res.add(-1);
	     }
	     else if(!st.isEmpty() && st.peek().first>arr[i]) {    // same as nearest greater element
	    	 res.add(st.peek().second);   // add the index in the res list
	     }
	     else if(!st.isEmpty() && st.peek().first<=arr[i]) {
	    	 while(!st.isEmpty() && st.peek().first<=arr[i]) {
	    		 st.pop();
	    	 }
	    	 
	    	 if(st.isEmpty()) {
	    		 res.add(-1);
	    	 }
	    	 else {
	    		 res.add(st.peek().second);    // add the index in the res list
	    	 }
	     }
	   	     st.push(new Pair(arr[i],i));      // after the operation add a new object with element and index
	  }
		for(int i =0 ;i<n;i++) {
			System.out.print(i - res.get(i) + " ");    // now the res list has all the index of the nearest greatest element in left 
			// now for a giben element the count of smaller element lies in left,is the differece of the index of this element and the 
			// index of neareest greatest elemnt.   100 80 60 70 60 75 85 , for 75= index =5  index of nearest greatest 80 is=1 => 5-1=4(ans) 
		}
  }
}
/*
 *   public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int a[] = new int[n + 1];
      a[0] = 2000000000;       // store a big valued at the 0th index to calculate for first value
      for(int i = 1; i <= n; i++){
        a[i] = input.nextInt();      // take input froom 1 based indexing
      }
      Stack<Integer> stack = new Stack();
      stack.push(0);                        // push 0 first , the first index
      for(int i = 1; i <= n; i++){
        while(a[stack.peek()] <= a[i]){
          stack.pop();
        }
        System.out.print((i - stack.peek()) + " ");
        stack.push(i);       // push the index after operation
      }
    }
 */
