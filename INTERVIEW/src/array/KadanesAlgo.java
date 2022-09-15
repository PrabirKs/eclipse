package array;

//goal is to find a contigious subarray which have the maximum sum.
//At brute force we just take 'i' and 'j' and then run a loop between i-j to find all the subarray. and then calcuate the max sum
//but for doing this , we have to first generate all the subarray, at O(n^3) .
public class KadanesAlgo {

	public static void main(String[] args) {
		
		int[] arr = {-2,-3,4,-1,-2,1,5,-3} ;
		subarray2(arr) ;

	}
// brute force 
	static void subarray(int[] arr) {
		int n = arr.length ; int max = arr[0] ;
		for(int i = 0 ; i < n ; i++) {
			for(int j = i ; j < n ; j++) {
				int sum = 0 ;
				for(int k = i ; k <=j ; k++) {
					sum+=arr[k] ;
					//System.out.print(arr[k]+ " ");
				}
				max = Math.max(max,sum) ;
				//System.out.println();
			}
		}
		System.out.println("max = " + max);
	}
// optimal --> reduction on that last k loop 
//j also moving each element  acc to i , so we just get the sum at each steps and find the max . tc: O(n^2)
	static void subarray1(int[] arr) {
		int n = arr.length ; int max = arr[0] ;
		for(int i = 0 ; i < n ; i++) {
			int sum = 0 ;
			for(int j = i ; j < n ; j++) {
				     sum+=arr[j] ;
				     max = Math.max(max,sum) ;
                 }
		 
		System.out.println(max);
		}
	}
 //most optimal , using kadane's algorithm 
 //first take the maxi as arr[0] cz subarray also can be of single length
 //then start mking sum of elements and when any -ve sum occur just make the whole sum = 0 ; cz its gonna reduce the max sum later on
 // by using a max var just get the max sum . TC : O(n) SC: O(1)	
	static int subarray2(int[] arr) {
     int n = arr.length ; int maxi = arr[0];
     int sum = 0 ;
     for(int i = 0 ; i < n ; i++) {
    	 sum+=arr[i] ;
    	 if(sum<0) sum = 0 ;
    	 if(sum>maxi) maxi = sum ;
      }
       System.out.println(maxi);
	   return maxi ;
   }
	
}
