package StringQuestions;

import java.util.HashMap;
import java.util.Map;

public class FindNoOfOccurencesOfAllChars {
	/**
	 * 
	 * 
	 * Find No of Occurences of each Character
	 * 
	 * 
	 */
	public static void main(String[] args) {

		String str = "Prasad Sardesai";
		checkOccurencesOfEachCharacters(str);

	}

	public static void checkOccurencesOfEachCharacters(String str) {

		char[] strArray = str.toLowerCase().toCharArray();

		Map<Character, Integer> charCount = new HashMap<Character, Integer>();

		for (char ch : strArray) {

			if (charCount.containsKey(ch)) {
				charCount.put(ch, charCount.get(ch) + 1);

			} else {

				charCount.put(ch, 1);

			}

		}

		for (char ch : charCount.keySet()) {

			System.out.println("Character " + ch + " : " + charCount.get(ch));
		}

	}

}
