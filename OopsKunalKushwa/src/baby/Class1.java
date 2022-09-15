package baby;
import child.Brata;

public class Class1 {

	public void display() {
		System.out.println("hey im ok");
	}
	public static void main(String[] args) {
		
		Class_2 object=new Class_2(); 
		//class_2 is in the same package as that of Package_01 
		//so we can also access that class inside the class_01 
		// and can also invoke the public function of that clss 
		object.fun(5);
		
		//if we want to access any class outside of this package then 
		// we have to first import that package.
		
		//lets take an example of accesing the function "square of class Brata
		 
		
		 Brata ob1=new Brata(); // this can't be done without importing the class
		 //through its package 
	//	System.out.print(ob1.square(8));
		
		
		
	}
	
	
	
	
	
	
	
	
}
