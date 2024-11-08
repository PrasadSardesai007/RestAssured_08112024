package recursionbasics;

public class PrintNumbers {

	/**
	 * 
	 * Print numbers starting from N to 1
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int n = 4;
		printNums(n);

	}

	public static void printNums(int n) {

		if (n == 1) {
			System.out.println(n);
			return;
		}

		System.out.println(n);

		printNums(n - 1);

	}

}
