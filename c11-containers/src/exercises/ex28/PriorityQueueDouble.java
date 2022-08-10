package exercises.ex28;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class PriorityQueueDouble {
	private static final Random rand = new Random(47);

	private static void printQ(Queue<?> queue) {
		for (Object data = queue.poll(); data != null; data = queue.poll())
			System.out.println(data);
	}

	public static void main(String[] args) {
		PriorityQueue<Double> doubles = new PriorityQueue<>();
		for (int i = 0; i < 100; i++) {
			doubles.offer(rand.nextDouble());
		}
		printQ(doubles);
	}
}
