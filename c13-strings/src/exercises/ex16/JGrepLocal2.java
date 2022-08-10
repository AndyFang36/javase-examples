package exercises.ex16;

import net.mindview.util.TextFile;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

public class JGrepLocal2 {
	public static void main(String[] args) {
		File file = new File(
			"F:\\MyDocuments\\Programming\\Backend\\Java\\JavaSE\\C13-Strings\\io"
		);
		File[] files = file.listFiles();
		Pattern p = Pattern.compile("[Ssct]\\w+");
		Matcher m = p.matcher("");
		for (File tmpFile : files) {
			print("----- File: " + tmpFile.getName() + " -----");
			int index = 0;
			for (String line : new TextFile(tmpFile.getAbsolutePath())) {
				m.reset(line);
				while (m.find()) {
					printnb(index + ": \"" + m.group() + "\" ");
					print("[" + m.start() + "," + (m.end() - 1) + "]");
					++index;
				}
			}
			print("---------------------------\n");
		}
	}
}
