package array;

import java.util.Arrays;
//this is a dutch national flag algorithm. we just keep three pointer s = 0 ; m = 0 ; e = n-1 ;
//our main  motto is keep all 0's before 's' ,  and keep all 2's after 'e' ;
//we just keep moving the 'm. while 1 occurs , when 0 comes just swap it with 's'  and s++ ; mid++ ; 's' waiting for any 0 to be come
//'m' start searching for 0 ;  And if 2 comes then as 's' it just swap it with 'e' and h-- ; waiting for another 2 .
public class Sort0s1s2s {

	public static void main(String[] args) {
		int arr[] = {0,1,1,0,0,1,2,1,2,0,0,0,1};
		Sort(arr);
    }
	static void Sort(int[] arr) {
		int start = 0 ; int mid = 0; int end = arr.length-1 ;
		while(mid <= end){
			
			if(arr[mid] == 0) {               // when 0 comes 
			  	swap(arr,start,mid) ;
			  	start++ ; mid++ ;
			}else if(arr[mid] == 1) {         // when 1 comes 
				mid++ ;
			}else if(arr[mid] == 2) {        // when 2 comes
				swap(arr,mid,end) ;
				end-- ;
			}
		}
		System.out.println(Arrays.toString(arr));	
	}
	static void swap(int[] arr , int i , int j) {
		int temp = arr[i] ;
		arr[i]   = arr[j] ;
		arr[j]   = temp ;
	}

}
// can be done by first just counting all the 0,1,2 and then run a for loop and insert acc to count from began . TC: O(2n) 