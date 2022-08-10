package exercises.e12;

import examples.book_9_4.CanFight;
import examples.book_9_4.CanFly;
import examples.book_9_4.CanSwim;

class ActionCharacter {
	public void fight() {
		System.out.println("ActionCharacter.fight()");
	}
}

class Hero extends ActionCharacter
		implements CanFight, CanFly, CanSwim, CanClimb {
//	@Override
//	public void fight() {
//		System.out.println("Hero.fight()");
//	}

	@Override
	public void fly() {
		System.out.println("Hero.fly()");
	}

	@Override
	public void swim() {
		System.out.println("Hero.swim()");
	}

	@Override
	public void climb() {
		System.out.println("Hero.climb()");
	}
}

public class Adventure {
	public static void t(CanFight temp) {
		temp.fight();
	}

	public static void u(CanSwim temp) {
		temp.swim();
	}

	public static void v(CanFly temp) {
		temp.fly();
	}

	public static void c(CanClimb temp) {
		temp.climb();
	}

	public static void w(ActionCharacter temp) {
		temp.fight();
	}

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.fight();
		t(hero);
		u(hero);
		v(hero);
		c(hero);
		w(hero);
	}
}
