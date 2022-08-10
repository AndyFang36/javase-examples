package exercises.ex16;

public class CADSystemFinally {
	public static void main(String[] args) {
		CADSystem x = new CADSystem(47);
		try {
			return;
		} finally {
			x.dispose();
		}
	}
}
