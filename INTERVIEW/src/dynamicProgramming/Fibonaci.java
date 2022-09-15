package dynamicProgramming;
import java.util.*;
public class Fibonaci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int n = 6 ;
		long dp[] = new long[n+1] ;
	    System.out.println(fib(n));
		System.out.println(fibb1(n,dp));
		System.out.println(fibTabulation1(n));

	}
    
	static long fib(int n) {
		if(n<=1) return  n ;
		return fib(n-1) + fib(n-2) ;
	}
	//using dynamic programming for optimization //memoization
	static long fibb1(int n,long[] dp) {
		if(n<=1) {
			return n ;
		}
		if(dp[n]!=0) {
			return dp[n] ;
		}
		dp[n] = fibb1(n-1,dp) + fibb1(n-2,dp) ;
		return dp[n] ;
		
	}
	
	// removing space complexity, using tabulation
	
	static int fibTabulation(int n) {
		int prev1 = 0 ;
		int prev2 = 1 ;
		for(int i = 1 ; i < n ;i++) {
			int fib = prev1 + prev2 ;
			prev1 = prev2 ;
			prev2 =  fib ;
		}
		return prev2;
	}
	
	static int fibTabulation1(int n) {
		int[] fib = new int[n+1]  ;
	    fib[1] = 1 ;
	    fib[0] = 1 ;
	     
		for(int i = 2 ; i <= n ;i++) {
			fib[i] = fib[i-1] + fib[i-2] ;
		}
		return fib[n];
	}
}
