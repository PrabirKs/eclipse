package array;

import java.util.*;

/*
3 4
0 1 2 0
3 4 5 2
1 3 1 5
 */
public class SetMatrxZeroes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
	    int m = sc.nextInt() ;
	    int n = sc.nextInt() ;
	    int[][] nums = new int[m][n] ;
	  
	    for(int i = 0 ; i < m ; i ++){
	    	for(int j = 0 ; j < n ; j++) {
	           nums[i][j] =  sc.nextInt() ;
	    	}
	    }
	    int a = 9 ;
	   
	    System.out.println(Arrays.deepToString(nums));
	    setMatrixtoZeroes(nums); 
       System.out.println(Arrays.deepToString(nums));
       
       
	}
    
 /*	static void setMatrixtoZeroes(int[][] nums) {
		ArrayList<Integer> rowzero = new ArrayList<>() ;
		ArrayList<Integer> colzero = new ArrayList<>() ;
		for(int i = 0 ; i < nums.length ; i ++) {
			for(int j = 0 ; j < nums[i].length ; j ++) {
				if(nums[i][j]== 0 ) {
					rowzero.add(i);
					colzero.add(j);
				}
			}
		}
		
		for(int i = 0 ; i < nums.length ; i ++) {
			for(int j = 0 ; j < nums[i].length ; j ++) {
		        if(rowzero.contains(i)) {
		        	nums[i][j] = 0 ;
		        }
		        if(colzero.contains(j)){
		        	nums[i][j] = 0 ;
		        }
			}
		}
	}
	
	*/
	
	// this is also applying the same approach as that of the before but here no extra space is taken just we are taking the firt row to 
	// keep all the j value of the element of 0 and using the first coloumn to store the i value of element of 0 
	
	// now a problem is the nums[0][0] is intersectoin of both , so we just use the nums[0][0] to store the jth value of the element of 0's 
	// and use a variable col00 to keep the ith value of the 0,s off first coloumn . 
	
	// and after that we traverse each element and we just handle the special case of the while j = 0 , and if nums[i][0] = 0 , we just make 
	//the col00 to zero .
	
	// and when we found 0 any where er just update the leftmost nums[i][0] = 0 and topmost nums[0][j] = 0 .
	
	//after that we run a loop again from the backward in order to update the leftmost and topmost at last ,
	
	// and when we FIND nums[i][0] == 0 || nums[0][j]==0 then just update the nums[i][j] = 0 ;
	//and here also handle the special case , if nums00 = 0 ,then nums[i][0] = 0 ; 
	
	// no extra space is here .
	static void setMatrixtoZeroes(int[][] nums) {
		int col00 = 1 ; int row = nums.length ; int col = nums[0].length ;
		
		
		for(int i = 0 ; i < row ; i++) {
			if(nums[i][0] == 0)  col00 = 0 ;
			for(int j = 1 ; j < col ; j++) {
				if(nums[i][j] == 0) {
					nums[i][0] = nums[0][j] = 0 ;
				}
			}
		}
		
		for(int i = row-1 ; i>=0 ; i--) {
			for(int j = col-1 ; j>=1 ; j--) {
				if(nums[i][0] == 0 || nums[0][j]==0) {
					nums[i][j] = 0 ;
				}
			}
			
			if(col00 == 0) {
				nums[i][0] = 0 ;
			}
        }

 }
	
	
	
	
	
	
	
	/*
	 * class Solution {
    public void setZeroes(int[][] nums) {
        ArrayList<Integer> zero = new ArrayList<>() ;
		for(int i = 0 ; i < nums.length ; i ++) {
			for(int j = 0 ; j < nums[i].length ; j ++) {
				if(nums[i][j]== 0 ) {
					zero.add(i);
					zero.add(j);
				}
			}
		}
		
		for(int i = 0 ; i < nums.length ; i ++) {
			for(int j = 0 ; j < nums[i].length ; j ++) {
		        if(zero.contains(i) || zero.contains(j) ) {
		        	nums[i][j] = 0 ;
		        }
			}
		}
    }
}
	 */  // this approach is just before the above one, here we just get to know whethr the i , j belong to the zero list, but we should
	// keep in mind that we just make zeros of all the row only when the arr[i][j]=0 , so only the j th row will be zero so 
	// i created 2 arraylist to store all the row index i , containg 0's and all the coloumn index j in another list 
	
}
