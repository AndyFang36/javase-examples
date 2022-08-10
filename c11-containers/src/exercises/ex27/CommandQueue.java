package exercises.ex27;

import java.util.LinkedList;
import java.util.Queue;

public class CommandQueue {
	public static void main(String[] args) {
		Queue<Command> cmd = new LinkedList<>();
		Producer.produce(cmd);
		Consumer.consume(cmd);
	}
}
