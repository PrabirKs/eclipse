package practise1;

import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		try {
			int choice= System.in.read() ;  // a ->97 and if casted (char) then a-> a
			
			  System.out.println(choice);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
	}
   // here System.in.read() ; just take the input as character from the keyboard and convert it to int .
}
