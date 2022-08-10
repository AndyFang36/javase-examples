package exercises.ex25;

public class C extends B {
	@Override
	public void f() throws Level3Exception {
		throw new Level3Exception();
	}
}
