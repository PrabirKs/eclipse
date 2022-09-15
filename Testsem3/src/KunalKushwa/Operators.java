package KunalKushwa;

import java.util.Arrays;

public class Operators {
	public static void main(String args[]) {
		System.out.println('a'+'b');
		
		System.out.println("a"+"b");   // create a new string ab and garbage colection remove a and b
	//	System.out.println("a"-"b");  //error - can't be apply in case of string
		
		System.out.println('a'+3);
		System.out.println((char)('a'+3));
		
		System.out.println("a"+3); //when integer add to string, Integer will be converted to Integer
		                           // its wrapper class, call toString();
		
		System.out.println("kunal"+ Arrays.toString(new int[] {1,2,3,4}));
		
		System.out.println("kunal"+ new Integer(45));
		
		//System.out.println(new integer(45)+Arrays.toString(new int[] {1,2,3,4})); 
		   //throw error
		   //cz atleast one object must be a string type
		
		
		
	}

}
