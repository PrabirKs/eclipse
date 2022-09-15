package questions;

import java.util.*;

public class NrstSmlrTOLeft {
	public static int[] find(int[] arr, int n) {
		int[] res= new int[n];
		Stack<Integer> st = new Stack<>();
		int count=-1;
		
		for(int i=0 ; i<n ; i++) {
			if(st.isEmpty())
			res[++count] = -1;
           
			else if(!st.isEmpty() && st.peek()<arr[i]) {
				res[++count]= st.peek();
				}
			else if(!st.isEmpty() && st.peek()>arr[i]) {
				while(!st.isEmpty() && st.peek()>=arr[i]) {
					st.pop();
				}
				
				if(st.isEmpty())
					res[++count] = -1;
				else
					res[++count]= st.peek();
			}
		   st.push(arr[i]);
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++) {
        	arr[i]= sc.nextInt();
        }
        
        int[] res =smallerleft2(arr,n);
        int[] res2 =smallerleft(arr,n);
         for(int x:res) {
        	System.out.print(x+" ");
        }
         System.out.println(Arrays.toString(res2));
	}
	
	static int[] smallerleft(int[] arr , int n) {
		int res[] = new int[n] ; int count = -1 ;
		Stack<Integer> st =  new Stack<>() ;
		for(int i = 0 ; i < n ; i++) {
		while(!st.isEmpty() && st.peek()>=arr[i]) st.pop() ;  //untill stack became empty and top value is greater than arr[i]

		if(st.isEmpty())  res[++count] = -1 ;                 //if stack is empty then push -1
		else res[++count] = st.peek();                        //else push the top value which is now bigger than arr[i]
		
		st.push(arr[i]) ;                                     //push the current element
	 } 
		return res ;
   }
	
	static int[] smallerleft2(int[] arr , int n) {
		int res[] = new int[n] ; int count = -1 ;
		Stack<Integer> st =  new Stack<>() ;
		for(int i = 0 ; i < n ; i++) {
		while(!st.isEmpty() && arr[st.peek()]>=arr[i]) st.pop() ;  //untill stack became empty and top value is greater than arr[i]

		if(st.isEmpty())  res[++count] = -1 ;                 //if stack is empty then push -1
		else res[++count] = st.peek();                        //else push the top value which is now bigger than arr[i]
		
		st.push(i) ;                                     //push the current element
	 } 
		return res ;
   }


}
