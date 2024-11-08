package StringQuestions;

public class CheckPalindrome {
	/**
	 * 
	 * 
	 * To Check if given String is Palindrome?!
	 * 
	 * 
	 */

	public static void main(String[] args) {
		String str = "abcba";

		if (isPalindrome(str)) {
			System.out.println("Given String is Palindrome !");
		} else {
			System.out.println("Given String is not a Palindrome !");
		}

	}

	public static boolean isPalindrome(String str) {
		if (str.equalsIgnoreCase(reverseString(str))) {

			return true;
		}

		return false;

	}

	public static String reverseString(String str) {

		return new StringBuilder(str).reverse().toString();

	}

}
