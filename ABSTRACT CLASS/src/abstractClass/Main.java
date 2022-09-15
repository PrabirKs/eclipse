package abstractClass;

import java.util.Scanner;

public class Main {

	/*public static void main(String[] args) {
		 Son son=new Son(60);
		 son.carrer("engineer");
		 son.partner(20);
		 son.normal(); 
		 
		 Daughter daughter = new Daughter(50);
		 daughter.carrer("pilot");
		 daughter.partner(25);

		// Parent obj=new Parent();  // cant be instantiate the parent class cause , if we use the obj of this class to cll any 
		 //fun then it wll have  no body so it wil create an ambiguity
		 //it is a abstarct class and the objext cant be created.  but the reference variavle
		 //of the abstract class can be created and can be use to call the functoin of the child class
		 // cause it is the type of the object not the ref var that decide to call what function
		 Parent.hello();
	} */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int[][] arr = new int[i][j];
		
		for(int x:arr[0]) {
			System.out.println(x);
		}

	}
}

	