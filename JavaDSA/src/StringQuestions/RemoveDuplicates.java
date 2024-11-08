package StringQuestions;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	/**
	 * 
	 * 
	 * Remove duplicate characters from String
	 * 
	 * Input: programming
	 * Output:progamin
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		String str = "programming";
		System.out.println(removeDuplicates(str));

	}

	public static String removeDuplicates(String str) {

		StringBuilder ans = new StringBuilder();

		Set<Character> set = new LinkedHashSet<Character>();

		for (char ch : str.toLowerCase().toCharArray()) {
			set.add(ch);
		}

		for (char ch : set) {

			ans.append(ch);

		}

		return ans.toString();

	}

}
