package array;

public class MergeSortedArray {

	public static void main(String[] args) {
//		int nums1[] = {1,2,5,9,12,0,0,0,0} ;
//		int nums2[] = {3,6,7,13};
		
		int nums1[] = {3,5,7,8,0,0,0,0} ;
		int nums2[] = {1,2,4,9};
		merge(nums1,nums1.length,nums2,nums2.length);
		for(int x: nums1) System.out.print(x + " ");
	}

	private static void merge(int[] nums1, int n, int[] nums2, int m) {
        int i = n-m-1 ;
        int j = m-1 ;
        int fill = n-1 ;
        
        while(i>=0 && j>=0) {
        	if(nums1[i] >= nums2[j]) {  // when we found a no bigger in nums1 then just plce that in the fill index and move i-- and fill--
        		nums1[fill] = nums1[i] ;
        		i-- ; fill-- ;
        	}
        	else {
        		nums1[fill] = nums2[j] ;
        		j--; fill-- ;
        	}
        }
         while(j>=0) {  // in case we reached i==-1 but still some element less than nums2[0] is present , fill them in fill index
        	 nums1[fill--] = nums2[j--] ;
         }
		
       
	}

}
