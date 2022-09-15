package accioJob;

import java.util.*;

public class MinLmtofBals {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      int limit=sc.nextInt();
	      int nums[]=new int[n];
	      for(int i=0;i<n;i++){
	        nums[i]=sc.nextInt();
	      }
	     System.out.println(search(nums,limit)); 

	}
	
	static int search(int[] nums,int limit) {
		Arrays.sort(nums); 
		int end=nums.length-1;
		
		int min=1;                      //min no of balls will be one
		int max=nums[end];              //max no of balls will be the max no of  bals in a bag at the end after sort
		//and the answe lies between them
		
		int ans=0;
		while(min<max) {                         //2 4 8 2    2 2 4 8
			int count=0;
			
			int mid=min+(max-min)/2;     //choosing the penalty for which the balls have max no and the partition should be below the limit
			 
			for(int i=0;i<=end;i++) {
				if(nums[i]>mid) {         //the bag which has balls more than the penalty will be checked , i.e whether the no of partition count is below the limit
					
					int rem=nums[i]/mid;  // no of partition
					
					 if(nums[i]%mid==0) {  // if it is divisible by the penalty then it is also one partitin ex: 6/3=2 , 6%3==0 , 2 is the quotient but no of partition is 1 so rem-1 is added to count
						 count=count+rem-1;
					 }
					 else {
						 count=count+rem;    // 5/3=1, and 1 is the no of partion , in case of undivisible
					 }
				}
				
			}
			if(count<=limit) {      // if the no of count is less than equal to limit then , the penalty should be more so end=mid
				 ans=mid;
				max=mid;
			}else {
				min=mid+1;         // if count is more than limit then penalty should be greater so start=mid+1
			}
			
		}
		return ans;
	}

}
