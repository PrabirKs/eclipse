package KunalKushwa;

public class StrBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		StringBuilder builder=new StringBuilder();
	

		for (int i = 0; i < 26; i++) {
			char ch=(char)('a'+i);
			builder.append(ch);
		 }
		System.out.println(builder.toString());
		
		builder.deleteCharAt(0);
		System.out.println(builder.toString());
		
		builder.reverse();
		System.out.println(builder.toString());
		
	 	
	}
}
