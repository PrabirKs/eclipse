package accioJob;

import java.util.*;

public class CatchThief {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	      int hole=sc.nextInt();
	      int k=sc.nextInt();
          int num[]=new int[k];
	      for(int i=0;i<k;i++){
	        num[i]=sc.nextInt();
	      }
       System.out.println(search(num,hole,k-1)); 
    }
  static int search(int[] arr,int hole,int k ) {                // 4  4 5 7 8 9
	    Arrays.sort(arr);   //first we have to sort the array
        int police=0;
		int first=arr[0];
		int last=arr[k]; 
	    int i=0; int count=0; int end=k;
	    while((i<=k) && count!=end+1) {     // count!=end+1 means the start and the end thief cant be same at any case
	    	while(last!=hole) {    //move until last thief reached to the hole
	    		last++;     //  last thief one move 
	    		police++;    //police one move
	    		while((police==first || police>first) && count!=end) {  //if police reach to any thief from left and  POSITION has more than one thief so to move the left pointer to the right position and catch all the thief first<police   ,count!=end means if the rightward thief is choosen then this thief cant be catched by the police
	    			first=arr[++count];   // move the first pointer
	    		}
	    	}
            if(end==0) {
	        	return k-count+1;   // if no thief is being catch by police and all the thief selected for hole 10 5 [9 9 9 9 9] for this input return all the thief coubt
	        }
	    	last=arr[--end] ;  //reduce the array pointer when a thief is reached to hole , points to the previous thief of that
	    	
	    	i++;
	    }
		
		
		return k-count+1;  // return k= no of thief-1,so +1 , count=no of thief caught ,
	}
}




























/*for(int i=0;i<k;i++) {
			if(police<last){
		        while(last<hole) {
		         	last++;
		         	police++;
		            	if(police==first) {
		    	         	first=arr[++firstrack];
		    	      }
		            }
			     }
		    if(police==first) {
	    		first=arr[++firstrack];
		    }
		    last=arr[--lasttrack];
		  
		} */
