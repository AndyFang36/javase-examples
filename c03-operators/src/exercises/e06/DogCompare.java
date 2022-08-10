/*
 * Exercise 6
 * Create a class called Dog containing two Strings: name and says. Following exercise 5, create a new Dog reference
 * and assign it to spot's object. Test for comparison using == and equals() for all references.
 */
package exercises.e06;

import exercises.e05.Dog;

import static net.mindview.util.Print.*;

public class DogCompare {
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

        Dog butch = new Dog();
        butch.setName("Butch");
        butch.setSays("Hello!");
        butch.showName();
        butch.speak();

        print("Comparison: ");
        print("spot == butch: " + (spot == butch));
        print("spot.equals(butch): " + spot.equals(butch));
        print("butch.equals(spot): " + butch.equals(spot));
        print("Now assign: spot = butch");

        spot = butch;
        print("Compare again: ");
        print("spot == butch: " + (spot == butch));
        print("spot.equals(butch): " + spot.equals(butch));
        print("butch.equals(spot): " + butch.equals(spot));
        print("Spot: ");
        spot.showName();
        spot.speak();
        print("Butch: ");
        butch.showName();
        butch.speak();
    }
}