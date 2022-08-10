/*
 ******************* Exercise 1 ********************
	Create a new class called Gerbil with an int
    gerbilNumber initialized in the constructor.
    Give it a method called hop() that prints out
    which gerbil number this is, and that it’s hopping.
    Create an ArrayList and add Gerbil objects to
    the List. Now use the get() method to move
    through the List and call hop() for each Gerbil.
 *****************************************************
 */
package exercises.ex01;

import java.util.*;

public class GerbilTest {
	public static void main(String[] args) {
		ArrayList<Gerbil> gerbils = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			gerbils.add(new Gerbil(i));
		for (Gerbil gerbil : gerbils)
			gerbil.hop();
	}
}
