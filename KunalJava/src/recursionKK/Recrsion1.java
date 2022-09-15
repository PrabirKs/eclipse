package recursionKK;

public class Recrsion1 {

	public static void main(String[] args) {
	//print(5);
     // System.out.println(factorial(5));
		System.out.println(digitsum(067));
		System.out.println(productOfsum(78));
	}
	
	static void print(int n) {
		if(n==0)
			return ;
		 System.out.println(n);
	     print(n-1);
	     System.out.println(n);
	}

	static long factorial(int n) {
		if(n<=1) return 1;
		
		return n * factorial(n-1);
	}
	
	static int digitsum(int n) {
		if(n==0)
			return n;
		return (n%10) + digitsum(n/10);
	}
	
	static int productOfsum(int n) {
		if(n%10==n)
			return n;
		return (n%10) * productOfsum(n/10);
	}
}
