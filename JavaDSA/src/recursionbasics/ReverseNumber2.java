package recursionbasics;

public class ReverseNumber2 {
	
	/**
	 * 
	 * 
	 * Reverse Number by using recursion 2
	 * 
	 * 
	 * Need revision IMP//
	 * 
	 */

	public static void main(String[] args) {

		System.out.println(reverse(1234));

	}

	public static int reverse(int n) {

		int digit = (int) (Math.log10(n)) + 1;

		return helper(n, digit);

	}

	public static int helper(int n, int digit) {
		if (n % 10 == n) {
			return n;

		}

		int rem = n % 10;
		return (int) (rem * Math.pow(10, digit - 1) + helper(n / 10, digit - 1));

	}

}
