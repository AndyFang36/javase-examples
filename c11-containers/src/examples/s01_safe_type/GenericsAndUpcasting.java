package examples.s01_safe_type;

import java.util.ArrayList;

class GrannySmith extends Apple {
}

class Gala extends Apple {
}

class Fuji extends Apple {
}

class Braeburn extends Apple {

}

public class GenericsAndUpcasting {
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<>();
		apples.add(new GrannySmith());
		apples.add(new Gala());
		apples.add(new Fuji());
		apples.add(new Braeburn());
		for (Apple temp : apples) {
			System.out.println(temp);
		}
	}
}
