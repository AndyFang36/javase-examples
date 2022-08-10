package examples.s15;

import static net.mindview.util.Print.*;

public class RoundingNumbers {
	public static void main(String[] args) {
		double dAbove = 0.7D, dBelow = 0.4D;
		print("dAbove = 0.7D ------> Math.round(dAbove) = " + Math.round(dAbove));
		print("dBelow = 0.4D ------> Math.round(dBelow) = " + Math.round(dBelow));
		float fAbove = 0.7f, fBelow = 0.4f;
		print("fAbove = 0.7F ------> Math.round(fAbove) = " + Math.round(fAbove));
		print("fBelow = 0.4F ------> Math.round(fBelow) = " + Math.round(fBelow));
	}
}