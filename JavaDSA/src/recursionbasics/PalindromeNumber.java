package recursionbasics;

public class PalindromeNumber {
	
	
	/**
	 * 
	 * 
	 * Check if given number is palindrome
	 * 
	 * 
	 * 
	 * 
	 */

	static int sum = 0;

	public static void reverse(int num) {

		if (num == 0) {

			return;
		}

		sum = sum * 10 + num % 10;

		num = num / 10;

		reverse(num);

	}

	public static boolean isPalindrome(int num) {
		reverse(num);
		return num == sum;

	}

	public static void main(String[] args) {

		int num=1212;
		
		System.out.println(isPalindrome(num));
		
		
	}

}
