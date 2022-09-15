package userInput;
import java.util.Scanner;

public class SimpleIntrest {

	          public static void main(String[] args) {
	        	  
	        	  Scanner sc=new Scanner(System.in);
	        	  
	        	  int principal;
	        	  int year;
	        	  float rate;
	        	  float intrest;
	        	  System.out.print("Enter Principal amount\n"+"principal=");
	        	  principal=sc.nextInt();
	        	  System.out.print("\nEnter time Period\n"+"year=");
	        	  year=sc.nextInt();
	        	  System.out.print("\nEnter Rate of Intrest\n"+"rate=");
	        	  rate=sc.nextFloat();
	        	  intrest=(principal*year*rate)/100;
	        	  System.out.println("\nSimple Intrest="+ intrest);
	        	  
	         }

}
