package accioJob;
import java.util.*;
import java.io.*;

public class Pattern {
	static void PrintPattern(int n,int c) {
		if(n==c) 
		return;
		if(n>0) {
		System.out.print(n);
		PrintPattern(n-5,c); }
		else if(n<=0) {
			System.out.print(n);
		PrintPattern(n+5,c);}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   //your code here
	      Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      System.out.print(n+" ");
	      
	      PrintPattern(n-5,n);

	}

}

/*import java.util.*;
import java.io.*;

public class Main {
   static void Pattern(int n, int m, boolean flag)
    {
         
      
        System.out.print(m + " ");
 
        if (flag == false && n == m)
            return;
 
        if (flag) {

            if (m - 5 > 0)
                Pattern(n, m - 5, true);
 
            else 
                Pattern(n, m - 5, false);
        }
 
        else 
            Pattern(n, m + 5, false);
    }
    public static void main(String args[]) {
     
    }
}
*/