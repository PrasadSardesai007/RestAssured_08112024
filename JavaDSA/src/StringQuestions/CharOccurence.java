package StringQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharOccurence {

	/**
	 * 
	 * 
	 * Find First Repeated And Non-Repeated Character In A String
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		String str1 = "JavaConceptOfTheDay";
		mostRepeatativeChar(str1);

	}

	public static void mostRepeatativeChar(String str) {

		char[] chars = str.toLowerCase().toCharArray();

		Map<Character, Integer> charCount = new LinkedHashMap<Character, Integer>();

		for (char ch : chars) {

			if (charCount.containsKey(ch)) {

				charCount.put(ch, charCount.get(ch) + 1);

			} else {

				charCount.put(ch, 1);
			}
		}

		// First Repetative character
		for (char ch : charCount.keySet()) {

			if (charCount.get(ch) > 1) {
				System.out.println("First Repetative Character:  " + ch);
				break;

			}

		}

		// First SIngle character
		for (char ch : charCount.keySet()) {

			if (charCount.get(ch) == 1) {

				System.out.println("First Non-Repetative Character:  " + ch);
				break;

			}

		}

	}

}
