package array;

public class A_i__A_A_i {
    // given an array and convert a[i] to a[a[i]]
	public static void main(String[] args) {
		int[] arr = {4,0,2,1,3} ;  // 3 4 2 0 1
 		solve(arr) ;

	}

	private static void solve(int[] arr) {
		int max = arr.length ;      //5
	    for(int i = 0 ; i < arr.length ; i++) {
	    	int a_i = arr[i] ;          //4
	    	int a_a_i = arr[arr[i]] ;   //3
	    	
	    	
	    	arr[i] = a_i + ( (a_a_i % max) * max ) ;
	    }
	    for(int x: arr) {
	    	System.out.print(x/max +" ");
	    }
		
	}

}

// this is a mathenatical property that if x=3 and y=5 then take a n>x>y i.e = 6 then
// x + (y*n) = 3 + (5*6) = 33 ,  now 33/n = 33/6 = 5 i.e "y" and 33%6 = 3 i.e "x"
// by this way we can store 2 no in a single no