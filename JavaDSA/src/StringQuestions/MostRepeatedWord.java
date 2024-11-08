package StringQuestions;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedWord {
	/**
	 * 
	 * 
	 * Most repeated word in String
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		String str = "Bread Butter and Bread Maska";

		System.out.println(mostRepeatedWord(str));

	}

	public static String mostRepeatedWord(String str) {

		String[] words = str.split(" ");
		int count = 0;
		String mostRepeatedWord = "";

		Map<String, Integer> wordCount = new HashMap<String, Integer>();

		for (String word : words) {

			if (wordCount.containsKey(word.toLowerCase())) {

				wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase()) + 1);

			} else {

				wordCount.put(word.toLowerCase(), 1);
			}

		}

		for (String word : wordCount.keySet()) {

			if (count < wordCount.get(word)) {
				count = wordCount.get(word);
				mostRepeatedWord = word;
			}

		}

		return mostRepeatedWord;

	}

}
