package iteration;

/* public class VarArgs {

	static void vaTest(int v[]){
		System.out.print("Number of args: " + v.length + " contents: " );
		
		for(int x:v) {
			System.out.print(x + " ");
		}
		System.out.println();
		
	}
	
	public static void main(String args[]) {
		int n1[]= {10};                                //first array decalration
		int n2[]= {1,2,3};
		int n3[]= { };
		
		vaTest(n1);                                    //then calling using array variable
		vaTest(n2);
		vaTest(n3);
	}

}
*/
  //Not only it is tedious to construct a arrsy 
public class VarArgs {
	static void vaTest(int ...v) {
		System.out.print("Number of args :" + v.length + " contents: ");
		
		for(int x:v) {
			System.out.print(x + " ");
			}
		System.out.println();
	}
	
	public static void main(String args[]) {
		                               //notice how  vaTest() can be called with a variable number of arguements
		
		vaTest(10);                   //the vaTest method is static so it is called without using any arguements
		vaTest(1,2,3);
		vaTest(1,4,6,7);
		vaTest();
	}
	
}
