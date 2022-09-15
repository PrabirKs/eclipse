package hashTable;

  class HashNode{
	  Integer key;   
	  String value;
	  HashNode next;
	
	  HashNode(Integer key,String value){
		  this.key=key;
		  this.value=value;
	  }
}


 public class HashTable {
          HashNode[] bucket;              // to store the value
          int numOfBucket;                //capacity of bucket
          int size;                       //number of key value pair in table
          
          public HashTable() {
        	  this(10);                  // by default the capacty is set to 10
          }
          
          public HashTable(int capacity) {
        	       this.numOfBucket=capacity;
        	       bucket=new HashNode[numOfBucket];
        	       this.size= 0 ;
          }
          
          public int size() {
        	  return size;
          }
          
          public boolean isEmpty() {
        	  return size==0;
          }
          public int getBucketIndex(int key) {
        	  return key % numOfBucket;
          }
  //----------------------------------------------------------------------------------------------------------------------------------------------------------------------//        
          public void put(Integer key,String value) {
        	  if(key==null || value== null) {
        		  throw new IllegalArgumentException("key or key value is null");
        	  }
        	    int bucketIndex=getBucketIndex(key);     // get the hashed index by passing the value to the hash function
        	    
        	    HashNode head = bucket[bucketIndex];     //head point to that same  bucket index
        	    
        	    while(head!=null) {                      //by default each bucket will points to the null , but in case of bucket_index present it will 
        	    	if(head.key.equals(key)) {           // check whether the key is same to the current key
        	    		head.value=value;                //if same then it will update the value at that same key node and dont add that node
        	    		return;                          //and return
        	    	}
        	    	head=head.next;                      //else it will search the next node , until head!=null
        	    }
        	    
        	    size++;                                  //if upper case is not satisfied then definately a new unique node will be add in the table , so size++;
        	    head=bucket[bucketIndex];                //head now points to the same to where the bucket[index] is point before that is null
        	    HashNode node = new HashNode(key,value); //new node will be created
        	    node.next=head;                          // that will point to head initially to null
        	    bucket[bucketIndex]=node;                //now that bucket  new Hashnode will be 
          }
 //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//        
          public String get(Integer key) {
        	  if(key==null) {
        		  throw new IllegalArgumentException("key is null");
        	  }
        	  int bucketIndex=getBucketIndex(key);                     //get index from hashing fuction
        	  HashNode head= bucket[bucketIndex];                      //head point to the node to which that bucket is pointing
        	  while(head!=null) {                                      //travel untill the head reaches to the last null
        		  if(head.key.equals(key)) {                         //  definately after getting the bucket index , the key will be there, but in case of more than one element is present with same hashed bucket index , it will search for the key
        			  return head.value;                             // return that value
        		  }                 
        		  head=head.next;                                    //move until the key is not found until the head==null
        	  }  
        	  return null;                                          //  if head became null and still not found the key return null
          }
 //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//         
          public String remove(Integer key) {
        	  if(key==null) {
        		  throw new IllegalArgumentException("key is null");
        	  }
        	  int bucketIndex=getBucketIndex(key);
        	  HashNode head=bucket[bucketIndex];                    //head will point to the buckt index by matching
        	  HashNode previous=null;                            //create a variable previous and initially points to null
        	  while(head!=null) {                                 //search untill the last chain node
        		  if(head.key.equals(key)) {                     // where the key matches just break; that loop
        			  break;
        		  }   
        		  previous=head;                                //every time keep track of the previous element of that matched node
        		  head=head.next;                               // move to the next node 
        	  }
        	  if(head==null) {                                  //if no node will be there then, head==null from intially and return null
        		  return null;                                  // i think it should place at the top
        	  }
        	  size--;                                           // if head ==null then definately there will be a node and it will be remove from the hashtable. so size-1 ;
        	  if(previous !=null) {                             //means that the node is not found at the first position so prev!=null
        		  previous.next=head.next;                     //then just point the next of the previous node to the head.next node
        	  }
        	  else {                                             //if node is found at the first node then , prev will be point to null and no use of it, so just point the bucket to the head.next node
        		  bucket[bucketIndex]=head.next;                     
        	  }
        	  return head.value;
          }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//         
          public static void main(String[] args) {
        	HashTable table=new HashTable(10);
      		table.put(105,"tom");
      		table.put(21,"sana");
      		table.put(21,"rana");
      		table.put(31,"harry");
      		table.put(6,"umesh");
      		System.out.println(table.size());
      		
      	//	System.out.println(table.get(21));
        //  System.out.println(table.get(31));
        //  System.out.println(table.get(11));
      		
      		System.out.println(table.remove(21));      //removed
      		System.out.println(table.get(21));         //null now
      		
		}
}

