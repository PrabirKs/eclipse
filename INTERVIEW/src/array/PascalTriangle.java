package array;
import java.util.*;
public class PascalTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() ;
		
		//pascalTriangle(n) ;
		getrowcoefficint(n);
	}
	
	static void pascal(int n) {
		int[][] triangle =  new int[n][n] ;
	   for(int i = 0 ; i < n ; i++) {
		   for(int j = 0 ; j <= i ; j++ ) {
			   if(j==0) {
				   triangle[i][j] = 1 ;
			   }
			   else if(i==j) {
				   triangle[i][j] = 1 ;
			   }
			   else {
				   triangle[i][j] = triangle[i-1][j] + triangle[i-1][j-1] ;
			   }
		   }
	   }
	   
	   for(int[] rows:triangle) {
		   System.out.println(Arrays.toString(rows) + "\n");
		   
	   }
	   
	}

	
	static void pascalTriangle(int n) {
		ArrayList<ArrayList<Integer>> triangle =  new ArrayList<>()  ;
		
	   for(int i = 0 ; i < n ; i++) {
		   ArrayList<Integer> row =  new ArrayList<>() ;
		     for(int j = 0 ; j <= i ; j++ ) {
		    	 if(j==0) {
		    		 row.add(1) ;
		    	 }
		    	 else if(i==j) {
		    		 row.add(1);
		    	 }
		    	 else {
		    		 row.add(j, triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j) );
		    	 }
		     }
		     System.out.println("row : " + row);
		     triangle.add(row) ;
	   }     
		System.out.println(triangle); 
		
		//System.out.println(triangle.get(0).get(0));
	}
	
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList();
        
        res.add(Arrays.asList(1));   //first store 1 
        
        if(numRows == 1) return res;  // if n == 1 then return
        
        res.add(Arrays.asList(1, 1));  //then add 1,1 as second row
        
        for(int i = 2; i < numRows; i++) {         //the calculation began from here 
            List<Integer> curr = new ArrayList();  //create a new arraylist as curr row
            List<Integer> prev = res.get(i - 1);   //get the prev arraylist from the res
            
            curr.add(1);                           //at begining add 1 
            
            for(int j = 1; j <= i-1; j++) {        //and after that , just calculate the before blocks addition
                
                curr.add(prev.get(j-1) + prev.get(j));  // the block just above and the prev block
            }
            
            curr.add(1);                        //add 1 at the last 
            res.add(curr);                      //add the fully prepared row to the res list
        }
        return res;
    }
	
	// this is same but using while loop
	static void getrowcoefficient(int n) {
		int q = 1 ; int p = n ; int numrtr = 1 ; int denomtr = 1 ;
		
		while(q!=n+1) {
			 System.out.println("p= "+p + "q= " + q);
			 numrtr = numrtr * p-- ;
			 denomtr = denomtr * q++;
			 System.out.println(numrtr/denomtr + " ");
		}
	}
	
	// by this we can get the binary coefficient of any row .
	static void getrowcoefficint(int n) {
		// for the first value it is one so res = 1 ;
		int res  = 1 ; int k = n ;
		for(int i = 0 ; i < k ; ++i) {
		    res = res * (n-i) ;
		    res = res / (i+1) ;
		    System.out.print(res+" ");
		}
	}

}
