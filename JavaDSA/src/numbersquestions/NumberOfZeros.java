package numbersquestions;

public class NumberOfZeros {
	
	
	/**
	 * 
	 * 
	 * Find the number of Zeros in given Number
	 * 
	 * 
	 * e.g. 104002 ---> answer is 3
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int num = 30040120;

		System.out.println("No of zeros in given number: " + findZeros(num));

	}

	public static int findZeros(int num) {

		int count = 0;

		while (num > 0) {

			if (num % 10 == 0) {
				count = count + 1;

			}

			num = num / 10;

		}

		return count;

	}

}
