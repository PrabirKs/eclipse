package bitManipulation;

public class UpperToLowerCase {

	public static void main(String[] args) {
		for(char c = 'A'; c<='C' ; c++)
			System.out.println(c +"->"+ (int)c + "->" +Integer.toBinaryString(c));
		System.out.println("__________________________");
		for(char c = 'a'; c<='c' ; c++)
			System.out.println(c +"->"+ (int)c + "->" +Integer.toBinaryString(c));
		// A = 1000001
		// a = 1100001    we can observe that the second last digit , the digit before the most significant bit(msb) is 1 in lower case and all other digit are same
	    //                so to convert upper case to lower case we just have to set the 5th bit 
		System.out.println("__________________________");
		char given = 'B';
		char res = (char) (given | (1<<5));
		System.out.print(res);  //B->b
		// lets find what 1<<5 is in character
		System.out.print((char)(1<<5));   // its a space so now by just making or(|) of the given char with (' ')  space
		                                    // we can convert upper to lower
		res = (char)(given | ' ');
		System.out.println(res);
		// like wise to lower case to upper case we just unset the 5th bit
		given ='b';
		res = (char) (given & ~(1<<5));
		System.out.print(res); //b->B
		                 //lets find what  ~(1<<5)  = ~(100000) = 011111
	//	System.out.println(Integer.toBinaryString((int)'_'));  //1011111  // here the 5th bit is set and all are unset
		                                                     // by just making and with the given number 
		res = (char) (given & '_');
		System.out.println(res);
		System.out.println("__________________________________________________________"); 
		
		int ch = 'A';
		System.out.println("A -->"+(char)(ch | ' '));
		ch = 'a';
		System.out.println("a -->" +(char)(ch & '_'));
	}

}
