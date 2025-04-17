package queue_collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
public static void main(String[] args) {
	PriorityQueue pq = new PriorityQueue();
	
	pq.add(10);
	pq.add(5);
	pq.add(18);
	pq.add(1);
	pq.add(111);
	System.out.println(pq);
}
}
