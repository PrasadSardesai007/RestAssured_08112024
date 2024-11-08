package StringQuestions;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedChar {
	/**
	 * 
	 * 
	 * 
	 * Most repeated character in given String
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		String str = "Bread Butter and Bread Maska";

		System.out.println("Most repeated character in given string: " + mostRepeatativeChar(str));

	}

	public static char mostRepeatativeChar(String str) {

		int count = 0;
		char mostRepChar = 0;
		char[] chars = str.toLowerCase().toCharArray();

		Map<Character, Integer> charCount = new HashMap<Character, Integer>();

		for (char ch : chars) {

			if (charCount.containsKey(ch)) {

				charCount.put(ch, charCount.get(ch) + 1);

			} else {

				charCount.put(ch, 1);
			}
		}

		for (char ch : charCount.keySet()) {

			if (charCount.get(ch) > count) {
				count = count + 1;
				mostRepChar = ch;

			}

		}
		return mostRepChar;

	}

}
