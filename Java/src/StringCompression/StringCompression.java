package StringCompression;

public class StringCompression {
	public static int compress(char[] chars) {
		int writeIndex = 0;
		char symbol = chars[0];
		int count = 1;
		for (int i = 0; i < chars.length - 1; i++) {
			if (chars[i] == symbol) {
				count++;
			} else {
				chars[writeIndex++] = symbol;
				writeIndex = addCount(count, writeIndex, chars);
				symbol = chars[i];
				count = 1;
			}
		}
		chars[writeIndex++] = symbol;
		writeIndex = addCount(count, writeIndex, chars);
		return writeIndex;
	}
	
	public static int compress2(char[] chars) {
		int writeIndex = 0;
		char symbol = chars[0];
		int count = 1;
		for (int i = 1; i < chars.length; i++) {
			if (chars[i] == symbol) {
				count++;
			} else {
				chars[writeIndex++] = symbol;
				writeIndex = addCount(count, writeIndex, chars);
				symbol = chars[i];
				count = 1;
			}
		}
		chars[writeIndex++] = symbol;
		writeIndex = addCount(count, writeIndex, chars);
		return writeIndex;
	}
	
	private static int addCount(int count, int writeIndex, char[] chars) {
		if (count > 1) {
			char[] countChars = ("" + count).toCharArray();
			for (char c : countChars)
				chars[writeIndex++] = c;
		}
		return writeIndex;
	}
}
