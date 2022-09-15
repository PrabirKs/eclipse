package array;

public class StockBuySell {

	public static void main(String[] args) {
		int arr[] = {2,4,1} ;        //2,4,1
		
		bestTime(arr);

	}
    static void bestTime(int[] arr) {
    	int buy = Integer.MAX_VALUE ; int profit = 0 ;
    	
    	for(int i = 0 ; i < arr.length ; i++) {
    	   if(arr[i]<buy) {
    		   buy = arr[i] ;   //keep the loweat buying price
    	   }
           if(arr[i] - buy > profit) {  //checking profit for this day and further day
        	   profit = arr[i] - buy ;  //storing maximum profit
           }
    	}
    	System.out.println(profit);
    }
}
