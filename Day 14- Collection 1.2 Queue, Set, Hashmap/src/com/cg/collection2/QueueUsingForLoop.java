package com.cg.collection2;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueUsingForLoop {

	public static void main(String[] args) {
		int i;
		Queue<Integer>queue=new PriorityQueue<>();
		for(i=5;i>0;i--)
		{
			queue.add(i);
		}
		System.out.println(queue);
	}
	

}
