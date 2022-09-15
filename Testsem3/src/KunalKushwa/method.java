package KunalKushwa;

import java.util.Arrays;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="  prabir kumar sahoo ";
		System.out.println(Arrays.toString(name.toCharArray()));
		
	    String s=Arrays.toString(name.toCharArray());
	    System.out.println(s);
	    
	   
	    System.out.println(name.toUpperCase());  //print PRABIRKUMAR
	    
        name.toUpperCase();
        System.out.println(name); //prabirkumar not going to change the original array
        
        name=name.toUpperCase();   // dont just modify it change the reference to point different object
        System.out.println(name);  //print PRABIRKUMAR
        
        System.out.println(name.indexOf('p'));
        
        System.out.println(name.strip());  //remove white space from begining and end
        
        System.out.println(Arrays.toString(name.split(" ")));  //split when space ocur
        

	}

}
