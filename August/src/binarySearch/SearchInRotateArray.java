package binarySearch;

public class SearchInRotateArray {

	public static void main(String[] args) {
		int arr[] = {6,7,8,9,10,11,12,13,1,2,3,4,5} ;
		System.out.println(search(arr,7));

	}

	static int search(int arr[] ,  int key) {
		int low = 0 ; int high = arr.length -1 ;
		
		while(low <= high) {
			int mid = low + (high - low)/2 ;
			if(arr[mid] == key)  return mid ;
			
			//if the left half is sorted
			
			if(arr[low] <= arr[mid]) {
				//check if the element is inside [low,mid] or not
				if(key >= arr[low]  &&  key <= arr[mid]) {
					high = mid - 1 ;
				}
				//it is not inside this range
				else {
					low = mid + 1 ;
				}
			}
			
			//if the left half is not sorted  //assume right half is sorted
			else {
				//check if the element is lies between [mid,end]
				if(key >= arr[mid] && key <= arr[high]) {
					low = mid + 1 ;
				}
				//it is not inside this range too
				else {
					high = mid - 1 ;
				}
			}
		}
		return -1 ;
	}
}
