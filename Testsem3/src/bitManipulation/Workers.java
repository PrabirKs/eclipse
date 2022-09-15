package bitManipulation;
import java.util.*;
public class Workers {

	public static void main(String[] args) {
	    int n;   // no of worker
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt() ;
	    ArrayList<Integer> masks = new ArrayList<>(0);
	    
	    for(int i = 0 ; i < n ; i++) {
	    	int noOfWorkingDay = sc.nextInt() ;      // taking the no of working days in the month
	    	int bitMask = 0 ;
	    	 for(int  j = 0 ; j < noOfWorkingDay ; j++) {
	    		 int day = sc.nextInt() ;                      // taking the day number like 2nd day or 9th day of the month , when he available for the work
	    		 bitMask = ( bitMask | (1<<day));              // for each day setting that bit count to 1 . 
	    	 }
	    	 masks.add(bitMask) ;                              // after setting the all bit for a single worker add the masked bit in the masks list
	    }
       
	 
	    for(int i = 0 ; i < n ; i++) {
	    	System.out.print(Integer.toBinaryString(masks.get(i)));
	    	System.out.println(" : " + Integer.bitCount(masks.get(i)));
	    }
	    int maxday = 0 ; 
	    int worker1 = -1;
	    int worker2 = -1;
	    for(int i = 0 ; i < n ; i++ ) {
	      for(int j = i + 1 ; j < n ; j++) {
	    	int  intersection = masks.get(i) & masks.get(j) ;    // getting the intersectoin point means setting the bit to one where worker 1 and worker 2 having the same day in their work schedule
	    	int bitcount =  Integer.bitCount(intersection) ;     // in the intersection counting the number of bits which are one 1's .
	    	System.out.println(i + " " + j + " " + bitcount );
	    	maxday = Math.max(maxday,bitcount ) ;                // taking maximum of the day , when two worker have matched day
	    	if(bitcount >= maxday) {
	    		worker1 = i+1 ;
	    		worker2 = j+1 ;
	    	}
	      }
	    }
	    System.out.println("worker " + worker1 + " and " + "worker " + worker2 + " having maximum combination of " + maxday + " day");
	}

}
/*5
4 
6 3 2 7 
5 
1 3 4 5 16 
6
1 3 4 18 12 11
8
1 3 5 16 12 11 18 10
7 
2 4 6 12 11 18 3
*/
