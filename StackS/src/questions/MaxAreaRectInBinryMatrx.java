package questions;
import java.util.*;
public class MaxAreaRectInBinryMatrx {
  static class pair{
	  int first,second;
	  pair(int first, int second){
		  this.first = first;
		  this.second = second;
	  }
  }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int[][] arr = new int[i][j];
		
		for(int k = 0 ; k < i ; k++) {
			for(int l = 0; l<j ; l++) {
				arr[k][l]=sc.nextInt();			}
		   }
       System.out.println(find(arr));

	}
	
	public static int find(int[][] arr) {   // this function will give the final result
		int length=  arr[0].length ;
		int histogram[] = new int[length];   // create a histogram array to put each row and pass it to the MAH functoin to get the max area rectangle possible
		
		int max = Integer.MIN_VALUE;
		
	 for(int j = 0;j<arr.length;j++) {   // make each row with addition to the previous rows except on 0 and then pass the resultant row to the operation
		for(int i=0;i<length;i++) {
			if(arr[j][i]==0)
				histogram[i]=0;
			else
			histogram[i] = histogram[i] + arr[j][i];   // initially [0,0,0...] histogram
		}
		max= Math.max(max,maxAreaHisto(histogram,length));   // pass it to MAH
	 }	

	  return max;
	}
	
	public static int maxAreaHisto(int[] histo, int length) {       // this function calculate the max area possoble and return the res for each row
		ArrayList<Integer> left, right , res = new ArrayList<Integer>();  // to find this we have to know how many bars are greater in left and right
		left = smlstInLeft(histo,length);       // by this functoin we will achieve this, the index of the smallest left element for each element returned to it
		right= smalstInRight(histo,length);     //the index of the smallest right element for each element returned to it
		int maximum = Integer.MIN_VALUE;
		for(int i =0;i<length;i++) {
		  res.add(histo[i] * (right.get(i)-left.get(i)-1));
		  if(res.get(i)>maximum)
			  maximum=res.get(i);
		}
		return maximum;
	}
	
	public static ArrayList smlstInLeft(int[] arr , int length) {
		ArrayList<Integer> left = new ArrayList<>();
		Stack<pair> st = new Stack<>();
		
		for(int i = 0; i<length;i++) {
			if(st.isEmpty()) {
				left.add(-1);
			}
			else if(!st.isEmpty() && st.peek().first < arr[i]) {
				left.add(st.peek().second);
			}
			else if(!st.isEmpty() && st.peek().first >= arr[i]) {
				while(!st.isEmpty() && st.peek().first>= arr[i]){
					st.pop();
				}
				if(st.isEmpty())
					left.add(-1);
				else
					left.add(st.peek().second);
			}
			st.push(new pair(arr[i],i));
		}
		
		return left;
	}
	
	public static ArrayList smalstInRight(int[] arr , int length) {
		ArrayList<Integer> right = new ArrayList<>();
		Stack<pair> st = new Stack<>();
		
		for(int i = length-1 ; i>=0;i--) {
			if(st.isEmpty()) {
				right.add(length);
			}
			else if(!st.isEmpty() && st.peek().first < arr[i]) {
				right.add(st.peek().second);
			}
			else if(!st.isEmpty() && st.peek().first >= arr[i]) {
				while(!st.isEmpty() && st.peek().first>= arr[i]){
					st.pop();
				}
				if(st.isEmpty())
					right.add(length);
				else
					right.add(st.peek().second);
			}
			st.push(new pair(arr[i],i));
		}
		
		Collections.reverse(right);
		
		return right;
	}
	

}
