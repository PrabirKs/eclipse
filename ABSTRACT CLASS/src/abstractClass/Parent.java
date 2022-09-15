package abstractClass;

public abstract class Parent {
    int weight;
    static int value;                         //static value also can be here
    final int f;                             // final var also 
	abstract void carrer(String name);                  //the abstract class only dclared the abstrct method i.e the method has no body just defintition.
	abstract void partner(int age);                     // and the classes which are derived from this class can define this funtion according to their way.

    public Parent(int weight) {
    	Parent.value = 0;
		this.weight=weight;                   // can be initialize by constr.
		f=34335;
   
     }
    
    //cant create abstract constructors
    // cant create abstract static methods
    //
    
    // but we can use static method in the parent class
    
    static void hello() {
    	System.out.println("hiii i am a static method");
    }
   void normal() {
	   System.out.println("this is a normall functoin");   // it can have normal functoin also and can be overloaded
   }
}
