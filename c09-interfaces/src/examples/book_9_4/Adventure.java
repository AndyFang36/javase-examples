package examples.book_9_4;

class ActionCharacter {
	public void fight() {
		System.out.println("ActionCharacter.fight()");
	}
}

class Hero extends ActionCharacter
		implements CanFight, CanFly, CanSwim {
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

	public static void w(ActionCharacter temp) {
		temp.fight();
	}

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.fight();
		t(hero);
		u(hero);
		v(hero);
		w(hero);
	}
}
