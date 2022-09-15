package questions;

import java.util.*;

public class NerstGrtrToLeft {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++) {
        	arr[i]= sc.nextInt();
        }
        int[] res =findd(arr,n);
        
        for(int x:res) {
        	System.out.print(x+" ");
        }

	}
	
	public static int[] find(int[] arr, int n) {
		//ArrayList<Integer> list = new ArrayList<>();
	    int res[] = new int[n];
		int count=-1; 
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<n;i++) {              // every thing is same we just run the loop from the beginning
			if(st.isEmpty()) {
				//list.add(-1);
				res[++count]=-1;
			}
			else if(!st.isEmpty() && st.peek()>arr[i]) {
				//list.add(st.peek());
				res[++count]=st.peek();
				
			}
			else if(!st.isEmpty() && st.peek()<=arr[i]) {
				while(!st.isEmpty() && st.peek()<arr[i]) {
					st.pop();
				}
				if(st.isEmpty())
				//	list.add(-1);
				    res[++count]=-1;
				else
					//list.add(st.peek());
				   res[++count]=st.peek();
			}
			st.push(arr[i]);
		}
		return res;
	}  
	
	
	public static int[] findd(int[] arr, int n) {
		int res[] = new int[n];
		int count=-1;
		Stack<Integer> st = new Stack<>();
	    for(int i = 0 ; i < n ; i++) {	
	       while(!st.isEmpty() && st.peek()<=arr[i]) {
		     st.pop();
	        }
	       if(st.isEmpty()) {
	    	 res[++count]=-1;
	        }
	      else {
	    	 res[++count] = st.peek() ;
	       }
	      st.push(arr[i]);
	   }
   return res;
  }
	
	
}
