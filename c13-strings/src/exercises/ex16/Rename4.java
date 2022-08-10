package exercises.ex16;

import net.mindview.util.TextFile;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.*;

public class Rename4 {
	private static final String[] PATH = {
		"E:\\Bilibili\\Data Structure\\",
		"E:\\Bilibili\\Computer Organization and Architecture\\",
		"E:\\Bilibili\\17404276\\",
		"E:\\Bilibili\\26584665\\",
		"E:\\Bilibili\\jsjwl\\"
	};
	private static final String[] REGEX = {
		"((?<=PartName\\\":\\\").*?(?=\\\"))",
	};
	public static void main(String[] args) {
		for (int i = 1; i <= 63; i++) {
			File file = new File(PATH[4] + i);
			File[] files = file.listFiles();
			Pattern p = Pattern.compile(REGEX[0]);
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
