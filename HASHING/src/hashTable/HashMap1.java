package hashTable;
import java.util.*;

public class HashMap1 {
       public static void main(String[] args) {
	       Scanner sc =  new Scanner(System.in);
	       HashMap<Integer,String> map=new HashMap<Integer,String>();
//	       
//	       map.put(1,"monday");
//	       map.put(2, "tuesday");
//	       map.put(3, "wednesday");
//	       map.put(4,"thursday");
//	       map.put(5, "friday");
//	       map.put(6,"saturday");
//	       map.remove(2); //remove delete that bucket from the table 
//	       System.out.println(map.get(3));       
	       int i=0;
	       while(i<5) {
	    	  // map.put(i, sc.next());
	    	   map.put(sc.nextInt(),sc.next());
	    	   i++;
	       }
	       
	       map.put(6,"rakesh");
	       
//	     for(String val: map.values()) {                // this map.values() will give the values corresponding to each key in an order;
//	    	   System.out.println(val);
//	       }
//	     for(Integer KEY: map.keySet()) {                // this map.keySet() will give the keys corresponding to each VALUE in an order;
//	    	   System.out.println(KEY);
//	       }
	       for(Integer KEY: map.keySet()) {               
            	   System.out.println(KEY +" " +map.get(KEY));   //ways to get print the key and the value
          }
	       
	     System.out.println("______________________________________________________________________");  
	       
	      HashMap<Integer,String> copy=(HashMap<Integer, String>) map.clone(); // copy a table from a hash map to another map
	      
	//     copy.put(7,"rak");   // cant able to add i cant know whAT IS THE CAUSE
	      
	      for(Integer KEY: copy.keySet()) {               
       	   System.out.println(KEY +" " +map.get(KEY));   //ways to get print the key and the value
     }
	       
    }
       
}
