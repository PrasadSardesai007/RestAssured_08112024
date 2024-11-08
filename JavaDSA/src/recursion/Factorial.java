package recursion;

public class Factorial {
	
	/**
	 * 
	 * Find Factorial Value of given number
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int num = -12;
		System.out.println(factorial(num));

	}

	public static int factorial(int num) {

		if (num == 0 || num == 1) {

			return 1;
		}

		if (num < 0) {
			return -1;
		}

		return num * factorial(num - 1);

	}

}
