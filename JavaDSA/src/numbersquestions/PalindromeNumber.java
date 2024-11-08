package numbersquestions;

public class PalindromeNumber {

	/**
	 * 
	 * 
	 * Check Palindrome Number
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int num = 12321;
		System.out.println(isPalindrome(num));

	}

	public static boolean isPalindrome(int num) {

		String str = String.valueOf(num);

		int start = 0;
		int end = str.length() - 1;

		while (start < end) {

			if (str.charAt(start) != str.charAt(end)) {
				return false;

			}

			start++;
			end--;

		}

		return true;

	}

}
