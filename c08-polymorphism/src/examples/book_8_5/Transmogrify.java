package examples.book_8_5;

class Actor {
	protected void act() {
		System.out.println("Actor.act()");
	}
}

class HappyActor extends Actor {
	@Override
	protected void act() {
		System.out.println("HappyActor.act()");
	}
}

class SadActor extends Actor {
	@Override
	protected void act() {
		System.out.println("SadActor.act()");
	}
}

class Stage {
	private Actor actor = new HappyActor();

	void change() {
		actor = new SadActor();
	}

	void perform() {
		actor.act();
	}
}

public class Transmogrify {
	public static void main(String[] args) {
		Stage stage = new Stage();
		stage.perform();
		stage.change();
		stage.perform();
	}
}
