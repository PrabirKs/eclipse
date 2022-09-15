package array;

import java.util.Arrays;

public class AlternativeRearrange {
    // rearrange it as biggest smallest b-1 s+1 .....
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6} ;
        rearrange(arr) ;
        rearrange2(arr) ;
        System.out.println("\n" + Arrays.toString(arr));
       
	}
	
	
    //using extra place o(n)  tc: o(n)
	private static void rearrange(int[] arr) {
		int s = 0 ; int e = arr.length -1 ;
		int res[] =  new int[e+1] ;  //creating an res aray
		int i = 0 ;
		while(s<=e) {
			res[i++] = arr[e--] ;  //putting the biggest value
			
			if(i<arr.length-1)    // in case index out of bound
			res[i++] = arr[s++] ; //putting the smallest value
		}
		for(int x : res) System.out.print(x + " "); 
	}
	
	//by o(1) extra place math operation
	private static void rearrange2(int[] arr) {
		int min = 0 ;
		int max = arr.length-1 ; // assume that the array is sorted
		int n = arr[max] + 1 ;
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(i % 2 == 0) {
				arr[i] = arr[i] + ( (arr[max] % n) * n ) ;   //putting the bigger no at even index
				max-- ;
			}
			else {
				arr[i] = arr[i] + ( (arr[min] % n) * n ) ;   //putting the smaller index at odd index
				min++ ;
			}
		}
		//updating the array
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = arr[i]/n ;
		}
	}
	
	// this is a mathenatical property that if x=3 and y=5 then take a n>x>y i.e = 6 then
	// x + (y*n) = 3 + (5*6) = 33 ,  now 33/n = 33/6 = 5 i.e "y" and 33%6 = 3 i.e "x"
	// by this way we can store 2 no in a single no
	
	// we know after the rearrangement every "even" index will have bigger no and evry " odd"  indedx hava
	// the smaller value so , we just make our "y" , for even index we just bring the bigger no from 
	// the last by "max" pointer and for "odd" index we make "y"   by bringing the smaller no from
	// the "min" pointer .

}
