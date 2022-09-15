package recursionKK;
import java.util.*;
public class Permutation {

	public static void main(String[] args) {
		permuatation("","abc") ;
	
//		digit("","89") ;
      //  System.out.println(digitreturn("",""));
		

	}
   // the intuition behind this thing is , every time the recursive call is depending upon the varible length,
   // that is if the p = ab (length = 2 ) then we can insert another character 'c' at [ 1. the begining  2. at the middle  3. at last ]
   // so here 3 function call , (2+1)
	static void permuatation(String p , String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return  ;
		}
		
		char charAt0 = up.charAt(0) ;
		System.out.println("p = [" + p +"]  up = [" + up + "]");
	    System.out.println("charAt0 : " + charAt0 + " | p.length :" + p.length());
		for(int i = 0 ; i <= p.length() ; i++) {
			String first = p.substring(0,i) ;         // take the first part of the string ,from 0 to i , then add charAt(0) , and then  
			String last = p.substring(i,p.length()) ; // add the last part , from i -> p.length() . 
			
			System.out.println("i = " + i + " first : " + first + "  last : " + last  );
			permuatation((first + charAt0 + last) , up.substring(1)) ;
		}
	}
	
	static void digit(String p , String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return ;
		}
		
		int range =(int)up.charAt(0) % 48;   //just getting the range value ,1,2 or ...9
		char ch = (char)(97+((range-1)*3)) ; // then getting the first letter of that range
		int  j = 0 ;                         //for a -> ad,ae,af so , j = 0,1,2
		for(int i = (range-1)*3 ; i < (range*3) ; i++ ) {
		    if(i!=26) {                                       //for digit 9 , only 2 letter y,z and we start from 0 based digit i.e a=0 , b= 1 ... s0 26 skipped
			digit(p + (char)(ch+j) , up.substring(1)) ;
			j++ ;
		   }
		}
	}
	
	static ArrayList<String> digitreturn(String p , String up) {
		if(up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>() ;
			list.add(p) ;
			return list ;
		}
		ArrayList<String> ans =  new ArrayList<>() ;
		int range =(int)up.charAt(0) % 48;   //just getting the range value ,1,2 or ...9
		char ch = (char)(97+((range-1)*3)) ; // then getting the first letter of that range
		int  j = 0 ;                         //for a -> ad,ae,af so , j = 0,1,2
		for(int i = (range-1)*3 ; i < (range*3) ; i++ ) {
		    if(i!=26) {                                       //for digit 9 , only 2 letter y,z and we start from 0 based digit i.e a=0 , b= 1 ... s0 26 skipped
			ans.addAll(digitreturn(p+(char)(ch+j) , up.substring(1))) ;
			j++ ;
		  }
	   }
		return ans ;
    }
}
