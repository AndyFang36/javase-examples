package exercises.e14;

import static net.mindview.util.Print.*;

class DragonVilla implements DangerousMonster {
	public void menace() {
	}

	public void destroy() {
	}
}

class VeryBadVampire implements Vampire {
	public void menace() {
	}

	public void destroy() {
	}

	public void kill() {
	}

	public void drinkBlood() {
	}
}

public class HorrorShow {
	static void f1(Monster m) {
		m.menace();
	}

	static void f2(DangerousMonster d) {
		d.menace();
		d.destroy();
	}

	static void f3(Lethal l) {
		l.kill();
	}

	static void f4(Vampire v) {
		v.drinkBlood();
	}

	public DragonVilla makeVilla() {
		return new DragonVilla() {
			@Override
			public void menace() {
				print("DangerousMonster.Menace()");
			}

			@Override
			public void destroy() {
				print("DangerousMonster.Destroy()");
			}
		};
	}

	public VeryBadVampire makeVampire() {
		return new VeryBadVampire() {
			@Override
			public void menace() {
				print("VeryBadVampire.Menace()");
			}

			@Override
			public void destroy() {
				print("VeryBadVampire.Destroy()");
			}

			@Override
			public void kill() {
				print("VeryBadVampire.Kill()");
			}

			@Override
			public void drinkBlood() {
				print("VeryBadVampire.DrinkBlood()");
			}
		};
	}

	public static void main(String[] args) {
		HorrorShow show = new HorrorShow();
		// make monster:
		f1(show.makeVilla());
		f2(show.makeVilla());
		// make vampire:
		f1(show.makeVampire());
		f2(show.makeVampire());
		f3(show.makeVampire());
		f4(show.makeVampire());
	}
}
