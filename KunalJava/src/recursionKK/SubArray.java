package recursionKK;
import java.util.*;
public class SubArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7} ;
		ArrayList<Integer> list =  new ArrayList<Integer>() ;
		//subarray(arr,list,0) ;
		
	     //	subarayKsum(arr,list,6,0) ;
		//subarayKsum2(arr,list,5,0,0) ;   // adding an extra sum variavle to keep tradk of the k SUM
		//firstKsum(arr,list,5,0,0) ;
		System.out.println(countNoofKsum(arr,5,0,0));
    }
	
	
	
 	static void subarray(int[] arr ,ArrayList<Integer> list, int i ) {
 		if(i==arr.length) {
 			System.out.println(list);
 			return ;
 		}
 		list.add(arr[i]) ;       // add the ith index value to the list 
 		subarray(arr,list,i+1) ; //and make call , with the added list , and to the i+1 index
 		
 		list.remove(list.size()-1) ; //then remove the top added index value , and call to the i+1
 		subarray(arr,list,i+1) ;     //with the list not added the index value
 	}
//----------------------------------------------------------------------------------------------------------------------------------- 	
 	//we are finding , a subarray with a specific sum , at each subarray we are finding , we are calculating the sum , if sum == k , then 
 	//print it and return it .
 	static void subarayKsum(int[] arr ,ArrayList<Integer> list,int k , int i ) {
 		if(i==arr.length) {
 			int sum = 0 ;
 			for(int j : list) {
 				sum+=j ;
 			}
 			if(sum == k) {
 				System.out.println(list);
 			}
 			return ;
 		}
 		list.add(arr[i]) ;       
 		subarayKsum(arr,list,k,i+1) ;
 		
 		list.remove(list.size()-1) ; 
 		subarayKsum(arr,list,k,i+1) ;  
 	}
//2nd way
 	
 	static void subarayKsum2(int[] arr ,ArrayList<Integer> list,int k ,int sum,  int i ) {
 		if(i == arr.length) {
 			if(sum == k) {
 				System.out.println(list);
 			}
 			return ;
 		}
 		
 		list.add(arr[i]) ;
 		sum+=arr[i] ;                        // adding arr[i] and passing with the recursive call
 		subarayKsum2(arr,list,k,sum,i+1) ;
 		
 		list.remove(list.size()-1) ;
 		sum-=arr[i];                         //removing arr[i] from the sum and passsing it to the call
 		subarayKsum2(arr,list,k,sum,i+1) ;

 	}
 //---------------------------------------------------------------------------------------------------------------------------------	
 	// now the next task is to just search for a single subsequence with K sum , and just after return ;
 	// we can take a boolean flag variable , and declare it true . when encounter a subsequence with K sum , make flag = false ;
 	// and the if part is added with flag , for true and when it false it will not print anything , just return ;
 	// We Can create a flag variable as gloabl or pass it with each functoin call .
 	
 	//Now Another Way .
 	static boolean firstKsum(int[] arr ,ArrayList<Integer> list,int k ,int sum,  int i ) {
 		if(i == arr.length) {
 			if(sum == k) {                
 				System.out.println(list);
 				return true ;
 			}
 			return false ;
 	    }
 		
 		list.add(arr[i]) ;
 		sum+=arr[i] ;                       
 		if(firstKsum(arr,list,k,sum,i+1)==true) //if found any subsequence with k sum , it just return true ;
 		return true;    // and from here the fun call will be break , the below line will not bve executed .
 		                 // and like wise all the previous call will be return by true and no more further cal will be called
 	    
 		list.remove(list.size()-1) ;
 		sum-=arr[i];                         
 		if(firstKsum(arr,list,k,sum,i+1)==true)  // same  also here .
 		return true ;
 		
 		return false ;                           // else return false
 	}
 //-----------------------------------------------------------------------------------------------------------------------------------   
 	//count how many pair is here , having k sum ;
 	static int countNoofKsum(int[] arr ,int k ,int sum,  int i) {
 		if(i == arr.length) {
 			if(sum == k) {
 				return 1 ;
 			}else {
 				return 0 ;
 			}
 		}
 		sum+=arr[i] ;
 		int left = countNoofKsum(arr,k,sum,i+1);
 		
 		sum-=arr[i] ;
 		int right = countNoofKsum(arr,k,sum,i+1); 
 		
 		return left + right ;
 	}

}
