package classobject1;
class perimeter
{
	int length;
	int breadth;
	
	//default constructor
	perimeter()
	{
		length=2;
		breadth=3;
	}
	//parameterized constructor
	perimeter(int x,int y)
	{
		length=x;
		breadth=y;
	}
	void cal_perimeter()
	{
		int peri;
		peri=2*(length+breadth);
		System.out.println("area of rectangle=" + peri);
	}
}

public class Constructor1 {

	public static void main(String[] args) {
		perimeter p1=new perimeter();
		perimeter p2=new perimeter(10,15);
		p1.cal_perimeter();
		p2.cal_perimeter();
		
		

	}

}
