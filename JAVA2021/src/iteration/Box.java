package iteration;

public class Box {
private double width;
private double length;
private double height;
Box(Box ob){
	width=ob.width;
	length=ob.length;
	height=ob.height;
	
   }
Box(double w,double l,double h){
	width=w;
	length=l;
	height=h;
	System.out.println("execution of box contructor()");
	}
Box(){
	width=-1;
	length=-1;
	height=-1;
	}
Box(double d){
	width=length=height=d;
	}
 double volume() {
	return width*length*height;
}
}
class Boxweight extends Box{
	double weight;
	Boxweight(Box ob,double m){
		super(ob);
		weight=m;
	}
	Boxweight(double w,double l,double h,double m){
		super(w,l,h);
		weight=m;
		System.out.println("execution of boxweight contructor()");
		}
	Boxweight(){
		super();
		weight=-1;
	}
	Boxweight(double d,double m){
		super(d);
		weight=m;
	}
}
class shipment extends Boxweight{
	double cost;
	shipment(Box ob,double m,double c){
		super(ob,m);
		cost=c;
	 }
	shipment(double w,double l,double h,double m,double c){
		super(w,l,h,m);
		cost=c;
		System.out.println("execution of shipment contructor()");
	  }
	shipment(){
		super();
		cost=-1;
	}
	shipment(double d,double m,double c){
		super(d,m);
		cost=c;
	}
	
}
class showcontr{
	public static void main(String args[]) {
		shipment shipment1=new shipment(10,20,30,40,10.4);
		//shipment shipment2=new shipment(5,15,35,45,25.9);
		double vol=shipment1.volume();
		System.out.println("volume of the shipment1: "+ vol);
		System.out.println("weight of the shipment1: " + shipment1.weight);
		System.out.println("cost of the shipment2:" + shipment1.cost);
		
		//double vol1=shipment2.volume();
		//System.out.println("volume of the shipment2: "+ vol1);
		
	}
}
