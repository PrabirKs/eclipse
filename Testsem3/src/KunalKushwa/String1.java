package KunalKushwa;

import java.util.Arrays;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(56);   // public static String valueOf(int i) {
                                  //        return Integer.toString(i);
                                   //       }

		System.out.println("kunal");
		System.out.println(Arrays.toString(new int[] {1,2,3,4}));
		
		int a[]= {1,23,4,5,34,56,32,12};
		System.out.println(Arrays.toString(a));
		
		@SuppressWarnings("deprecation")
		Integer num=new Integer(56);              //integer wrapper class
		System.out.println(num.toString());
	
		//primitives are stored in stack memory and others are stored in heap memory.
		
		
		System.out.println("fsfss");
		
		//the println method is getting overloaded for various data type.
		/*
	         	public void print(String s) 
	         	 {
                    write(String.valueOf(s));
                 }
        */

		String ab=null;
		System.out.println(ab);  //print null
		
		
		String str = "prabir" ;
		str = str + "kumar"	 ; 
		System.out.println(str);
	    concat(str) ;
		System.out.println(str);
		
	}
	static void concat(String str) {
		str = str + "sahoo" ;  // here the string is act as immuatble so cant be change , 
		
	}

}
