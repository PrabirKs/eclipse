package KunalKushwa;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
public class ArList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>(2);
		
		/*list.add(23);
		list.add(67);
		list.add(232);
		list.add(29);
	
		System.out.print(list);
		System.out.println(list.contains(23));
		
		list.set(2,34); System.out.print(list);
		list.remove(3); System.out.print(list);  */
		
		for(int i=0;i<10;i++)
		{
			list.add(sc.nextInt());
		}
		
		for(int i=0;i<10;i++)
		{
			System.out.print(list.get(i)+" "); //get item as per index
		}                                      //list[index] don't work;
		list.add(1,589);  //add at index
		
	System.out.print(list);
	}

}
