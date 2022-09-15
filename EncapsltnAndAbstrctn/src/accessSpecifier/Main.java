package accessSpecifier;

public class Main {

	public static void main(String[] args) {
		Tiger obj1=new Tiger(12,"prabir",99);
		System.out.println("num="+obj1.defaultnum);      // if num has no access specifier then it is accessible within any class inside the same package
		System.out.println("num="+obj1.protectnum);      //protect also accessible
		
		
//		System.out.println("name:" + obj1.name);  // private variable can't also accessible in same package
//	    obj1.privatename="cat";	  // can't possible
		
		System.out.println("name: "+ obj1.getPrivatename());  // accessible only via the getter(member function) of that class
		obj1.setPrivatename("cat");
		System.out.println("name: "+ obj1.getPrivatename()); 
	}

}
