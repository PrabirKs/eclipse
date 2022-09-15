package patternPrint;

public class HourGlass {

	public static void main(String[] args) {
		int n = 7 ;
		
		for(int i = n ;i > 0 ; i--) {
			for(int j = 0 ; j < n-i ; j++) {
				System.out.print(" ");
			}
			for(int k = n - i + 1 ;k <= n ;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		for(int i = n-1 ;i > 0 ; i--) {
			for(int j = i-1 ; j > 0 ; j--) {
				System.out.print(" ");
			}
			for(int k = i;k <= n ;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}

/*
1 2 3 4 5 6 7 
 2 3 4 5 6 7 
  3 4 5 6 7 
   4 5 6 7 
    5 6 7 
     6 7 
      7 
     6 7 
    5 6 7 
   4 5 6 7 
  3 4 5 6 7 
 2 3 4 5 6 7 
1 2 3 4 5 6 7 

 */
