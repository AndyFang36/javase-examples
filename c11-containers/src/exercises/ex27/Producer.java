package exercises.ex27;

import java.util.Queue;

class Producer {
	public static void produce(Queue<Command> q) {
		q.offer(new Command("load"));
		q.offer(new Command("delete"));
		q.offer(new Command("save"));
		q.offer(new Command("exit"));
	}
}
