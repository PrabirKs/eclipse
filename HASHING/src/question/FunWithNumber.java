package question;
import java.util.*;
public class FunWithNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[] = {4,2,1,5,3} ;
         int m = 3 ;
         int val[][] = {{2,3},{1,5},{2,3}} ;
         count(arr,val,m) ;
	}
	static void count(int arr[],int[][] val,int m){
        
        int max = -1 ;
        HashMap<Integer,Integer> map = new HashMap<>() ;
        for(int i = 0; i <arr.length ;i++){
         map.put(arr[i],i) ;
         }
    int check = 0 ; int count = 1 ;
    for(int i = 1 ; i < arr.length ;i++){
      check = arr[i];
      if(map.get(i) < map.get(i+1)){
        continue ;
      }else{
        count++ ;
      }
    }
    for(int i = 0 ; i < m ;i++){
      int x = val[i][0] ;
      int y =  val[i][1] ;
      if(arr[x-1] > arr[y-1] && map.get(arr[x-1]) < map.get(arr[y-1])  
      || arr[x-1] < arr[y-1] && map.get(arr[x-1]) > map.get(arr[y-1])){
           count-- ;
      }else{
        count++ ;
      }
      int indx  =  map.get(arr[x-1]) ;
      map.put(arr[x-1],map.get(arr[y-1])) ;
      map.put(arr[y-1] , indx) ; 
      int temp = arr[x-1] ;
      arr[x-1] = arr[y-1] ;
      arr[y-1]  = temp ;
      System.out.println(Arrays.toString(arr)) ;
    }
    
  }
}
