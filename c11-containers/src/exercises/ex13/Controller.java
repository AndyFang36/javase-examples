package exercises.ex13;

import java.util.*;

class Controller {
	private final List<Event> eventList = new LinkedList<>();

	public void addEvent(Event c) {
		eventList.add(c);
	}

	public void run() {
		while (eventList.size() > 0) {
			Iterator<Event> it = new LinkedList<>(eventList).iterator();
			while (it.hasNext()) {
				Event temp = it.next();
				if (temp.ready()) {
					System.out.println(temp);
					temp.action();
					it.remove();
				}
			}
		}
	}
}
