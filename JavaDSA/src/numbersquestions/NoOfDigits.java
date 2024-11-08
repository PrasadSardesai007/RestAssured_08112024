package numbersquestions;

public class NoOfDigits {
	/**
	 * 
	 * 
	 * 
	 * Find the number of digits of given number 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int num = 12345;
		System.out.println("Total Number of digits: " + noOfDigits1(num));
		System.out.println("Total Number of digits: " + noOfDigits2(num));

	}

	public static int noOfDigits1(int num) {

		int noOfDigits = 0;

		while (num > 0) {

			num = num / 10;
			noOfDigits = noOfDigits + 1;

		}
		return noOfDigits;

	}

	public static int noOfDigits2(int num) {
		return String.valueOf(num).toCharArray().length;

	}

}
