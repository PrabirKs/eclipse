package accessSpecifier;

public class Tiger {
    int defaultnum;
    
    private String privatename;
    
    protected int protectnum;
    
    int[] arr;
    
    public int getDefaultNum()
    {
    	return defaultnum;
    }
  
    public void setDefaultNum(int num) {
    	this.defaultnum=num;
    }
    
    public Tiger(int num,String name,int protectnum){
    	this.defaultnum=num;
    	this.privatename=name;
    	this.protectnum=protectnum;
    	this.arr=new int[num];
    	
    }
	public String getPrivatename() {
		return privatename;
	}
	public void setPrivatename(String privatename) {
		this.privatename = privatename;
	}

	
}
