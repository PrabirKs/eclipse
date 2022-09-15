package inheritance;

public class Boxweight extends Box {   // now the derived class Boxweight can access all the public thing in the base class 

   double weight;
   
   public Boxweight() {
	   this.weight=-1;
   }
   //Box ob=new Box(); //by creating the object of box class and then   
   Boxweight(double l,double h,double w,double weight){
	//   ob=new Box(l,h,w);      // invoking the box class constructor, it is ok but it is obivious that they a in three same package 
	      
	   //some times the base clsss also wants to keep its memebers private, in that situation "super" works 
	       super(l,h,w);             //it will call to the base class constructor, automatically the object will assign the variable through super class constructor
	       
	      //if the super constructor will not be called then automatically the default constructor Box() will be called
	     
	       this.weight=weight;      // and add the extra thing to the object that is the weight of the box      
	       
	       //but the base class can't access the variable of derived class
   }
   
  /// // "super" keyword uses to access the base superclass variable i.e. super.variable_name;/////////////
  /*
   void boxwght(double l,double weight) {
	   //here the base class has the 'l' variable and both this.l and super.l refers to the same
	   this.l=l;
	   super.l=l*2;
	   System.out.println(this.l+" "+super.l);
	   
	   //but here i have added a weight variable in the base class so in order to access this we can use "super" keyword and ]
	   // in order to access the same class variable weight, only "this.weight" works
	   
	   this.weight=weight;
	   super.weight=weight*2;
	   System.out.println(this.weight+" "+super.weight);
	   
	   
   }
   public static void main(String[] args) {
	   Boxweight ob5=new Boxweight();
	   ob5.boxwght(1,2);
	
  }  */
   
   Boxweight(Boxweight objct){
	   super(objct);
	   objct.weight=5;
   }
   
   Boxweight(double side,double weight ){
	   super(side);
	   this.weight=weight;
   }
}
