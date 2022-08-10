package exercises.ex16;

import net.mindview.util.TextFile;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.*;

public class Rename3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 68; i++) {
			File file = new File(
				"E:\\Bilibili\\70156862\\" + i
			);
			File[] files = file.listFiles();
			Pattern p = Pattern.compile("(\\d\\.\\d.*\\d\\_.*?(?=\\\"))");
			Matcher m = p.matcher("");
			for (File tmpFile : files) {
				for (String line : new TextFile(tmpFile.getAbsolutePath())) {
					m.reset(line);
					while (m.find()) {
						print(m.group());
					}
				}
			}
		}
	}
}
