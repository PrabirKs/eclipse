package practise1;
import java.util.Scanner;

public class InputCastOutput {
	   public static void main(String[] args)
	   {
		   //Area Of A Triangle
		   float side1,side2,side3,Perimeter;
		   int s;
		   Scanner sc= new Scanner(System.in);                //INPUT
		   System.out.print("Enter side 1 of Triangle(in m)\n" +"Side1=");
		   side1=sc.nextFloat();                              //INPUT
		   System.out.print("\nEnter side 2 of Triangle(in m)\n"+"Side2=");
		   side2=sc.nextFloat();
		   System.out.println("\nEnter side 3 of the Triangle(in m)\n"+"Side3="); //OUTPUT
		   side3=sc.nextFloat();
		   Perimeter=side1+side2+side3;
		   System.out.println("Perimeter="+Perimeter);
		   s=(int)Perimeter/2;                                  //TYPECASING
		   System.out.println("s="+s);
		   int AREA=(s*(s-(int)side1)*(s-(int)side2)*(s-(int)side3));
		   System.out.println("Area Of The Triangle="+ AREA +"sqm");
		   
		 
	
		   
	   }

}
