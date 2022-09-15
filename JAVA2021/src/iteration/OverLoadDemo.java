package iteration;

public class OverLoadDemo {
	void test() {
		System.out.println("no parameters");
	}
	void test(double a) {
		System.out.println("a=" + a);
		
	}
	void test(int a,int b) {
		System.out.println("a="+a + " b=" +b);
		
	}
	
}

class overload{
	public static void main(String args[]) {
		OverLoadDemo ob=new OverLoadDemo();
		int i=88;
		ob.test();
		ob.test(i);                     //this is the integer type parameter but in fuction there is a double type parameter so when the compiler not 
		ob.test(12,23);                 //get the int it automatically make type conversion to double.
	}
}
