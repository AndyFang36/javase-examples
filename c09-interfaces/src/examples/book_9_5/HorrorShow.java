package examples.book_9_5;

interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destroy();
}

interface Lethal {
	void kill();
}

interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}

class DragonVilla implements DangerousMonster {
	@Override
	public void menace() {
		System.out.println("DragonVilla.menace()");
	}

	@Override
	public void destroy() {
		System.out.println("DragonVilla.destroy()");
	}
}

class VeryBadVampire implements Vampire {
	@Override
	public void menace() {
	}

	@Override
	public void destroy() {
	}

	@Override
	public void kill() {
	}

	@Override
	public void drinkBlood() {
	}
}

public class HorrorShow {
	static void u(Monster temp) {
		temp.menace();
	}

	static void v(DangerousMonster temp) {
		temp.menace();
		temp.destroy();
	}

	static void w(Lethal temp) {
		temp.kill();
	}

	public static void main(String[] args) {
		DangerousMonster barney = new DragonVilla();
		u(barney);
		v(barney);
		Vampire vlad = new VeryBadVampire();
		u(vlad);
		v(vlad);
		w(vlad);
	}
}