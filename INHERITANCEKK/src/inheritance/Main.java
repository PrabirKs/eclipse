package inheritance;

public class Main {

	public static void main(String[] args) {
/*	    Box obj1=new Box();
		System.out.println(obj1.h+" "+obj1.l+" "+obj1.w);
		
		Box obj2=new Box(13,25,56);
		System.out.println(obj2.h+" "+obj2.l+" "+obj2.w);
	//	obj2.weight=78;  //the object of the base  class can't access the memeber of the derived class, but the reverse is true
		Boxweight obj3=new Boxweight();
		System.out.println(obj3.h+" "+obj3.l+" "+obj3.w+" "+obj3.weight);
*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		Box Objbox=new Boxweight(45,65,55,55);    //"Objbox" is the reference variable of Box type but the Object is created of derived class "Boxweight" type
		// though the object can acess all the data member of its class and the base class but the reference variable of base class cant access the derived class memeber
		// so it is not the type of the object rather the type of the reference variable that determines the accesibility
		
		
	//	System.out.println(Objbox.weight); //error     //thats why i cant able to acceess the weight variable of derivd class through the reference var of base class
		//it is possible to assign the reference variable of Base class to point the child classs object , but still it cant access the member of child class
		
	   Boxweight ob3=new Box(Objbox);  //here the reference variable is of Boxweight type , and we know that the reference variable decide the accesibility of memebers
		// so this ob3 should able to access all its member and  of the base class,
		//but the variable yet not intialised and the reference variable of the child class can't point to the object of the base class without (cast) //later will be discussed
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//	System.out.println(ob3.);
		Boxprice box1=new Boxprice(5,7,8);
		
 
	}

}
