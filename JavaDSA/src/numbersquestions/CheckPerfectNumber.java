package numbersquestions;

public class CheckPerfectNumber {

	/**
	 * 
	 * Check if a given number is a perfect number
	 * 
	 * 
	 * Perfect number? e.g. 6 1, 2 & 3 are proper divisor of 6 && 1+2+3=6
	 * 
	 * e.g.28
	 * 
	 * 1,2,4,7,14 ---> 1+2+4+7+14=28
	 * 
	 */

	public static void main(String[] args) {
		int num = 28;

		System.out.println(isPerfectNumber(num));

	}

	public static boolean isPerfectNumber(int num) {

		if (num < 1) {

			return false;
		}

		int sum = 0;

		for (int i = 1; i <= num / 2; i++) {

			if (num % i == 0) {

				sum = sum + i;

			}

		}

		if (num == sum) {
			return true;

		} else {
			return false;
		}

	}

}
