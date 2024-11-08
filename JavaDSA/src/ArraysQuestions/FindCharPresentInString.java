package ArraysQuestions;

public class FindCharPresentInString {
	/**
	 * 
	 * Check if given character is present in a String ?
	 * 
	 * 
	 * Linear Search
	 * 
	 */

	public static void main(String[] args) {

		String str = "Prasad";

		char ch = 's';
		
		System.out.println(isCharPresent(str, ch));

	}

	public static boolean isCharPresent(String str, char ch) {

		for (int i = 0; i <= str.length(); i++) {

			if (ch == str.charAt(i)) {

				return true;
			}

		}

		return false;

	}

}
