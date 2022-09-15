package bitManipulation;

public class Operator {

	public static void main(String[] args) {
		//use of right shift opearator to divide a number by 2
	    int a = 9 ;
		int b = ~a ; 

		System.out.println(Integer.toBinaryString(~a) +" = " + (b));
		System.out.println(Integer.toBinaryString(a>>>1) +" = " + (a>>>1));
		
		System.out.println(Integer.toBinaryString(a>>1) +" = " + (a>>1));		
//		System.out.println(Integer.toBinaryString(a>>2) +" = " + (a>>2));
//		System.out.println(Integer.toBinaryString(a>>3) +" = "+ (a>>3));
//		System.out.println(Integer.toBinaryString(a>>4) +" = " + (a>>4));
//		
		
//		//use of left shift operator to multiply by 2
//		int b = 5 ;
//		System.out.println("------------------------" + (b<<3)) ;
//		System.out.println(b<<2) ;
//		
//	
//		
		int d = 14;
		System.out.println(d<<1>>1>>1<<2);  //works
//		
//	   // 2 to the power 
//		System.out.println(" '2 to the power' ");
//		System.out.println("-----------------------------");
//		for(int i=0;i<10;i++) {
//			System.out.println(1<<i);
//		}
//		
	}

}
