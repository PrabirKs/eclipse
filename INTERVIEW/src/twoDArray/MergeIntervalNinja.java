package twoDArray;
import java.util.*;
public class MergeIntervalNinja {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt() ;
        int[] first = new int[n];
		for(int i = 0 ; i < n ; i++) first[i] = sc.nextInt() ;
        int[] second = new int[n];
		for(int i = 0 ; i < n ; i++) second[i] = sc.nextInt() ;
		
	    find(first,second,n) ;
	}
//8 
//1 3 6 8 10 13 14 18
//4 5 8 9 12 14 17 19
	private static void find(int[] first, int[] second, int n) {
		int f = first[0] ;
		int s = second[0] ;
		List<List<Integer>> ans = new ArrayList<>() ;
		int i = 0 ;
		for(i = 0 ; i < n; i++) {
			List<Integer> interval = new ArrayList<>() ;
			if(i!=n-1 && second[i] >= first[i+1]) {
				s = second[i+1] ;
			}else if(i==n-1 || second[i] < first[i+1]) {
			
				interval.add(f) ;
				interval.add(s) ;
				ans.add(new ArrayList<>(interval)) ;
				if(i!=n-1) {
				f = first[i+1] ; 
				s = second[i+1] ;}
			}
		}
	     System.out.println(ans);
	}

}
