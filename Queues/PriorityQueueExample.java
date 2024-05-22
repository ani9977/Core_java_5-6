package in.co.Queues;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {

//		PriorityQueue p = new PriorityQueue();
//		p.add(1);
//		p.add(2.3);
//		p.add(6);
//		p.add('A');
//		System.out.println(p);

		// in PriorityQueue if You add a data type first then You don't add other data
		// type in this if you add it gives ClassCastException at Runtime

		// Example We add String first in this program so we cannot add other data type
		// If we add int first so we cannot add String or other data type
		PriorityQueue q = new PriorityQueue();

		q.offer("One");
		q.offer("Three");
		q.offer("Two");
		System.out.println(q);

		System.out.println(q.peek());
		System.out.println(q);

		System.out.println(q.poll());

		System.out.println(q);

		Object ele = q.element();

		System.out.println(ele);

		ele = q.remove();

		System.out.println(q);

		System.out.println(ele);

	}

}
