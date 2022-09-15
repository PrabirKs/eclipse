package dynamicProgramming;
import java.util.*;
public class ClimbingStairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt() ;
        System.out.println(climb(n));
        int dp[] =  new int[n+1] ;
        System.out.println(climb2(n,dp));
        int dp1[] =  new int[n+1] ;
        System.out.println(climb3(n,dp1));
        System.out.println(climb4(n));
	}
	//recursive
    static int climb(int n) {
   
    	if(n == 0 || n == 1) return 1 ;
    	
    	int one = climb(n-1) ;
    	int two = climb(n-2) ;
    	
    	return one + two ;
    }
   //using DP  //top down approach
    static int climb2(int n, int[] dp) {
    	
    	if(n == 0 || n == 1) {
    		dp[n] = 1 ;
    	}
    	if(dp[n] != 0) {
    		return dp[n] ;
    	}else {
    		int one = climb2(n-1,dp) ;
    		int two = climb2(n-2,dp) ;
    		dp[n] = one + two ;
    		return dp[n] ;
    	}	
    	
    }
    
   //using tabulation   //bottom up approach
    static int climb3(int n, int[] dp) {
    	dp[0] = 1 ;
    	dp[1] = 1 ;
    	
    	for(int i = 2 ;i <= n ;i++) {
    		dp[i] = dp[i-1] + dp[i-2] ;
    	}
    	return dp[n] ;
    }
    
   //space optomization 
    static int climb4(int n) {
    	int prev1 = 1 ;
    	int prev2 = 1 ;
    	for(int i = 2 ; i <= n ;i++) {
    		int temp = prev1 + prev2 ;
    		prev2 = prev1 ;
    		prev1 = temp ;
    	}
    	return prev1 ;
    }
}
