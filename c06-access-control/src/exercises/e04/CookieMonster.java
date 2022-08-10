package exercises.e04;

public class CookieMonster {
	public static void main(String[] args) {
		Cookie x = new Cookie();
		x.bite(); // protected
		x.bite2(); //friendly
		x.bite3(); //public
	}
}
