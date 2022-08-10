package exercises.e13;

import static net.mindview.util.Print.*;

class Shared {
	private int refCount = 0;
	private static long counter = 0;
	private final long id = counter++;

	Shared() {
		print("Creating " + this);
	}

	public void addRef() {
		refCount++;
	}

	@Override
	protected void finalize() {
		if (refCount > 0)
			print("Error: " + refCount + " Shared " + id + " objects in use");
	}

	protected void dispose() {
		if (--refCount == 0)
			print("Disposing " + this);
	}

	@Override
	public String toString() {
		return "Shared " + id;
	}
}

class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;

	Composing(Shared shared) {
		print("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}

	protected void dispose() {
		print("Disposing " + this);
		shared.dispose();
	}

	@Override
	public String toString() {
		return "Composing " + id;
	}
}

public class ReferenceCountingTest {
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
		// Test finalize():
		Composing compTest1 = new Composing(shared);
		Composing compTest2 = new Composing(shared);
		shared.finalize();
		// Test sharedTest finalize():
		Shared sharedTest1 = new Shared();
		Shared sharedTest2 = new Shared();
		Shared sharedTest3 = new Shared();
		Composing compTest3 = new Composing(sharedTest1);
		Composing compTest4 = new Composing(sharedTest2);
		Composing compTest5 = new Composing(sharedTest3);
		sharedTest1.finalize();
		sharedTest2.finalize();
		sharedTest3.finalize();
	}
}
