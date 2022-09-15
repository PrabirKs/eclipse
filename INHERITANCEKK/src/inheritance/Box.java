package inheritance;

public class Box {
	  double l;
	    double h;
	    double w;
 //       double weight;   //added to check the uses of the super keyword when the base class and the derived class has same name variable
	    Box(){
	        this.h=-1;
	        this.l=-1;
	        this.w=-1;
	    }
	    Box(double side){
	        this.h=side;
	        this.l=side;
	        this.w=side;
	    }


	    Box(double l,double h,double w){
	        this.h=l;
	        this.l=l;
	        this.w=w;
	    }
	     Box(Box old){
	        this.h=old.h;
	        this.l=old.l;
	        this.w=old.w; 
	     }
}
