package KunalKushwa;
import java.io.*;
import java.util.*;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[4][3];
		for(int i=0;i<4;i++)
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		for(int i=0;i<4;i++)  { 
			
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
       System.out.println();
		}
		
//************************************************************************		
		for(int x[]:arr) {
			for(int y:x) {
				System.out.print(y+" ");
				}
			 System.out.println();
		}
//**************************************************************************		
		for(int x[]:arr)
		{
			System.out.println(Arrays.toString(x));
		}
//***************************************************************************		
	}

}
