// 字符串中每两个字符互换
package exercises.e11;

public class StringMixer {
	public String startMix(String s) {
		char[] ca = new char[s.length()];
		if ((s.length()) % 2 == 0) {
			// 字符串个数为偶数
			for (int i = 0; i < s.length(); i += 2) {
				ca[i] = s.charAt(i + 1);
				ca[i + 1] = s.charAt(i);
			}
		} else {
			// 字符串个数为奇数
			for (int i = 0; i < s.length() - 1; i += 2) {
				ca[i] = s.charAt(i + 1);
				ca[i + 1] = s.charAt(i);
			}
			ca[s.length() - 1] = s.charAt(s.length() - 1);
		}
		return new String(ca);
	}
}
