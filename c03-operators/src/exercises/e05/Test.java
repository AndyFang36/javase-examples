/*
 * Exercise 5
 * Create a class called Dog containing two Strings: name and says. In main(), create two dog objects with names "spot"
 * (who says "Ruff!") and "scruffy" (who says "Wurf!").  Then display their names and what they say.
 */

package exercises.e05;

public class Test {
	public static void main(String[] args) {
		Dog spot = new Dog();
		spot.setName("Spot");
		spot.setSays("Ruff!");
		spot.showName();
		spot.speak();

		Dog scruffy = new Dog();
		scruffy.setName("Scruffy");
		scruffy.setSays("Wurf!");
		scruffy.showName();
		scruffy.speak();
	}
}