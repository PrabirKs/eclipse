package iheritance;

class A{
	int i,j;    // depends on the object of the class
	int p=10;   //value will remain same in sub and super class
	void showij()
	{
		System.out.println("i and j=" +i + "  " +j);
		System.out.println("p=" +p);
		
	}
	void mult()
	{
		System.out.println("i*j=" + i*j);
	}
}
//creat a subclass by extending A
class B extends A
{
	int k;
	
	void showk()
	{
		System.out.println("k= " +k);
		System.out.println("p= " +p);
		
	}
	void sum()
	{
		System.out.println("i+j+k=" + (i+j+k));
	}
}


public class SingleInheritance1 {

	public static void main(String[] args) {
	
		A superobj=new A();
		B subobj=new B();
		
		//The super class can use by itself
		superobj.i=15;
		superobj.j=30;
		
		System.out.println("showing super class content");
		superobj.showij();

		//the subclass has all access to the data member and the method of the super class
		subobj.i=400;
		subobj.j=500;
		subobj.k=100;
		System.out.println("\nshowing subclass content");
		subobj.showk();
		System.out.print("sum oln_________________________________________");
		subobj.showij();
		System.out.println("__________________________________________");
		superobj.showij();
		System.out.println("__________________________________________");
		System.out.println("the i ,j ,k in subclass=" );
		subobj.sum(); 
		System.out.println("__________________________________________");
		subobj.mult();
		superobj.mult();
	}

}
