package examples.toString;

import examples.coffee.*;

import java.util.ArrayList;

public class ArrayListDisplay {
	public static void main(String[] args) {
		ArrayList<Coffee> coffees = new ArrayList<>();
		for (Coffee coffee : new CoffeeGenerator(10)) {
			coffees.add(coffee);
		}
		System.out.println(coffees);
	}
}