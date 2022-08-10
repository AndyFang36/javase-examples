package exercises.ex29;

import examples.s11_queue.QueueDemo;

import java.util.PriorityQueue;

public class PriorityQueueSubtlety {
	public static void main(String[] args) {
		PriorityQueue<Dummy> priorityQueue = new PriorityQueue<>();
		System.out.println("Adding 1st instance...");
		priorityQueue.offer(new Dummy());
		System.out.println("Adding 2nd instance...");
		priorityQueue.offer(new Dummy());
		QueueDemo.printQ(priorityQueue);
	}
}
