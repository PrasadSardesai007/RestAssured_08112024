package StringQuestions;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersInString {

	public static void main(String[] args) {

		String str = "prasad sardesai";
		findDuplicateCharacters(str);
	}

	public static void findDuplicateCharacters(String str) {
		boolean isDuplicateFound = false;
		char[] strChars = str.replace(" ", "").toLowerCase().toCharArray();

		// Iterate through strChars, check count and store in maps

		Map<Character, Integer> charCount = new HashMap<Character, Integer>();

		for (char ch : strChars) {

			if (charCount.containsKey(ch)) {

				charCount.put(ch, charCount.get(ch) + 1);
			} else {
				charCount.put(ch, 1);
			}
		}

		for (char ch : charCount.keySet()) {
			if (charCount.get(ch) > 1) {

				System.out.println("Duplicate Character " + ch + " Found with count: " + charCount.get(ch));
				isDuplicateFound = true;
			}

		}
		if (!isDuplicateFound) {
			System.out.println("No Duplicate Character Found !");
		}

	}
}