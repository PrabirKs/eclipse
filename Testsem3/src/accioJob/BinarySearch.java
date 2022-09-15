/*package accioJob;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]= {1,2,4,8,14,17,19,26,38,46,56,80};
                   //0 1 2 3  4  5  6  7  8  9 10 11
         int target=26;
         int ans=binarysearch(arr,target);
         System.out.print(ans);
	}
	static int binarysearch(int[] arr,int target) {
		int start=0; int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]<target) {
				start=mid+1;
			}
			else if(arr[mid]>target) {
				end=mid-1;
			}
			else
				return mid;
		}
		
		return -1;
	}

} */
/*                                      [1, 2,4,5,7,8,10]  5<7,start=mid+1;
 * what if the array is descending then [10,8,7,5,4,2,1] if we want to search for 7, then
 * s+e/2 =arr[3]=5; 5<7, end=mid-1;  
 * SO WE HAVE TO CHECK FOR IsAsc or Isdesc before moving on to the process
 * 
 * and in case of higher start and end value , (start+end) may exceed int size so s + (e-s)/2
 */ 
package accioJob;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //int arr[]= {1,2,4,8,14,17,19,26,38,46,56,80};
                   //0 1 2 3  4  5  6  7  8  9 10 11
         int arr[]= {23,21,12,8,7,6,5,3,1};
         int target=12;
         int ans=binarysearch(arr,target);
         System.out.print(ans);
	}
	static int binarysearch(int[] arr,int target) {
		int start=0; int end=arr.length-1;
		boolean isAsc=arr[start]<arr[end];
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			
			if(arr[mid]==target) {
				    return mid;
			     }
			   
			if(isAsc){
			              if(target>arr[mid]) {
				               start=mid+1; }
			              else {
				              end=mid-1;
			                   }
			         }   
			
	        else {
		            if(target<arr[mid]) {
			              start=mid+1;
		                  } 	
		           else {
			              end=mid-1;
			            }
	            }
		    } 
		
		return -1;
	}

}