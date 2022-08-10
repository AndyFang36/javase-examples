package examples.s11_queue._01_priority_queue;

import examples.s11_queue.QueueDemo;

import java.util.*;

public class PriorityQueueDemo {
	private static final Random rand = new Random(47);

	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		for (int i = 0; i < 10; i++)
			priorityQueue.offer(rand.nextInt(i + 10));
		QueueDemo.printQ(priorityQueue);
		List<Integer> ints = Arrays.asList(
			25, 22, 20, 18, 14, 9, 3, 1, 1, 2,
			3, 9, 14, 18, 21, 23, 25
		);
		priorityQueue = new PriorityQueue<>(ints);
		QueueDemo.printQ(priorityQueue);
		priorityQueue = new PriorityQueue<>(
			ints.size(), Collections.reverseOrder()
		);
		priorityQueue.addAll(ints);
		QueueDemo.printQ(priorityQueue);
		//
		String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
		List<String> str = Arrays.asList(fact.split(""));
		PriorityQueue<String> strPQ = new PriorityQueue<>(str);
		QueueDemo.printQ(strPQ);
		strPQ = new PriorityQueue<>(
			str.size(), Collections.reverseOrder()
		);
		strPQ.addAll(str);
		QueueDemo.printQ(strPQ);
		//
		String hello = "I'm learning Java, it's fun!";
		List<String> str2 = Arrays.asList(hello.split(" "));
		PriorityQueue<String> str2PQ = new PriorityQueue<>(str2);
		QueueDemo.printQ(str2PQ);
		//
		Set<Character> charSet = new HashSet<>();
		for (char c : fact.toCharArray())
			charSet.add(c);
		PriorityQueue<Character> charPQ
			= new PriorityQueue<>(charSet);
		QueueDemo.printQ(charPQ);
	}
}
