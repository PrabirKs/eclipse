package iteration;

public class ConstrOveloading {
	double width;
	double height;
	double depth;
	ConstrOveloading(double w,double h,double d){
		
		width=w;
		height=h;
		depth=d;
	}
	ConstrOveloading(){
		width=-1;
		height=-1;
		depth=-1;
	}
	ConstrOveloading(double len){
		width=height=depth=len;
	}
	double volume() {
		return width*height*depth;
	}
	
	boolean EqualsTo(ConstrOveloading O) {                                      //object as a parameter
		if(O.width==width && O.depth==depth && O.height==height) return true;
		else
		return false;
	}
	
	ConstrOveloading(ConstrOveloading ob){         //pass object to constructor
		width=ob.width;
		height=ob.height;
		depth=ob.depth;
		
	}
	
	
	
	
	
}
class overloadcons{
	public static void main(String args[]) {
		ConstrOveloading box1=new ConstrOveloading(110,20,25);
		ConstrOveloading box2=new ConstrOveloading();
		ConstrOveloading box3=new ConstrOveloading(7);
		ConstrOveloading box4=new ConstrOveloading(7);
		ConstrOveloading box5=new ConstrOveloading(110,20,25);
		ConstrOveloading box6=new ConstrOveloading(box4);
		double vol;
		vol=box1.volume();
		System.out.println("volume of the box:" + vol);
		vol=box2.volume();
		System.out.println("volume of the box:" + vol);
		vol=box3.volume();
		System.out.println("volume of the box:" + vol);
		
		
		System.out.println("box5=box1 : " + box5.EqualsTo(box1));
		System.out.println("box4=box3 : " + box3.EqualsTo(box4));
		System.out.println("box3=box1 : " + box3.EqualsTo(box1));
		
		vol=box6.volume();
		System.out.println("volume of the box:" + vol);
		
	}
}
