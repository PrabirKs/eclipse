package polymorfisim;

public class Circle extends Shape{
	
	@Override  //this is called the annotation used to just check whether a method is overridden or not
       public void area() {
    	   System.out.println("area of circle is pi*r*r");
       }
}
