package exercises.ex26;

import java.io.FileInputStream;

public class MainException {
	// pass all exceptions to the console:
	public static void main(String[] args) throws Exception {
		// Open the file:
		FileInputStream file = new FileInputStream("DoesNotExist.file");
		// Use the file...
		// Close the file:
		file.close();
	}
}
