package examples.book_8_3.book_8_3_2;

class Shared {
	private int refCount = 0;
	private static long counter = 0;
	private final long id = counter++;

	Shared() {
		System.out.println("Creating " + this);
	}

	public void addRef() {
		refCount++;
	}

	protected void dispose() {
		if (--refCount == 0)
			System.out.println("Disposing " + this);
	}

	public String toString() {
		return "Shared " + id;
	}
}

class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;

	Composing(Shared shared) {
		System.out.println("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}

	protected void dispose() {
		System.out.println("disposing " + this);
		shared.dispose();
	}

	public String toString() {
		return "Composing " + id;
	}
}

public class ReferenceCounting {
	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composing = {
				new Composing(shared),
				new Composing(shared),
				new Composing(shared),
				new Composing(shared),
				new Composing(shared)
		};
		for (Composing c : composing)
			c.dispose();
	}
}
