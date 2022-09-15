package question;
import java.util.*;
public class CountSubArrayAtmaxKUnique {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in) ;
		int  n =  sc.nextInt() ;
		int arr[] =  new int[n] ;
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt() ;
		}
		int k =  sc.nextInt() ;
        System.out.println(countAtMaxK(arr,k));
	}
    
	static int countAtMaxK(int[] arr , int k) {
		int i = 0 ;
		int j = 0 ;
		int count = 0 ;
		HashMap<Integer,Integer> map = new HashMap<>() ;
		while(j < arr.length) { 
			//add each freq
			map.put(arr[j], map.getOrDefault(arr[j],0) + 1) ;
			
			//handle case when map > k , distinct element
			while(map.size() > k) {
				map.put(arr[i],map.get(arr[i]) - 1) ;
				if(map.get(arr[i])==0) {
					map.remove(arr[i]) ;
				}
				i++ ;
			}
			//now after this part , always the [i,j] have only k distinct element
			count = count + j - i + 1 ;
			j++ ;
		}
		return count ;
	}
}
/*
 * a a b c b c d b c a
 * 0. a
 * 1. aa,a
 * 2. aab,ab,b
 * --for i = 0 , j =2 : there is 6 subarray which has maximum 2 distinct
 * --element , so at every step for every j , we have to calculate it j-i+1
 * 3. bc,c
 * 4. 
 */
