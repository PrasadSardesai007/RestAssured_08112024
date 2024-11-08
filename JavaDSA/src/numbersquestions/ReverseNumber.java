package numbersquestions;

public class ReverseNumber {
	
	/**
	 * 
	 * 
	 * Reverse a number
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int num = 4321;

		System.out.println(reverse(num));

	}

	public static int reverse(int num) {

		String number = String.valueOf(num);

		return Integer.valueOf(new StringBuilder(number).reverse().toString());

	}

}
