package accioJob;

import java.util.Arrays;
import java.util.Scanner;

public class Books {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();                    //get the n
	      int m=sc.nextInt();                    //get the number of student
	      int[] A=new int[n];                    
	      
	      for(int i=0;i<n;i++) {
	    	  A[i]=sc.nextInt();                //get no of chocolate in each packet
	      }
	      
        // System.out.println(chocolate(A,0,n-1));
	      chocolate(A,0,n-1);                            //first sort the array
	      
	    //  System.out.println(Arrays.toString(A));
	      int mindiff=Integer.MAX_VALUE;                //take a max value 
	      
	     for(int i=0;i<n-m+1;i++) {                 // it has n-m+1 no of pair to check
	    	 int res= A[i+m-1]-A[i];                //check for each pair that which have less difference in highest vlue and lowest value
	    	 if(res<mindiff) {
	    		 mindiff=res;
	    	 }
	     }
	      System.out.println(mindiff);
	}

	static void chocolate(int[] A,int start,int end) {
		if(start<end) {
		int mid=start+(end-start)/2;
		
		chocolate(A,start,mid);
		chocolate(A,mid+1,end);
			
		sort(A,start,mid,end);
		}
	}
	
	static void sort(int[] A,int start,int mid,int end) {
		int leftSize=mid-start+1;
		int rightSize=end-mid;
		
		int left[]=new int[leftSize];
		int right[]=new int[rightSize];
		
		for(int i=0;i<leftSize;i++) {
			left[i]=A[start+i];
		}
		for(int j=0;j<rightSize;j++) {
			right[j]=A[mid+1+j];
		}
		
		int i=0; int j=0; int k=start;
		
		while(i<leftSize && j<rightSize) {
			if(left[i]<right[j]) {
				A[k]=left[i];
				i++;
			}
			else {
				A[k]=right[j];
				j++;
			}
			k++;
		}
		
		while(i<leftSize) {
			A[k]=left[i];
			k++; i++;
		}
		while(j<rightSize) {
			A[k]=right[j];
			k++; j++;
		}
		
	}
	
}
