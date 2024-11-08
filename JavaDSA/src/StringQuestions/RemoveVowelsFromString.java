package StringQuestions;

public class RemoveVowelsFromString {

	/**
	 * 
	 * 
	 * 
	 * Remove vowels from given String
	 * 
	 * Input:Indian 
	 * Output:ndn
	 * 
	 * 
	 */

	public static void main(String[] args) {
		String str = "Indian";

		System.out.println(removeVowels(str));

	}

	public static String removeVowels(String str) {

		return str.replaceAll("[AEIOUaeiou]", "");

	}

}
