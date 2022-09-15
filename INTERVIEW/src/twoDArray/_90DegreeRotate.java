package twoDArray;

public class _90DegreeRotate {

	public static void main(String[] args) {
		int n = 4 ;
		int[][] arr = {{1, 2, 3, 4},
				       {7, 8, 9, 10},
				       {13,14,15,16},
				       {19,20,21,22},
				      }  ;
		
		rotate(arr,n) ;
	}
    // TC : o(n^2) sc: n^2
	private static void solve(int[][] arr, int n) {
		int i = 0 ; int j = 0 ;
		int matrix[][] =  new int [n][n] ;
		 for(i = 0 ; i < n ; i++) {
			 for(j = 0 ; j < n ; j++) {
				 matrix[i][j]  = arr[n-j-1][i] ;
			 }
	     }
		 
		 for(int row[] : matrix) {
			 for(int col : row) {
				 System.out.print(col + " ");
			 }
			 System.out.println();
		 }
    }
	
	// reducing space complexity , to o(1)
	//first transpose the matrix   [1 2 3]        [1 4 7]
	//                             [4 5 6]   -->  [2 5 8]  (coloumn will be row and row will be coloumn)  then reverse each row , to get
	//                             [7 8 9]		  [3 6 9]  90 degree rotation  741 , 852 , 963


    static void rotate(int[][] arr,int n) {
 //   	boolean flag = false ;
//    	 for(int i = 0 ; i < n ; i++) {
//			 for(int j = 0 ; j < n ; j++) {
//				 if(i==j) flag = true ;
//				 if(flag) {
//				 int temp = arr[i][j];
//				 arr[i][j] = arr[j][i] ;
//				 arr[j][i] = temp ;
//				 }
//			 }
//			 flag = false ;
//	     }
    	
    	//no flag var is required just run the loop j = i -> n
    	 for(int i = 0 ; i < n ; i++) {
			 for(int j = i ; j < n ; j++) {
				 int temp = arr[i][j];
				 arr[i][j] = arr[j][i] ;
				 arr[j][i] = temp ;
				 }
			 }
	     
    
    	 for(int i = 0 ; i < n ; i++) {
    		 for(int j = 0 ; j < n/2 ; j++) {
    			 int tmp = arr[i][j] ;
    			arr[i][j] = arr[i][n-j-1] ; 
    			arr[i][n-j-1] = tmp ;
    		 }
    	 }
    		
    	 for(int row[] : arr) {
			 for(int col : row) {
				 System.out.print(col + " ");
			 }
			 System.out.println();
		 }
    }

}
