package hashTable;

import java.util.LinkedList;



public class HASHMAP<K,V> {
      
	private class HNode{
		K key;
	    V value;
	    
	    public HNode(K key, V value) {
	    	this.key=key;
	    	this.value=value;
	    }
	    
	    public String toString() {
	    	return this.key + "--" + this.value;
	    }
	}
	
	//making array of linked list
	private LinkedList<HNode>[] bucketArray;
	
	private int size;
	
	public HASHMAP() {
		this(5);
	}
	
	public HASHMAP(int capacity) {
		
		this.bucketArray= new LinkedList[capacity];
		
		this.size=0;
		
		for(int i=0;i<bucketArray.length;i++) {
			bucketArray[i]=new LinkedList<HNode>();
		}
	}
	
	public void put(K key , V value) {	
		//calculate the load factor again if it is >1 then do rehashing here.
		
		double loadFactor = (double) (this.size / this.bucketArray.length);
		if(loadFactor > 1) {
			rehash(); 
		}
		
		
		
		
		
		
		//this key will be the unique index in the array

		int bktIndx = hashFunction(key);                                         
		
		//get the linked list at that index
		LinkedList <HNode> bucket= bucketArray[bktIndx] ;
		
		//check if any value is present or not
		
		int fi= findBucket(bucket,key);    // give the index of that key , if not present then return -1;
		
		if(fi==-1) {
			HNode nn=new HNode(key,value);   // if not present then create a new node with the value and key
			
			this.size++;  //incrase the size of entry
			
			bucket.addLast(nn);
		} else {
			HNode ntbu= bucket.get(fi);    // get the node from the required LinkedList in the array 
			
			ntbu.value = value;            // replace the value
			
		}
		
	
		
	}
	
	 private void rehash() {
		 
		 //store the previous array of linked list first
			LinkedList<HNode>[] oba = this.bucketArray;
			//create a new  arry of double size
			
			//create a new array of linked list of double size
			this.bucketArray= new LinkedList [2 * oba.length];
			
			//size of the array is currently 0
			this.size=0;
			for(int i=0;i<oba.length;i++) {
				bucketArray[i]=new LinkedList<HNode>();
		    }
			
			//put all the previous values in the new array of linked list
			for(int i=0;i<oba.length;i++) {
				LinkedList<HNode> bucket = oba[i];
			//for every linked list we are iterating over each node
			   for(int j=0;j<bucket.size();j++) {
				HNode node= bucket.get(i);
				put(node.key,node.value);
			}
		}	
	}
	 
	 
	private int findBucket(LinkedList<HNode > bucket, K key) {
	   //iterate over the given linked list to check if the given key is already present or not
		
		for(int i=0; i< bucket.size(); i++) {
			HNode pn = bucket.get(i);
			if(pn.key.equals(key)) {
				return i;
			}
		}
		
		return -1;
	}

	private int hashFunction(K key) {
		// now there is a inbuilt fun hashcode() in java where we can simply give a value and it returns a unque value for given key
	    int hc= key.hashCode();
	    int bi= Math.abs(hc) % bucketArray.length;
	    
	    return bi;
	    }
	
	public void display() {
		System.out.println("---------------------------");
		System.out.println("length :" + bucketArray.length);
		
		for(int i =0;i<bucketArray.length; i++) {
			LinkedList<HNode> bucket = bucketArray[i];   //get all the linked list from the linked list array
			System.out.print("B" + i + " => ");
			for(int j=0;j<bucket.size(); j++) {
				HNode node=bucket.get(j);
				
				System.out.print(node+ " ");
			}
			System.out.println(".");
		}
		System.out.println("---------------------------");
	}
	
	public V get(K key) {
		int bi= hashFunction(key);
		LinkedList<HNode> bucket = bucketArray[bi];
		// if the key is prsent or not in the linked list
		int fi = findBucket(bucket,key);
		if(fi==-1){
			return null;
		} else {
			return bucket.get(fi).value;
		}
	}



	public static void main(String[] args) {
		HASHMAP<String,Integer> map=new HASHMAP<>();
		
		map.put("pak",120);
		map.put("zim",120);
		map.put("newz",120);
		map.put("uae",120);
		map.put("ind", 130);
	
		map.put("aus",100);
		map.put("aus",140);
		map.display();
		
		System.out.println(map.get("aus"));
   }
	
}