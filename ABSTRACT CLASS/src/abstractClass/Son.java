package abstractClass;
import java.util.*;
public class Son extends Parent {

	public Son(int weight) {
		super(weight);         //it willl caall to the base class costructor
	}
	@Override
	void carrer(String name) {
          System.out.println("son wants to be a "+ name);
          
		
	}

	@Override
	void partner(int age) {
	     System.out.println("son partner age is: "+ age);
		 System.out.println("weight is:"+ weight);
	}
	public static void main(String[] args) {
		Stack<Integer> s  =  new Stack<>() ;
		s.add(1) ;
		s.add(2) ;
		s.add(3) ;
		System.out.println(s.lastElement());
		System.out.println(s.firstElement()) ;
	}
     
}
