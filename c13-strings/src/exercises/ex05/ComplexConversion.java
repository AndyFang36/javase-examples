package exercises.ex05;

import java.math.BigInteger;
import java.util.Formatter;
import java.util.Locale;

import static net.mindview.util.Print.*;

public class ComplexConversion {
	private static final Formatter f = new Formatter(System.out, Locale.US);

	public static void main(String[] args) {
		print("u = 'a':");
		char u = 'a';
		f.format("s: %1$-#10s\n", u);
		f.format("c: %1$-10c\n", u);
		f.format("b: %1$-10.10b\n", u);
		f.format("h: %1$-10.10h\n", u);

		print("\nv = 1000:");
		int v = 1000;
		f.format("d 1: %1$(,0+10d\n", v);
		f.format("d 2: %1$-(, 10d\n", v);
		f.format("d 3, v = -v: %1$-(, 10d\n", -v);
		f.format("c, v = 121: %1$-10c\n", 121);
		f.format("b: %1$-10.10b\n", v);
		f.format("s: %1$#-10.10s\n", v);
		f.format("x: %1$-#10x\n", v);
		f.format("h: %1$-10.10h\n", v);

		print("\nw = new BigInteger(\"50000000000000\"):");
		BigInteger w = new BigInteger("50000000000000");
		f.format("d 1: %1$(,0+10d\n", w);
		f.format("d 2: %1$-(, 10d\n", w);
		f.format("d 3, w = -w: %1$-(, 10d\n", w.negate());
		f.format("b: %1$-10.10b\n", w);
		f.format("s: %1$#-10.10s\n", w);
		f.format("x 1: %1$(0+10x\n", w);
		f.format("x 2: %1$-( 10x\n", w);
		f.format("x 3, w = -w: %1$-( 10x\n", w.negate());
		f.format("h: %1$-10.10h\n", w);

		print("\nx = 179.543:");
		double x = 179.543;
		f.format("b: %1$-10.10b\n", x);
		f.format("s: %1$#-10.10s\n", x);
		f.format("f 1: %1$#(,0+10.2f\n", x);
		f.format("f 2: %1$#(,- 10.2f\n", x);
		f.format("f 3, x = -x: %1$#(,0+10.2f\n", -x);
		f.format("e 1: %1$#(0+10.2e\n", x);
		f.format("e 2: %1$#(- 10.2e\n", x);
		f.format("e 3, x = -x: %1$#(0+10.2e\n", -x);
		f.format("h: %1$-10.10h\n", x);

		print("\ny = new Object():");
		Object y = new Object();
		f.format("b: %1$-10.10b\n", y);
		f.format("s: %1$#-10.10s\n", y);
		f.format("h: %1$-10.10h\n", y);

		print("\nz = false:");
		boolean z = false;
		f.format("b: %1$-10.10b\n", z);
		f.format("s: %1$#-10.10s\n", z);
		f.format("h: %1$-10.10h\n", z);
		// A special no argument conversion type
		f.format("%%: %-10%");
	}
}
