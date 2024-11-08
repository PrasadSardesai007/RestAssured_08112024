package StringQuestions;

public class ReverseVowels {

	/**
	 * 
	 * 
	 * Reverse Vowels of a String
	 * 
	 * Input:IcecreAm Output:AcecreIm
	 * 
	 * https://leetcode.com/problems/reverse-vowels-of-a-string/description/
	 * 
	 * LeetCode (Easy)
	 * 
	 */
	public static void main(String[] args) {

		String str = "IcecreAm";

		System.out.println(reverseVowels(str));

	}

	public static String reverseVowels(String str) {

		char[] ch = str.toCharArray();
		char[] revArray = str.replaceAll("[AaEeIiOoUu]", " ").toCharArray();
		String vowels = "AaEeIiOoUu";

		for (int i = ch.length - 1; i >= 0; i--) {
			if (vowels.contains(String.valueOf(ch[i]))) {

				for (int j = 0; j <= revArray.length - 1; j++) {

					if (revArray[j] == ' ') {
						revArray[j] = ch[i];
						break;
					}

				}

			}

		}
		return String.valueOf(revArray);
	}

}
