package iteration;

public class SuperDemo {
	int a=10;
	void print() {
		System.out.println("Super class method");
		
	}
}
class child extends SuperDemo{
	
    int a=20;
    void print() {
    	 super.print();
    	System.out.println("sub class constructor");
    	System.out.println("a=" + super.a);
    	System.out.println("a=" + a);
    }
	public static void main(String[] args) {
	  child ob=new child();
	  ob.print();
	  
	 }

}
