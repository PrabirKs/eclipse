package polymorfisim;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape =new Shape();
		Circle circle=new Circle();
		
		Shape sq=new Square();     //they are giving the same result ,if there will be no method name area will be in the Shape class then it will
		//show error , but if it has a method name area still it is calling to the child class method
		//Square square1=new Square();
		
		sq.area();    // the reference variable of the base class also calling the 
	//	square1.area();   // child class object because it is initialized wit that object
		
		//shape.area();
       
	}

}
