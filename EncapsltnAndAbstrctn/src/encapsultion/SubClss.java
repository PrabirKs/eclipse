package encapsultion;

import accessSpecifier.Tiger;

public class SubClss extends Tiger {
	
	int subvar;
	
	public SubClss(int num, String name, int protectnum,int subvar) {
		super(num,name,protectnum);
		this.subvar=subvar;
 
	}
	public static void main(String[] args) {
		SubClss subobj=new SubClss(22, "soumya", 88,80);
		
	    System.out.print(subobj.protectnum);
	    
	    Tiger ob=new Tiger(45, "oo", 56);
	
	  //  int n=ob.protectnum;   // even the parent class object cant able to access the protected variable inside a
	  //  different package , only the subclass object of that base class can get access the data
	    
	  //it  may possible that a different package can consists of a class of samename as that of the Tiger class in another 
	    // package so it is prohibited
	    
	
		
	}

}




///public class SubClss extends Tiger{                          //now it will inherited from the base class Tiger present with this package , but if we will
//	//import the accessSpecifier.Tiger and then it will work as above.
//	public static void main(String[] args) {
//		SubClss ob1=new SubClss();
//		ob1.show();
//	}
//}
