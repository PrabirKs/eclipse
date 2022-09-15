package linklist3;
import linklist3.LinkList;
import java.util.*;
public class MergeSortOnLIst {
        public static void main(String[] args) {
			LinkList ls = new LinkList();
		 
			ls.add(23);
			ls.add(7);
			ls.add(10);
			ls.add(21);
			ls.add(12);
			ls.add(77);
			ls.add(56);
			ls.add(32);
			ls.add(43);
			
			ls.display(ls.head);
			ls.head=mrgSortLinkList(ls.head);
			ls.display(ls.head);
		}
        
        public static Node mrgSortLinkList(Node head) {
        	if(head.next==null)
        		return head;
        	
        	Node mid= findMid(head);
        	Node head2 = mid.next;
        	mid.next=null;
        
        	Node newHead1 = mrgSortLinkList(head);
        	Node newHead2 = mrgSortLinkList(head2);
        	
        	Node finalHead = merge(newHead1,newHead2);
        	return finalHead;
        }
        
        static Node merge(Node head1, Node head2)
        {
            Node merged = new Node(-1);
            Node temp = merged;
           
            // While head1 is not null and head2
            // is not null
            while (head1 != null && head2 != null) {
                if (head1.data < head2.data) {
                    temp.next = head1;
                    head1 = head1.next;
                }
                else {
                    temp.next = head2;
                    head2 = head2.next;
                }
                temp = temp.next;
            }
           
            // While head1 is not null
            while (head1 != null) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
           
            // While head2 is not null
            while (head2 != null) {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
            return merged.next;
        }
        static Node findMid(Node head)
        {
            Node slow = head, fast = head.next;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
        
}
