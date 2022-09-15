package questions;

import java.util.Scanner;
import java.util.Stack;

public class HistoGram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++) {
        	arr[i]= sc.nextInt();
        }
       System.out.println(maxRect(arr,n));
    }
	
	static int maxRect(int[] arr,int n) {
		int maxarea = Integer.MIN_VALUE ;
		int smallLeft[] = minLeft(arr,n);
		int smallRight[] = minRight(arr,n);
		
		for(int i = 0 ; i < n ; i++) {
			int height = arr[i] ;
			int width = (smallRight[i] - smallLeft[i]) - 1 ;
			int area = width * height ;
			maxarea = Math.max(area,maxarea) ;
		}
		return maxarea ;
	}
	static int[] minLeft(int[] arr , int n) {
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
	
	static int[] minRight(int[] arr , int n) {
		int res[] = new int[n] ; int count = n;
		Stack<Integer> st =  new Stack<>() ;
		for(int i = n-1 ; i >= 0 ; i--) {
		while(!st.isEmpty() && arr[st.peek()]>=arr[i]) st.pop() ;  //untill stack became empty and top value is greater than arr[i]

		if(st.isEmpty())  res[--count] = n ;                 //if stack is empty then push -1
		else res[--count] = st.peek();                        //else push the top value which is now bigger than arr[i]
		
		st.push(i) ;                                     //push the current element
	 } 
		return res ;
   }

}
