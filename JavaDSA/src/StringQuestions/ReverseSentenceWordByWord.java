package StringQuestions;

public class ReverseSentenceWordByWord {

	/**
	 * 
	 * 
	 * 
	 * 
	 * Reverse Sentence word by word
	 *
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		String str = "Bread Butter and Bread Maska";

		System.out.println(reverseSentenceWordByWord(str));

	}

	public static String reverseSentenceWordByWord(String str) {

		String[] words = str.split(" ");

		String rev = "";

		for (int i = words.length - 1; i >= 0; i--) {

			rev = rev + words[i];

			if (i != 0) {

				rev = rev + " ";
			}

		}
		return rev;
	}

}
