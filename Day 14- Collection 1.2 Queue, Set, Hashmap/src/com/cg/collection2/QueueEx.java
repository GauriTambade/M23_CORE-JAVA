package com.cg.collection2;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
	Queue<Integer> q=new PriorityQueue<>();
	q.add(11);
	q.add(12);
	System.out.println(q);
	System.out.println(q.peek());
	System.out.println(q.poll());
	}

}

/*o/p 
 * [11, 12]
11
11
*/
