package recursionKK;

public class Nqueens2 {

	public static void main(String[] args) {
		int n = 19 ;
		String chess[][] = new String[n][n] ; 
		for(int i = 0 ; i < n ; i ++) {
			for(int j = 0 ; j < n ; j++) {
				chess[i][j] = "." ;
			}
		}
		boolean up[] = new boolean[n] ;
		boolean leftDiagonal[] = new boolean[2*n] ;
		boolean rightDiagonal[] = new boolean[2*n] ;
		solve(chess,0,n,up,leftDiagonal,rightDiagonal);	
     }

	private static void solve(String[][] chess, int row, int n,boolean up[],boolean leftDiagonal[],boolean rightDiagonal[]) {
	    if(row==n) {
	    	display(chess,n) ;
	    	return ;
	    }
		
		for(int i = 0 ; i < n ; i++) {
			if(issafe(row,i,up,leftDiagonal,rightDiagonal,n)) {
				up[i] = true ;
				leftDiagonal[i-row + (n-1)] = true ;
				rightDiagonal[row+i] = true ;
				
				chess[row][i] = "Q" ;
				solve(chess,row+1,n,up,leftDiagonal,rightDiagonal) ;
				//back track
				chess[row][i] = "." ;
				up[i] = false ;
				leftDiagonal[i-row+(n-1)] = false ;
				rightDiagonal[row+i] = false ;
			}
		}
		
	}

	private static boolean issafe(int row, int i, boolean[] up, boolean[] leftDiagonal, boolean[] rightDiagonal,int n) {
		if(up[i]==true)
		  return false;
		if(leftDiagonal[i-row + (n-1)] == true)
			return false ;
		if(rightDiagonal[row+i] == true)
			return false ;
		return true ;
	}

	static void display(String[][] chess,int n) {
		 for(int i = 0 ; i < n ; i++) {
			 for(int j = 0 ; j < n ; j++) {
				 if(!chess[i][j].equals("Q")){
					 System.out.print(" . ");
				 }else {
					 System.out.print(" + ");
				 }
			 }
			 System.out.println();
		 }
		 System.out.println("--------------------------------------------------------");
	 }

}
