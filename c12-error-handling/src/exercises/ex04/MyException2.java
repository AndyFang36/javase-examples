package exercises.ex04;

// Or take a more clever approach,
// noting that string storage and printing are
// built into Exception:
public class MyException2 extends Exception{
	public MyException2(String s){
		super(s);
	}
}
