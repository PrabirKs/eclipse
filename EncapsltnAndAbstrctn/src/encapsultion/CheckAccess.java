package encapsultion;

import accessSpecifier.Tiger;

public class CheckAccess {

    public static void main(String[] args) {
		Tiger obj=new Tiger(14,"lion",88);    // it is obivious that directly we cant declare a object also inside any class inside any other package
		// we have to import that package or class of that package to the current class
		
		// but still after importing the classe and the packages , the accesibility of the data member and the mmeber function is defined on the access specifier 
	   //	System.out.println("num:"+obj.defaultnum);  // not accesible here cz this has a default access specifier .
		
		System.out.println(obj.getDefaultNum()); 
		
	//	System.out.print(obj.protectnum) ;   //protected variable cant be access outside the package 
		
	}
}	


	