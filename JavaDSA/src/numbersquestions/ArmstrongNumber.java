package numbersquestions;

public class ArmstrongNumber {

	/**
	 * 
	 * 
	 * Check if given number is an Armstrong number?
	 * 
	 * e.g. 153 --> 1^3 + 5^3 + 3^3= 153
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int num = 151;
		System.out.println(isArmstrong(num));

	}

	public static boolean isArmstrong(int num) {

		int number = num;
		int digit = String.valueOf(num).toCharArray().length;

		int total = 0;

		while (num > 0) {

			int x = num % 10;
			num = num / 10;
			total = total + (int) Math.pow(x, digit);

		}

		return number == total;

	}

}
