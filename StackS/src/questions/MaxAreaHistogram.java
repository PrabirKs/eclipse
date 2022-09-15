package questions;

import java.util.*;

public class MaxAreaHistogram {
    static class Pair{
    	int first, second;
    	Pair(int first, int second){
    	    this.first= first;
    	    this.second= second;
    	}
    }
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	        int n= sc.nextInt();
	        int[] arr = new int[n];
	        
	        for(int i=0;i<n;i++) {
	        	arr[i]= sc.nextInt();
	        }
	       System.out.println(maxRect(arr,n));
		}
	 public static int maxRect(int[] arr, int n) { 
	    ArrayList<Integer> left,right,res = new ArrayList<Integer>();
	    left= nerstSmallerLeft(arr, n);
	    right= nerstSmallerRight(arr,n);
	    int max=Integer.MIN_VALUE;
	    for(int i=0;i<n;i++) {
	    	res.add(arr[i]*((right.get(i) - left.get(i))-1));
	    	if(res.get(i)>max)
	    		max=res.get(i);
	    }
        return max;
	 }
	 public static ArrayList nerstSmallerLeft(int[] arr,int n) {
		ArrayList<Integer> left = new ArrayList<Integer>();
		Stack<Pair>st = new Stack<Pair>();
		
		for(int i=0;i<n;i++) {
			if(st.isEmpty())
				left.add(-1);
			else if(!st.isEmpty() && st.peek().first<arr[i]) {
				left.add(st.peek().second);
			}
			else if(!st.isEmpty() && st.peek().first>=arr[i]) {
               while(!st.isEmpty() && st.peek().first>=arr[i]) {
            	   st.pop();
               }
               if(st.isEmpty())
            	   left.add(-1);
               else
            	   left.add(st.peek().second);
			}
			st.push(new Pair(arr[i],i));
		}
	
		return left;
	 }
	 
	 public static ArrayList nerstSmallerRight(int[] arr,int n) {
			ArrayList<Integer> right = new ArrayList<Integer>();
			Stack<Pair>st = new Stack<Pair>();
			
			for(int i=n-1;i>=0;i--) {
				if(st.isEmpty())
					right.add(n);
				else if(!st.isEmpty() && st.peek().first<arr[i]) {
					right.add(st.peek().second);
				}
				else if(!st.isEmpty() && st.peek().first>=arr[i]) {
	               while(!st.isEmpty() && st.peek().first>=arr[i]) {
	            	   st.pop();
	               }
	               if(st.isEmpty())
	            	   right.add(n);
	               else
	            	   right.add(st.peek().second);
				}
				st.push(new Pair(arr[i],i));
			}
			
			Collections.reverse(right);
			return right;
		 }
 }

//we can also use array to store the result ,
//and  i think pair is also not necessery we just can add indexes .
//and no need to store the area result also we can directly take their maximum