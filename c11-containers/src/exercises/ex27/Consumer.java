package exercises.ex27;

import java.util.Queue;

class Consumer {
	public static void consume(Queue<Command> q) {
		while (q.peek() != null)
			q.remove().operation();
	}
}
