package sortng;

import java.util.Scanner;

public class JavaShortCuts {

	public static void main(String[] args) {
		String s = " i am a boy"; // upper case -> lower case (alt + shift + x/y)
		// 2. wanna move a block of line to up or down so just select the line and (alt
		// + up-arrow)
		// 3. want to create getter and setter for a class so just do one thing ,
		// rght click - > source - > getter seter (alt + shift + s + r )
		// 4. and for constructor - > alt + shift + s + o

		Scanner sc = new Scanner(System.in); // 5 .ctrl + shift + o , automatically import class

		/*
		 * int a = 89 ; int b = 0 ; int c = 8 ; // 6 .multiline comment ,( ctrl + shift
		 * + / )
		 */
		int age = 90;
		age = 89;
		age = 78; // 7 .where you want to rename a variable (alt + shift + r)

		// 8 . when theer is a ugly code block then just (ctrl + shift + f)
		//9. if you have a code block and you want to make a new method by using this, so just do
		//select all the cdde you want , then (alt + shift + m )
		
		checker(age);

	}

	private static void checker(int age) {
		if(age>99) {
			System.out.println("i am elder");     //10 .wanna know the fun call hieraRCHY (CTRL + ALT + H )
		   //PRESS F4 IN CASE OF SEE THE CLASS HIERARCHY
		}
	}
	
	//11.  type(CTRL + SHIFT + P ) -- > GO TO THE END OF A OPENEING BRACES
	//12. F3 - >  go to the declarartion of any variable or functoin
	//13. CTRL +  SHIFT + R  ->  search any java file
	//14.CTRL + F11   -> RUN 
	//CTRL + SHIFT + L  -> ALL shortcuts

}
