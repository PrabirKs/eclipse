package encapsultion;
public class Subsubclass extends SubClss {
	int subsubvar;
	public Subsubclass(int num, String name, int protectnum, int subvar,int subsubvar) {
		super(num, name, protectnum, subvar);
		this.subsubvar=subsubvar;
	}

	public static void main(String[] args) {
		 	
			Subsubclass obj3=new Subsubclass(12,"kk",44,23,55);
			obj3.protectnum=9;  //it is also accsible here
			
			System.out.println(obj3.getClass().getClasses());    //get classes has so many methods to check details about the class
		}


	}


