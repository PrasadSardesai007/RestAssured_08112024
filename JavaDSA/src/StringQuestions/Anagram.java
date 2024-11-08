package StringQuestions;

import java.util.Arrays;

public class Anagram {

	/**
	 * 
	 * 
	 * 
	 * Checking whether two Strings are Anagram !
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		String str1 = "Listen";
		String str2 = "Stelin";

		if (isAnagram(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are Anagram");
		} else {
			System.out.println(str1 + " and " + str2 + " are not Anagram");
		}

	}

	public static boolean isAnagram(String str1, String str2) {

		if (str1.length() != str2.length()) {

			return false;
		}

		// lowercase the strings
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// Convert sting into arrays
		char[] str1Array = str1.toCharArray();
		char[] str2Array = str2.toCharArray();

		// sort both character arrays
		Arrays.sort(str1Array);
		Arrays.sort(str2Array);

		return Arrays.equals(str1Array, str2Array);

	}

}
