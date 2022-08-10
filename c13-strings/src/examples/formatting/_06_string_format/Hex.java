package examples.formatting._06_string_format;

import net.mindview.util.BinaryFile;

import java.io.File;
import java.io.IOException;

public class Hex {
	public static String format(byte[] data) {
		StringBuilder result = new StringBuilder();
		int n = 0;
		for (byte b : data) {
			if (n % 16 == 0)
				result.append(String.format("%05x: ", n));
			result.append(String.format("%02x ", b));
			++n;
			if (n % 16 == 0)
				result.append("\n");
		}
		result.append("\n");
		return result.toString();
	}

	public static void main(String[] args) throws IOException {
		if (args.length == 0)
			// test by displaying this class file:
			System.out.println(
				format(BinaryFile.read("temp.txt"))
			);
		else
			System.out.println(
				format(BinaryFile.read(new File(args[0])))
			);
	}
}
