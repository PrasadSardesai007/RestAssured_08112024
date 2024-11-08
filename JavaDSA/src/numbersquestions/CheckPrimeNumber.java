package numbersquestions;

public class CheckPrimeNumber {
	/**
	 * 
	 * 
	 * 
	 * Check if given number is Prime Number
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int num = 15;
		System.out.println(isPrime(num));

	}

	public static boolean isPrime(int num) {

		if (num <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {

			if (num % i == 0) {
				return false;

			}

		}

		return true;
	}
}
