package recursionbasics;

public class NoOfZeros {
	
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

	static int count = 0;

	public static void findZeros(int num) {

		if (num == 0) {

			return;
		}

		if ((num % 10) == 0) {
			count = count + 1;
		}

		//num = num / 10;

		findZeros(num/10);

	}

	public static void main(String[] args) {
		int num = 30405;
		findZeros(num);
		System.out.println("Number of zeros in given number: " + count);

	}

}
