package twoDArray;
import java.util.*;
public class MergeIntrvals {
	//8 
	//1 3 6 8 10 13 14 18
	//4 5 8 9 12 14 17 19
	public static void main(String[] args) {
	   int arr[][] = {{1,3} , {3,5} , {6,8} , {8,9} , {10,12} , {13,14} , {14,17} , {18,19} } ;
	  // print(arr) ;
	   print(merge(arr)) ;

	}
   
	private static int[][] merge(int[][] arr) {
	   List<int[]> res = new ArrayList<>() ;
	   
       if(arr.length == 0 || arr == null)
    	   return res.toArray(new int[0][]) ;
       
       Arrays.sort(arr,(a,b) -> a[0]-b[0]);   // using comparitor , we just compare the a[0] of each interval during sorting
       
       int  start = arr[0][0] ;
       int  end = arr[0][1] ;
       
       for(int[] interval : arr) {
    	   if(interval[0] <= end) {     //when find any interval start with a number less than the prev end i.e 2nd val of any prev interval
    		   end = Math.max(end, interval[1]) ;  // just change the end value to the 2nd value of this interval
    	   }
    	   else {              //when encounter a intrval whose 1st elmnt is greater then the end
    		   res.add(new int[] {start,end}) ; // just now add the stat and end as a merged intrval in the res
    		   start = interval[0] ;       //update the first to this intrval's 1st elmnt
    		   end = interval[1] ;         //update the second to this intrval's 2nd elmnt
    	   }
       }
       res.add(new int[] {start,end}) ;    // after finish add the last value of start and end as a last interval
	   return res.toArray(new int[0][]);   // convert the res list to array and return  //
	   //here 0 means nothing just givnig the dimension as initializatin	
	}

	static void print(int[][] arr) {
	  	   for(int row[] : arr) {
		  for(int col : row) {
			System.out.print(col + " ");
		  }
		  System.out.println();
	   }
	}   

}
