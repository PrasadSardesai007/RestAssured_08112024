package recursionbasics;

public class PrintNumbersReverse {

	/**
	 * 
	 * Print numbers starting from 1 to N
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int n = 3;
		printNums(n);

	}

	public static void printNums(int n) {

		if (n == 1) {
			System.out.println(n);
			return;
		}

		printNums(n - 1);
		System.out.println(n);

	}

}
