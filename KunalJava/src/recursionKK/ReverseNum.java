package recursionKK;

public class ReverseNum {

	public static void main(String[] args) {
		//System.out.println(sum);
		//rev3(1234);
		System.out.println(rev2(12345));
		//System.out.println((int) (Math.log10(1234)+ 1) );   // to know the number of digit in a number
        System.out.println(pallindrome(1234321));
        System.out.println(count0(120908,0));
        
        System.out.println(rev2(354));
	}
	
	static int rev(int num) {
		int revnum = 0 ;
		while(num > 0) {
		   int rem = num%10 ;
		   revnum = revnum * 10 + rem ;
		   num = num/10 ;
		}
		return revnum ;
	}
	//by recursion
	static int sum = 0 ;  // but used a global static variable
	
	static void rev3(int num) {
		if(num==0) return ;
		
		int rem = num % 10 ;
		sum = sum*10 + rem ;
		rev3(num/10) ;
		
	}

	static int rev1(int num) {
		int p = (int) (Math.log10(num) ) ;   // to know power of the highest base of 10 
		int revnum = 0 ;
		
		while(num > 0) {
			int rem = num % 10 ;
			revnum = (int) (revnum + rem * Math.pow(10, p--));
			num = num/10 ;
		}
		return revnum ;
	}
	
 // recursion
	static int rev2(int  n) {
		//sometimes you might need some additional variables in the
		//argument,  in that case , make another function
		
		int digits = (int)(Math.log10(n));
		return helper(n , digits) ;
	}
	static int helper(int  n , int digit) {
		if(n%10 == n) {
			return n ;
		}
		int rem = n % 10 ;
		
		return rem * (int)(Math.pow(10,digit--)) + helper(n/10 , digit--) ;
	}
// pallindrome check if num == rev(num)
	static boolean pallindrome(int n) {
		return n==rev(n) ;
	}
	
	//count no of zero
	 static int count ;
	static int countZero(int  n) {
		if(n==0) return count ;
		
		if(n%10 == 0) count++ ;
		return countZero(n/10) ;

	}
	
	static int count0(int  n , int count) {
		
		if(n==0) return count ;
		
		if(n%10 == 0) return count0(n/10,count+1) ;
		
		return count0(n/10 , count) ;

	}
}
