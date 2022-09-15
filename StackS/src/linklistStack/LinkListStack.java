package linklistStack;

import java.util.*;

public class LinkListStack {
          private Node top;
          private int size;
          
          private class Node{
        	  private int data;
        	  private Node next;
        	  
        	  public Node(int data) {
        		  this.data=data;
        		  this.next=null;
        	  }
          }
          
         public void push(int data) {
        	 Node newnode= new Node(data);
        	 newnode.next=top;
        	 top=newnode;
        	 size++;
         }
         
         public int pop() {
        	 if(isEmpty()) {
        		 throw new EmptyStackException();
        	 }
        	 int res=top.data;
        	 top=top.next;
        	 size--;
        	 return res;
         }
         
         public boolean isEmpty() {
        	 return size==0;
         }
         public int peek() {
        	 return top.data;
         }
         public int size() {
        	 return size;
         }
         public void display() {
        	 Node temp=top;
        	 while(temp!=null) {
        		 System.out.print(temp.data+" ");
        		 temp=temp.next;
        	 }
        	 System.out.println();
         }
}
