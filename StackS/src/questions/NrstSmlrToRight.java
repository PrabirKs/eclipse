package questions;
import java.util.*;
public class NrstSmlrToRight {
	
	public static int[] findres(int[] arr, int n) {
		int[] res= new int[n];
		Stack<Integer> st = new Stack<>();
		int count=-1;
		
		for(int i=n-1; i>=0 ; i--) {
			if(st.isEmpty()) {
		       res[++count] = -1;
			}
           
			else if(!st.isEmpty() && st.peek()<=arr[i]) {
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
        
        int[] res =findres(arr,n);
        //print reversly
         for(int i=n-1;i>=0;i--) {
        	System.out.print(res[i]+" ");
        }
         
         System.out.println(Arrays.toString(smallerRight2(arr,n)));
	}
	
	static int[] smallerRight(int[] arr,int n) {
		int res[] = new int[n]; int count = n ;
		Stack<Integer> st = new Stack<>();
		
		for(int i = n-1 ; i >= 0 ; i--) {
			while(!st.isEmpty() && st.peek()>=arr[i]) st.pop() ;
			
			if(st.isEmpty()) res[--count] = -1 ;
			else res[--count] = st.peek() ;
			
			st.push(arr[i]) ;
		}
		return res ;
	}
	
	static int[] smallerRight2(int[] arr , int n) {
		int res[] = new int[n] ; int count = n;
		Stack<Integer> st =  new Stack<>() ;
		for(int i = n-1 ; i >= 0 ; i--) {
		while(!st.isEmpty() && arr[st.peek()]>=arr[i]) st.pop() ;  //untill stack became empty and top value is greater than arr[i]

		if(st.isEmpty())  res[--count] = -1 ;                 //if stack is empty then push -1
		else res[--count] = st.peek();                        //else push the top value which is now bigger than arr[i]
		
		st.push(i) ;                                     //push the current element
	 } 
		return res ;
   }

}
