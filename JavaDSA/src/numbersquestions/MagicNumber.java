package numbersquestions;

public class MagicNumber {
	
	/**
	 * 
	 * Check if a given number is a Magic Number
	 * 
	 * e.g. 1234
	 * --> 1+2+3+4=10-->1+0=1
	 * If addition of all digits is coming 1 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int num = 1234;

		if (addNumDigits(num) == 1) {
			System.out.println("Given Number is a Magic Number!");

		} else {
			System.out.println("Given Number is not a Magic Number!");
		}

	}

	public static int addNumDigits(int num) {
		int sum = 0;
		while (num > 0) {

			sum = sum + num % 10;
			num = num / 10;
		}

		if (sum < 9) {
			return sum;
		}

		return addNumDigits(sum);

	}

}
