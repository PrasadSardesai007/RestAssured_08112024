package StringQuestions;

public class NumberOfVowelsConsonant {
	/**
	 * 
	 * 
	 * 
	 * 
	 * Print the number if Vowels and Consonants from
	 * given String
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		String str = "Bread Butter and Bread Jam";
		numberOfVowelsConsonant(str);
		

	}

	public static void numberOfVowelsConsonant(String str) {

		char[] chArray = str.replaceAll(" ", "").toCharArray();

		String vowels = "AaEeIiOoUu";

		int countVowels = 0;
		int countConosonant = 0;

		for (int i = 0; i <= chArray.length - 1; i++) {

			if (vowels.contains(String.valueOf(chArray[i]))) {
				countVowels = countVowels + 1;
			} else {
				countConosonant = countConosonant + 1;
			}

		}

		System.out.println("Total Vowels in given String: " + countVowels);
		System.out.println("Total Consonants in given String: " + countConosonant);

	}

}
