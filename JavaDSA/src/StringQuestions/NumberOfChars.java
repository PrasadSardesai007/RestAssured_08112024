package StringQuestions;

public class NumberOfChars {
	/**
	 * 
	 * 
	 * 
	 * 
	 * Print the number if Vowels, Consonants and 
	 * Spaces from String
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		String str = "Bread Butter and Bread Jam";
		numberOfChars(str);

	}

	public static void numberOfChars(String str) {

		char[] strArray = str.toCharArray();

		int vowelsCount = 0;
		int consonentsCount = 0;
		int spacesCount = 0;
		String vowels = "AaEeIiOoUu";

		for (int i = 0; i <= strArray.length - 1; i++) {

			if (vowels.contains(String.valueOf(strArray[i]))) {
				vowelsCount = vowelsCount + 1;

			} else if (strArray[i] == ' ') {
				spacesCount = spacesCount + 1;
			} else {

				consonentsCount = consonentsCount + 1;
			}

		}

		System.out.println("Vowels Count is: " + vowelsCount);
		System.out.println("spaces Count is: " + spacesCount);
		System.out.println("consonents Count is: " + consonentsCount);

	}
}
