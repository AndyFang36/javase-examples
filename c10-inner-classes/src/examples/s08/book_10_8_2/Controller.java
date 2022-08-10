package examples.s08.book_10_8_2;

import java.util.*;

public class Controller {
	private final List<Event> eventList = new ArrayList<>();

	public void addEvent(Event c) {
		eventList.add(c);
	}

	public void run() {
		while (eventList.size() > 0) {
			// Make a copy so you’re not modifying the list
			// while you’re selecting the elements in it:
			for (Event temp : new ArrayList<>(eventList)) {
				if (temp.ready()) {
					System.out.println(temp);
					temp.action();
					eventList.remove(temp);
				}
			}
		}
	}
}
