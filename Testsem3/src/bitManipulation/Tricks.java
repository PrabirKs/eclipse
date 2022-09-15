package bitManipulation;

public class Tricks {

	public static void main(String[] args) {
		// to know the odd and even
		// if the no is even then the 0th bit is 0 and if it is odd then the 0th bit is 1 ,, so & 1 with the no if the result is 0 then it is even if it is 1 then it is odd 
		System.out.println("odd even check");
		System.out.println("___________________________");
		int a = 13;
		if((a&1)==1) 
			System.out.println("odd\n");
		else
			System.out.println("even\n");
		
       // muliply and divide by 2
		System.out.println("muliply and divide by 2");
		System.out.println("___________________________");
		                           //           1111
		System.out.println("(15 * 2) = " + (15<<1)); //1111<<1 = 11110 = 30  (15 * 2)
		System.out.println("(15 / 2) = " + (15>>1)); //1111>>1 =   111 =  7  (15 / 2)
	}

}
