package userInput;
import java.util.Scanner;
public class ScannerUserInput {
    static void change(int[] ar) {
    	ar[0]=5;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner a= new Scanner(System.in);
		System.out.print("Enter value of x\n"+"x=");
		int x=a.nextInt();
		System.out.println("Value of x=" + x); */
		
		int arr[]= {1,2,3,4,5};
		change(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
			
		}

	}

}
