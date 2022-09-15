package binarySearch;

public class NoOfTimeRotated {

	public static void main(String[] args) {
		int arr[] =  {5,6,7,8,9,1,2,3,4} ;    // roatetd from left to right
		int arr1[] = {3,1} ;    //rotate from right to left
		//System.out.println(LeftrotateCount(arr));
		System.out.println(RightrotateCount(arr1));
		System.out.println(find(arr1,4));
	}
    
	static int LeftrotateCount(int[] arr) {
		int start = 0 ; int end = arr.length - 1 ;
		int res = 0 ;
		if(arr.length == 1) return arr[0] ;
		while(start <= end) {
			int mid = start + (end-start)/2 ;
			
			if(mid > 0 && arr[mid] < arr[mid-1]) {
				res = mid ; return arr.length - res ;
			}else if(arr[mid] >= arr[0]) {
				start =  mid + 1 ;
			}else if(arr[mid] < arr[0]) {
				end = mid ;
			}
		}
		return arr[res] ;
	}
	
	static int RightrotateCount(int[] arr) {
		int start = 0 ; int end = arr.length - 1 ;
		if(arr[start] < arr[arr.length-1] || arr.length == 1)  return 0 ;
		
		int res = -1 ;
		
		while(start <= end) {
			int mid = start + (end-start)/2 ;
			
			if(mid > 0 && arr[mid] < arr[mid-1]) {  //the conditon for the min element
				res = mid ; return mid ;
			}
			else if(arr[mid] >= arr[0]) {           // dealing with the corner case ex: 4,2
				start =  mid + 1 ;
			}
			else if(arr[mid] < arr[0]) {            //this element can be the answer
				end = mid ;
			}
		}
		return -1 ;
	}
	
	static int find(int[] arr ,int key) {
		int res = -1 ;
		int pivot = RightrotateCount(arr) ;
		if(key == arr[pivot]) return pivot ;
		else if(key > arr[arr.length-1]){
			 res = binarysearch(arr,0,pivot-1,key) ;
		}else {
			 res = binarysearch(arr,pivot,arr.length-1,key) ;
		}
		return res ;
	}

	private static int binarysearch(int[] arr, int start, int end,int key) {
		while(start <= end) {
			int mid = start + (  end - start) /2 ;
			
			if(arr[mid] == key) {
				return mid ;
			}else if(arr[mid] > key) {
				end = mid -1 ;
			}else {
				start =  mid + 1 ;
			}
		}
		return -1;
	}
}
