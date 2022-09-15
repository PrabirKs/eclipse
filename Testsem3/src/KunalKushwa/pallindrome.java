package KunalKushwa;

import java.util.Arrays;

public class pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abcba";
	  System.out.println(a.length());
	
		int length=a.length();
		
		for(int i=0;i<length/2;i++)
		{
			if(a.charAt(i)!=a.charAt(length-i-1))
			{
				System.out.println("not pallindrome");
				return;
			}
		}
		System.out.println("pallindrome");
		

}
}