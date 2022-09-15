package abstractClass;

public class Daughter extends Parent {

	public Daughter(int weight) {
		super(weight);                     //calling to the base class cnstructor
	}
	
	@Override
	void carrer(String name) {
		  System.out.println("daughter wants to be a "+ name);
		
	}

	@Override
	void partner(int age) {
		System.out.println("daughter partner age is: "+ age);
		 System.out.println("weight is:"+ weight);
	}
	

}
