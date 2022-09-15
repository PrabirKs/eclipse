package recursionKK;
import java.util.*;
public class CheckSortedArr {

	public static void main(String[] args) {
	    int[] arr = {1,4,5,7,9,10,12,5} ;
	  //  System.out.println(sortedCheck(arr,0));
	  //  System.out.println(linearSearch(arr,10,0));
	  //  ArrayList<Integer> res =  new ArrayList<>() ;
	   // System.out.println(find1stlast(arr,4,0,res));
	   // System.out.println(find1stlast1(arr,5,0));
	    System.out.println(searchInRotdSrtdAray(arr,9,0,7));
	}

	static boolean sortedCheck(int[] arr , int index) {
		if(index == arr.length-1) {
			return true;
		}
		
		return arr[index] < arr [index+1] && sortedCheck(arr , index+1) ;  
		//return (arr[index] - arr[index+1] < 0) && sortedCheck(arr , index+1) ;
	}
	
	static int linearSearch(int[] arr,int target ,int index) {
		if(index == arr.length) {
			return -1 ;
		}
		if(arr[index] == target) {
			return index ;
		}
		
		return linearSearch(arr,target,index+1) ;
	}
	
	static ArrayList<Integer> find1stlast(int[] arr ,int target,int index,ArrayList<Integer> list){
		if(index == arr.length) {
			return list;
		}
		if(arr[index]==target) {
			list.add(index) ;
		}
		return find1stlast(arr , target , index+1 , list) ;
	}
	
	static ArrayList<Integer> find1stlast1(int[] arr ,int target,int index){
		ArrayList<Integer> list =  new ArrayList<>() ;
		if(index == arr.length) {
			return list;
		}
		if(arr[index]==target) {
			list.add(index) ;
		}
		ArrayList<Integer> prevAns =  find1stlast1(arr , target , index+1) ; 
		list.addAll(prevAns) ;
		
		return list ;
	}
	
	static int searchInRotdSrtdAray(int[] arr , int target , int s , int e) {
		if(s>e) {
			return -1 ;
		}
		
		int m = s + (e-s)/2 ;
		
		if(arr[m]==target) {
		   return m ;
		}
		//5 6 7 8 9 1 2 3 4
		
		if(arr[s] <= arr[m]) {
			if(target>=arr[s] && target<=arr[m]) {
				return searchInRotdSrtdAray(arr,target,s, m - 1) ;
			} else {
				return searchInRotdSrtdAray(arr,target,m+1,e) ;
			}
		}
		if(target>=arr[m] && target<=arr[e]) {
			return searchInRotdSrtdAray(arr,target,m + 1,e) ;
		}
	    // 5 6 1 2 3 4
		return searchInRotdSrtdAray(arr,target,s, m - 1) ;

	}
}
