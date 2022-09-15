package dynamicProgramming;

public class FrogJump {
    
	public static void main(String[] args) {
		int n = 6 ;
		int[] energy = {30,10,60,10,60,50,20} ;
		int[] dp =  new int[n+1] ;
		System.out.println(jump(n,energy));
		System.out.println(jump1(n,energy,dp));
		  
	}
	
   static int jump(int n,int[] energy) {
	   
	   if(n == 0) return 0 ;
	   
	   int cost1 = jump(n-1,energy) + Math.abs(energy[n] - energy[n-1]) ; 
	   int cost2 = Integer.MAX_VALUE ;
	   if(n>1) {
	   cost2 = jump(n-2,energy) + Math.abs(energy[n] - energy[n-2]) ;
	   }
	   return Math.min(cost1,cost2) ;
   }
   
   static int jump1(int n,int[] energy,int[] dp) {
	  
	   if(n == 0) return dp[n] = 0;
	   
	   if(dp[n]!=0) {
		   return dp[n] ;
	   }
	   else {
	   int cost1 = jump1(n-1,energy,dp) + Math.abs(energy[n] - energy[n-1]) ; 
	   int cost2 = Integer.MAX_VALUE ;
	   if(n>1) {
	   cost2 = jump1(n-2,energy,dp) + Math.abs(energy[n] - energy[n-2]) ;
	   }
	   return dp[n] = Math.min(cost1,cost2) ;
	   }
   }
   
   
}
