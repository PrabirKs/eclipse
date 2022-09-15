package recursionKK;

import java.util.Arrays;

public class NQueens {

	public static void main(String[] args) {
		int n = 4 ;
		String chess[][] = new String[n][n] ; 
		for(int i = 0 ; i < n ; i ++) {
			for(int j = 0 ; j < n ; j++) {
				chess[i][j] = "0" ;
			}
		}
     
		solve(chess,0,n);				
		
	}
 
	static void solve(String[][]  chess ,int row ,  int n) {
		if(row == n ) {
		    display(chess,n) ;
			return ;
		}
		
		for(int i = 0 ; i < n ; i ++ ) {
			if(chess[row][i].equals("0")) {
				chess[row][i] = "Q" ;       // just first make the block Q and 
				setReset(chess,row,i,n,1) ;     // mark all its movable block by adding 1
				solve(chess,row+1,n) ;      //then rec. call for pacing the queen in next row
				setReset(chess,row,i,n,-1) ;      //if this way of placing is known to be a failure
				                              //then came back and reset it before -1 from it
			}
		}
	}
	
	 
   //this fun is just making ocuupy reset together , by taking the extra "value" variable if 1 
	//then set and if -1 then 2+(-1) = 2-1 = 1 reset .ha ha ha 
	static void setReset(String[][] chess , int row , int col , int n , int value) {
			if(value== -1) 	chess[row][col] = "0" ;  //during reset first make Queen block reset
			
			int c = col ;
			for(int i = row+1 ; i < n ; i++) {    //make all its bottom block +1 or -1 as need 
				int val = Integer.parseInt(chess[i][c]) + value ;   
				chess[i][c] = val+ ""  ;
			}
			
			int c2 = col+1 ; int r2 = row+1 ;
			while(c2<n && r2 <n) {               // make all its right corner mark +1 or -1 as need
				int val = Integer.parseInt(chess[r2][c2])+ value ;
				chess[r2][c2] = val+"" ;
				r2++ ; c2++ ;
			}
			
		   int c3 = col-1 ;  int r3 = row+1 ;
		   while(c3>=0 && r3<n) {                //make all its left corner mark +1 or -1 as need
			   int val = Integer.parseInt(chess[r3][c3])+ value ; 
			   chess[r3][c3] = val+"";
			   r3++ ; c3-- ;
		   }
	   } 
	
   static void display(String[][] chess,int n) {
	 for(int i = 0 ; i < n ; i++) {
		 for(int j = 0 ; j < n ; j++) {
			 if(!chess[i][j].equals("Q")){
				 System.out.print(" - ");
			 }else {
				 System.out.print(" # ");
			 }
		 }
		 System.out.println();
	 }
	 System.out.println("--------------------------------------------------------");
 }
 
 
 
 
 
 

 
 
 
 
	
	
	
	
	
		
	static void occupy(String[][] chess , int row , int col , int n) {
		int c = col ;
		for(int i = row+1 ; i < n ; i++) {    //make all its bottom block +1
			int val = Integer.parseInt(chess[i][c]) + 1 ;   
			chess[i][c] = val+ ""  ;
		}
		int c2 = col+1 ; int r2 = row+1 ;
		while(c2<n && r2 <n) {               // make all its right corner mark +1
			int val = Integer.parseInt(chess[r2][c2])+1 ;
			chess[r2][c2] = val+"" ;
			r2++ ; c2++ ;
		}
	   int c3 = col-1 ;  int r3 = row+1 ;
	   while(c3>=0 && r3<n) {                //make all its left corner mark +1
		   int val = Integer.parseInt(chess[r3][c3])+1 ; 
		   chess[r3][c3] = val+"";
		   r3++ ; c3-- ;
	   }
} 
	
	static void reset(String[][] chess , int row , int col , int n) {
		int c = col ;
		chess[row][col] = "0" ;           //first make the queen occupied block reset
		for(int i = row+1 ; i < n ; i++) {
			int val = Integer.parseInt(chess[i][c])-1 ;  //reseting bottom
			chess[i][c] = val+"" ;
		}
		int c2 = col+1 ; int r2 = row+1 ;
		while(c2<n && r2 <n) {
			int val = Integer.parseInt(chess[r2][c2])-1 ;
			chess[r2][c2] = val+"" ;
			r2++ ; c2++ ;
		}
	   int c3 = col-1 ;  int r3 = row+1 ;
	   while(c3>=0 && r3<n) {
		   int val = Integer.parseInt(chess[r3][c3])-1 ; 
		   chess[r3][c3] = val+"";
		   r3++ ; c3-- ;
	   }
 }
 
	
}
