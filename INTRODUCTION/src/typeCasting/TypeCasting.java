package typeCasting;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Automtic TypeCasting
		//Precedence Order
    /*byte||short||char||int||long||float||double */	
		byte x=4;
		int y=x;
		System.out.println("x="+x);
		System.out.println("y="+y);
		int a=12;
		float b=a;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		//Manual TypeCasting
		float m=8.154f;
		int n=(int)m;
		System.out.println("m=" +      m);
		System.out.println("n=" + n);
		
		
	}

}
