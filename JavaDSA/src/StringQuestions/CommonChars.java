package StringQuestions;

import java.util.Set;
import java.util.TreeSet;

public class CommonChars {

	/*
	 * 
	 * 
	 * Print Common Characters Between Two Strings 
	 * In Alphabetical Order
	 * 
	 * Input: 
	 * String str1 = "thin sticks";
	   String str2 = "thick bricks";
	 * 
	 * Ouput: [c, h, i, k, s, t]
	 * 
	 */

	public static void main(String[] args) {
		String str1 = "thin sticks";
		String str2 = "thick bricks";
		commonChars(str1, str2);

	}

	// print common characters between two strings in alphabetical order.

	public static void commonChars(String str1, String str2) {

		char[] str1CharArray = str1.replace(" ", "").toCharArray();
		char[] str2CharArray = str2.replace(" ", "").toCharArray();

		Set<Character> str1Set = new TreeSet<Character>();
		Set<Character> str2Set = new TreeSet<Character>();

		for (char ch : str1CharArray) {
			str1Set.add(ch);
		}

		for (char ch : str2CharArray) {
			str2Set.add(ch);
		}

		str1Set.retainAll(str2Set);
		System.out.println("Common characters are: " + str1Set);

	}

}
