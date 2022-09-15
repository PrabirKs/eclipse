package polymorfisim;

public class ObjectPrint {      // and indirectly each class is extends from the Object class
	int num;
	 ObjectPrint(int num)
	 {
		this.num=num;
	 }
	 @Override
	 public String toString() {
	        return "object created " + "num= " + num;
	    }
	 
	 // now the object will call to this function rather than the function in the object class
	public static void main(String[] args) {

      ObjectPrint obj=new ObjectPrint(5);
      
      System.out.print(obj);    //polymorfisim.ObjectPrint@36baf30c  print this , it is calling a to string method in the Object class

    /*  public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }  */
      
    // it is that method in the object class we can also over ride it  
      
      
	}

}
