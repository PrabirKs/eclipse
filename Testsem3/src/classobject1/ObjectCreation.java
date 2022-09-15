package classobject1;

class Rectangle
{
	int length,width;
	void getdata(int x,int y)           //definition of first method
	{
		length=x;
		width=y;
	}
	
	int rectarea()                      //definitoin of second method
	{
		int area=length*width;
		return (area);
	}
	
	
}

public class ObjectCreation {

	public static void main(String[] args) {
		int area1,area2;
		Rectangle rect1=new Rectangle();
		Rectangle rect2=new Rectangle();
		
		rect1.length=12;
		rect1.width=10;
		area1=rect1.length * rect1.width;
		rect2.getdata(10,15);
		area2=rect2.rectarea();
		System.out.println("area1=" + area1);
		System.out.println("area2=" + area2);
		
		
		

	}

}
