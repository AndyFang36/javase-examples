package examples.s12_alternative_approaches._03_console;

import java.io.FileInputStream;

public class MainException {
	// pass all exceptions to the console:
	public static void main(String[] args) throws Exception {
		// Open the file:
		FileInputStream file = new FileInputStream("temp.txt");
		// Use the file...
		// Close the file:
		file.close();
	}
}
