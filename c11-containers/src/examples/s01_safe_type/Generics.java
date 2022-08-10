package examples.s01_safe_type;

import java.util.ArrayList;

public class Generics {
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<>();
		for (int i = 0; i < 3; i++)
			apples.add(new Apple());
		/* Compile-time error: */
		//! apples.add(new Orange());
		for (int i = 0; i < apples.size(); i++)
			System.out.println(apples.get(i).id());
		for(Apple c : apples)
			System.out.println(c.id());
	}
}