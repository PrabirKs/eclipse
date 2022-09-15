package iteration;

public class Test {

	
	void meth(int i ,int j) {
		i*=2;
		j/=2;
		 System.out.println(" a and b inside the function " + i + " " + j);
		
	}
	
	

}
class callbyvalue{
	public static void main(String args[]) {
         Test ob=new Test();
         int a=23,b=73;
         System.out.println(" a and before call " + a + " " + b);
         ob.meth(a, b);
         System.out.println(" a and after call  " + a + " " + b);

	}

} 



/*
package iteration;

public class Test {
	int a,b;

	Test(int i,int j)
	{
		a=i;
		b=j;
	}
	void meth(Test o) {
		o.a*=2;
		o.b/=2;
		 System.out.println(" a and b inside the function " + o.a+ " " + o.b);
		
	}
	
	

}
class callbyReference{
	public static void main(String args[]) {
         Test ob=new Test(10,20);
         System.out.println(" ob.a and ob.b before call " + ob.a + " " + ob.b);
         ob.meth(ob);
         System.out.println(" ob.a and ob.b after call " + ob.a + " " + ob.b);

	}
	//when an object rerference is passed to a method,the copy of that value in the method refers to the same object that
	//its corresponding does.

} 
*/
