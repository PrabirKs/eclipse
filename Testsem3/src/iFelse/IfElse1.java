
package iFelse;
import java.util.*;

public class IfElse1 {

public static void main(String[] args) {
//	Scanner sc =  new Scanner(System.in) ;
//    int n = sc.nextInt() ;
//	
//	int arr[] =  new int[n] ;
//	
//	for(int i = 0 ; i < n ; i++) {
//		arr[i] = sc.nextInt() ;
//	}
//int m = sc.nextInt() ;
//	
//	int arr1[] =  new int[m] ;
//	
//	for(int i = 0 ; i < m ; i++) {
//		arr1[i] = sc.nextInt() ;
//	}
//	
//	System.out.println(count(arr));
//	System.out.println(count(arr1));
	int x = 1534236469 ;
	     // 964632435
	  int temp = x ;
      int reverse = 0 ;
      while(Math.abs(x) > 0){
          int rem = x % 10 ;
          reverse = reverse * 10 + rem ; 
          if(temp > 0 && reverse < 0 || temp  < 0 && reverse > 0)  {
        	  System.out.println("0");
          }
          x  = x / 10 ;
      }
	
      System.out.println(reverse);
  }

private static int count(int[] arr) {
	int count = 0 ;
	for(int i = 0 ; i < arr.length ; i++) {
		if(arr[i] == 3685) {
			count++ ;
		}
	}
	return count;
}




}




/*
{
	     int choice;
	     char color='0';
		 Scanner a=new Scanner(System.in);
		 System.out.println("ENTER Your Choice");
		 choice=a.nextInt();
		   if(choice==1)
			   color='R';
		     else if(choice==2)
			     color='G';
		        else if(choice==3)
		        	color='w';
		           else if(choice==4)
		        	   color='Y';
		  System.out.println("color=" + color);
		   
          
	    }
6
40 50 60 60 70 80
9
40 60 70 88 90 20 45 60 10
	
3670 
3674 
3677 
3684 
3695 
3714 
3720

3670 3674 3677 3684 3695 3714 3720 

*/