package KunalKushwa;

public class Performance {

	public static void main(String[] args) {
		String Series="+=";
		
		for (int i = 0; i < 26; i++) {
			char ch=(char)('a'+i);
			System.out.print(ch+" ");
			Series=Series+ch;         //not changing the string its just creating new string every 
			//1. +a                          //time and then the previous object is go to garbage collection
			//2. +ab
		}   //3. +abc    
		
		//  1+2+3+4+5+6.......+26
		//n(n+1)/2  O(n^2)
		
		System.out.print("\n"+Series);

	}

}
