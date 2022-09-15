package inheritance;

public class Boxprice extends Boxweight {
	
  double cost;
  
  Boxprice(){
	  super();
	  this.cost=-1;
  }
  
  Boxprice(Boxprice other){
	  super(other);                    // the recent base class should have a constructor to accept the object as argument i.e. copy constructor
	  other.cost=9;
  }
  
  public Boxprice(double l,double h,double w,double weight,double cost){
	  super(l,h,w,weight);
	  this.cost=cost;
  }
  
  public  Boxprice(double side,double weight,double cost) {
	  super(side,weight);    //order of execution of the constructor is started from the first class that means the (super senior-->senior-->junior)
	  this.cost=cost;
  }
  
}
