package recursionKK;
import java.util.*;
public class SubsetSumj1 {

	public static void main(String[] args) {
	  int arr[] =  {1,4,5} ;
	  System.out.println(subsetSum(arr)) ;
  }
  static List<Integer> subsetSum(int[] arr){
	  List<Integer> ans = new ArrayList<>() ;
	  calculate(arr,0,0,ans) ;
	  Collections.sort(ans) ;
	  return ans ;
  }
  static void calculate(int[] arr, int i,int sum, List<Integer> ans) {
	if(i == arr.length) {
		ans.add(sum) ;
		return ;
	}
	sum = sum + arr[i] ;
	calculate(arr,i+1,sum,ans) ;
	sum = sum - arr[i] ;
	calculate(arr,i+1,sum,ans) ;
  }
}
