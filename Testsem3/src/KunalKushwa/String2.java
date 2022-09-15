package KunalKushwa;

public class String2 {

	public static void main(String[] args) {
		//direct initialisation
	       //when we create any string , it's object is created inside the heap , and direct declaration like this , create a 
		   //stiring constant object  inside the string  pool, 
	       String a="kunal";   
	       String b="kunal"; //now the (b) is just pointing to the same "kunal" object inside the string constant pool .
	     
	       System.out.println(a==b);  //true, same reference variable and same object (== check the reference variable not values)
	       
	       String aa = "kunal" ; //first check for any string constant is present in the heap or not ,  if not present then create
	                            //a new string constant , else point to the same constant object
	       
	       
	       //Object initialisation(dynamic)
	       String c = new String("kunal") ; // create 2 new string object inside the heap and inside the string costant pool also,
	                                        // but the reference var in the stack points to the "kunal" in the normal heap , not in the
	                                        //pool .
	       System.out.println(a==c);   // false though the value is same , but the reference variable are different
	       
	       a="prabir";
	  
	       System.out.println(a==b);  //false,  same type reference variable but poinnting to  different object in the string pool
	       
	       String s=new String("prabir");
	       String p=new String("prabir");
	       System.out.println(s.equals(p));
	       p = "kumar" ;  //create a new string constant object inside the pool and points to it
	       
	       // now if we  create [ p = "prabir" ] , it will point to the "prabir" at the pool
	       // but if we create [p = new String("prabir") , then it will create a new string at the heap and points to it .
	       p = new String("prabir") ; 
	       System.out.println(a==b); //false , different reference varible,though value is same
	       
	       System.out.println(s.equals(p)); //true,only check for values and value is same so 
	       
	       // S.compareTo(p)  // compare the lexigraphically  (for s==p -> 0 , for s<p -> -1 , for s>p -> 1(positive value)
	       
	       System.out.println(s.compareTo(b));

	}

}
