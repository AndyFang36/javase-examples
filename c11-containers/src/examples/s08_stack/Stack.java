package examples.s08_stack;

import java.util.LinkedList;

public class Stack<T> {
	private final LinkedList<T> storage = new LinkedList<>();

	public void push(T v) {
		storage.addFirst(v);
	}

	public T peek() {
		return storage.getFirst();
	}

	public T pop() {
		return storage.removeFirst();
	}

	public boolean empty() {
		return storage.isEmpty();
	}

	@Override
	public String toString() {
		return storage.toString();
	}
}