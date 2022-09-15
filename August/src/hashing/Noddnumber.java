package hashing;

import java.util.HashMap;

public class Noddnumber {

	public static void main(String[] args) {
		int arr[] = {1 ,1,1,1,1 } ;
		int k = 1 ;
		System.out.println(count(arr,k) ) ;

	}
//find the count of the sub array having k  no of odd number in it .
	private static int count(int[] nums, int k) {
		
		 int count = 0 ;
	        HashMap<Integer,Integer> map =  new HashMap<>() ;
	        map.put(0,1) ;
	        
	        int sum = 0 ;
	        for(int i = 0 ; i < nums.length ; i++){
	            sum = sum + nums[i]%2 ;
	            
	            if(map.getOrDefault(sum - k,0) > 0){
	              count += map.get(sum  - k ) ;
	            }
	            
	            map.put(sum , map.getOrDefault(sum,0)+1) ;
	        
	      
	    }
	     return count ;         
	}
//////////////////////////////////////////////////////////////
	//same approach
	 public int numberOfSubarrays(int[] nums, int k) {
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]%2==0) 
	            	nums[i]=0;
	            else 
	            	nums[i]=1;
	        }
	        HashMap<Integer,Integer> map=new HashMap<>();
	        map.put(0,1);
	        int sum=0;
	        int count=0;
	        for(int i=0;i<nums.length;i++){
	         sum+=nums[i];
	         count+=map.getOrDefault(sum-k,0);  //getting the freq of the element having
	         //having value sum - k , 
	         map.put(sum,map.getOrDefault(sum,0)+1);   
	        }
	        return count;
	    }
}
