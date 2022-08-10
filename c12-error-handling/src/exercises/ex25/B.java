package exercises.ex25;

public class B extends A {
	@Override
	public void f() throws Level2Exception {
		throw new Level2Exception();
	}
}
