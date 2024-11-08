package StringQuestions;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {
	
	/**
	 * 
	 * Remove Duplicate word from String
	 * Input: Bread Butter and Bread Jam
	 * Output:Bread Butter and Jam
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		String str = "Bread Butter and Bread Jam";

		System.out.println(removeDuplicateWords(str));

	}

	public static String removeDuplicateWords(String str) {

		Set<String> words = new LinkedHashSet<String>();

		StringBuilder strBuilder = new StringBuilder();

		for (String word : str.split(" ")) {

			words.add(word);
		}

		for (String word : words) {
			strBuilder.append(word);
			strBuilder.append(" ");

		}

		return strBuilder.toString().trim();

	}
}
