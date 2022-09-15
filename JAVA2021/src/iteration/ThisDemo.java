/*package iteration;

public class ThisDemo {
	int i;
	ThisDemo(){
		this(10);
		System.out.println("non-parameterized constructor");
	}
	ThisDemo(int a){
	//	this();
		System.out.println("parameterized constructor");
	}
	void setValue(int i) {
		this.i=i;
	}
	void display(){
		System.out.println("display method");
		
	}
	void show() {
		System.out.println("value of i=" + i);
		display(); //this.display();  //if you dont use the this keyboard,compiler automaticlly adds the this keyword while invoking the method.
	}

	public static void main(String[] args) {
		ThisDemo td=new ThisDemo();
		ThisDemo td1=new ThisDemo(10);
		td.setValue(100);
		td.show();

	}

}   */



/*

package iteration;
class Test{
	Test(ThisDemo ob){
		System.out.println("Test class constructor");
	}
}

public class ThisDemo {
	int a;

	void m1(ThisDemo obj) {
		this.a=45; //this will refer to the same object
		obj.a=56;  //same
		System.out.println("m1 method");
	}
	void m2() {
		m1(this); //this will pass the object by which object the method is called
	}
	
	
	
	
	void display(){
		System.out.println("display method");
		
	}
	void show() {
		System.out.println("value of a="  + a );
		
	}

	public static void main(String[] args) {
		ThisDemo td=new ThisDemo();
		td.a=20;
		td.m2();
		td.show();
		

	}

}
*/


/*package iteration;

class Tes{
	Tes(ThisDemo ob){
		System.out.println("Test class constructor called");
	}
}  //this can  be used to pass argumwnts to the constru

class ThisDemo{
	void m1() {
		Tes t=new Tes(this);
	}
	public static void main(String[] args) {
		ThisDemo d=new ThisDemo();
		d.m1();
	}
} */


package iteration;
class ThisDemo{
	ThisDemo m1() {
		System.out.println("hii");
		return this;    //return current class instance
	}
	public static void main(String[] args) {
		ThisDemo t=new ThisDemo();
		t.m1();
	}
}




