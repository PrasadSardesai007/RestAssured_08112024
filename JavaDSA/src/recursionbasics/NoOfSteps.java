package recursionbasics;

public class NoOfSteps {

	/**
	 * 
	 * Find Number if steps to reduce number to zero
	 * 
	 * 
	 * 
	 * Leetcode
	 * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
	 * 
	 * Easy
	 * 
	 */

	public static void main(String[] args) {
		int num = 1200;
		System.out.println("No of Steps: " + count(num));

	}

	public static int count(int num) {

		return helper(num, 0);

	}

	public static int helper(int num, int steps) {
		if (num == 0) {

			return steps;
		}

		if (num % 2 == 0) {

			return helper(num / 2, steps + 1);

		} else {

			return helper(num - 1, steps + 1);
		}

	}

}
