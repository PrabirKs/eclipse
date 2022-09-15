package KunalKushwa;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
public class MultAryList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();

		 for(int i=0;i<3;i++) {
			 list.add(new ArrayList<>());
		 }
		; 
		 for(int i=0;i<3;i++) {
			 for(int j=0;j<3;j++) {
				 list.get(i).add(sc.nextInt());
			 }
		 }
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(0).get(0));
		
		//list.add(4,list.add(4));  //see it later
		
	}

}
