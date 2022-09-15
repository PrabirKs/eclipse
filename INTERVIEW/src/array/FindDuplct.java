package array;

public class FindDuplct {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,4} ;
		System.out.println(findDuplcts(arr)) ;
		System.out.println(findDuplcts2(arr)) ;
	
		
	}
	
	//this cyclic search method is possible when , all arr[i] < N
    private static int findDuplcts2(int[] arr) {
		int slow = arr[0] ;
		int fast = arr[0] ;
		
		do {
			slow = arr[slow] ;                   //slow move 1 step
			fast = arr[arr[fast]] ;              //fast move 2 step
		}while(slow!=fast) ;                     //until slow and fast get equal
		//now slow and fast meet at same point , means there is a loop 
		fast = arr[0] ;                          //now move fast to the  beginning
		
		while(slow!=fast) {                      //move them by 1 step , while they meet
			  slow = arr[slow] ;
			  fast = arr[fast] ;
		}
		return slow;                             //that is the element which is duplicate
	}

    
    
    
    
    
	//1) first sort the array , then just find when arr[i] == arr[i+1] , return the number
	// TC : nlogn + n
	
	//2) create a freq array and store freq, of each and when just find any no , having more than 1 freq , just return
	
	private static int  findDuplcts(int[] arr) {
		int[] freq =  new int[10] ;
		for(int i = 0 ; i < arr.length ; i++) {
			freq[arr[i]]+=1;
			if(freq[arr[i]] ==  2) return arr[i] ;
		}
		return -1;
	}
	
   
}

