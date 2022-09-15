package queueAnuj;
import java.util.*;

public class Implementation {
    public static void main(String[] args) {
		Queue<Integer> q = new ArrayDeque<>();
		
		q.add(12);
		q.add(13);
		q.add(14);
		
	    System.out.println(q.poll());
		System.out.println(q.peek());
	}
}
