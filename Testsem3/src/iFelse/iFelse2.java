package iFelse;
import java.util.Scanner;
public class iFelse2 {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in) ;
        String s = "A man, a plan, a canal: Panama" ;
  //    char  chj = 'a' ;
   //     System.out.println(chj+32 != (int)'A');
        check(s) ;

	}
	static void check(String s) {
		  int i = 0 ; int j = s.length() -1 ;
	        if(s.length() <= 1){
	          System.out.print("1") ; return ;
	        }
	        while(i < j){
	          char  chi = s.charAt(i) ;
	          char  chj = s.charAt(j) ;
	          if  ( !( (chi>='a' && chi <='z') || (chi>='A' && chi <='Z') ) ){
	            i++ ;
	            continue ;
	          }

	          if  ( !( (chj>='a' && chj <='z') || (chj>='A' && chj <='Z') ) ){
	            j--;
	            continue ;
	          }
	          if( ( (chj>='a' && chj <='z') || (chj>='A' && chj <='Z') ) || ( ( (chi>='a' && chi <='z') || (chi>='A' && chi <='Z') ) )){
	           
	        	  
	        	  if( chi!=chj && (chi+32 != (int)chj && chi-32 != (int)chj) ){
	              System.out.println("0") ;
	              return ;
	            }
	        	  i++ ; j-- ;
	          }
	       }
	      System.out.println("1") ;
	}
 }


