package array;

public class PowXn {

	public static void main(String[] args) {
		int n = -3 ; int k = 2;
        System.out.println(pow(n,k));
	}

	private static long pow(int n, int k) {
		long ans = 1 ; int nn = n ;
		
		if(n<0) n = n * -1 ;
		while(k!=0) {
			if(k%2==0) {
				n = n* n ;
				k = k/2 ;
			}else {
				ans = ans * n ;
				k = k - 1 ;
			}
		}
		if(nn<0) ans = (long) (1/ans) ;
		return ans;
	}

}
